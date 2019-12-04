package gnf.moma.gendocument.utilidades;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.gasnaturalfenosa.message_types.gendocumentumfiles.GenDocumentumFilesRequest;
import com.gasnaturalfenosa.message_types.gendocumentumfiles.GenDocumentumFilesRequest.Cliente;
import com.gasnaturalfenosa.message_types.gendocumentumfiles.GenDocumentumFilesRequest.Ficheros;
import com.gasnaturalfenosa.message_types.gendocumentumfiles.GenDocumentumFilesRequest.Firma;

import gnf.moma.gendocumentfiles.common.IdentificationRequest;
import momatools.gui.tabs.TabFirmaValidada;

public class GeneracionIDX {
	
	private String tipo;
	private String ruta;
	private int otActividad;
	private String csvDispositivo;
	private Boolean informarCSVServidor;
	
	public GeneracionIDX(String tipo, String ruta, int otActividad) {
		this.tipo = tipo;
		this.ruta = ruta;
		this.otActividad = otActividad;
		this.csvDispositivo = "";
		this.informarCSVServidor = false;
	}

	public String generarFicheroIDXdesdeXML() {
		System.out.println("generarFicheroIDXdesdeXML - INICIO -Tipo imagen: "+tipo);

		// Tratar el fichero work_order.xml
		File work_order = new File(ruta + "\\work_order.xml");

		XmlLoaderFinder finder = new XmlLoaderFinder(work_order);
		Document documento = finder.getDocument();

		NodeList nList = documento.getElementsByTagName(documento.getDocumentElement().getNodeName());
		if (nList.item(0).getNodeType() == Node.ELEMENT_NODE) {
			Element eElement = (Element) nList.item(0);
			return generarIDX(eElement);			
		} else {
			return "El XML no está bien construido";
		}
	}
	
	public String generarFicheroIDXdesdeOFSC() {
		System.out.println("generarFicheroIDXdesdeOFSC - INICIO -Tipo imagen: "+tipo);

		if (!"".equals(this.ruta)) {
			// vamos a recuperar la informacion de OFSC
			TabFirmaValidada actividadOFSC = new TabFirmaValidada(null);
			Map<String, String> mapaActividad;
			try {
				mapaActividad = actividadOFSC.invocarActivityOFSC(otActividad);
			} catch (Exception e) {
				e.printStackTrace();
				return "Error en OFSC al recuperar la actividad "+otActividad+"";
			}

			if (mapaActividad.size() != 0)
				return generarIDX(mapaActividad);
			else
				return "La actividad "+otActividad+" no existe en OFSC";
		} else {
			return "Informar la ruta";
		}
	}

	/**
	 * @param eElement
	 * @param tipoIDX
	 * @return
	 */
	private String generarIDX(Object objeto) {
		IdentificationRequest identificationRequest = new IdentificationRequest();
		GenDocumentumFilesRequest request = new GenDocumentumFilesRequest();
		if (objeto instanceof Element) { // Se trata de informacion que viene en el XML de work_order enviado
			identificationRequest = informarIdentificatonRequest((Element)objeto);
			request = informarGenDocumentumFilesRequest((Element)objeto);
		} else if (objeto instanceof HashMap) { // Se trata de informacion que sacamos de OFSC get_activity
			identificationRequest = informarIdentificatonRequest((HashMap)objeto);
			request = informarGenDocumentumFilesRequest((HashMap)objeto);
		}
		
		String idxGenerado = null;
		String fileNameTargetIDX = "";
		String fileNameTarget = "";
		String mimeTypeFichero = "";
		if (tipo.equals("Foto")) {
			// Generar los IDX de las fotos
			Ficheros ficheros = request.getFicheros();
			for (String nombreFichero : ficheros.getNombrePropiedad()) {
				try {
					fileNameTargetIDX = request.getNumeroOrden() + "_" + nombreFichero.split("\\.")[0] + ".idx";
					fileNameTarget = request.getNumeroOrden() + "_" + nombreFichero;
					
					mimeTypeFichero = Constantes.MIME_TYPE_FIRMA_JPG;
					if (nombreFichero.contains("gif"))
						mimeTypeFichero = Constantes.MIME_TYPE_FIRMA_JPG;
					else if (nombreFichero.contains("png"))
						mimeTypeFichero = Constantes.MIME_TYPE_FIRMA_PNG;					
					idxGenerado = XMLGenerator.generarXML(Constantes.RUTA_FICHEROS_IDX,identificationRequest,request,fileNameTarget,mimeTypeFichero);
					
					boolean insertadoIdx = MomaServicesUtil.writeFile(ruta, fileNameTargetIDX, idxGenerado.getBytes());
					if(!insertadoIdx){
						return "Error al generar el IDX de la foto de la orden "+request.getNumeroOrden();
					}
				} catch (TransformerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ParserConfigurationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} else if (tipo.equals("Firma")) {
			// Se trata de la firma
	        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyyMMddhhmmss");
	        String fechaNombreFichFirma = formatoFecha.format(Calendar.getInstance().getTime());
			mimeTypeFichero = Constantes.MIME_TYPE_FIRMA;
			String nombreFichFirmaXML = request.getNumeroOrden() + "_000001_" + "Biometric_Signature_" + fechaNombreFichFirma + ".xml";
	        String nombreFichFirmaIDX = request.getNumeroOrden() + "_000001_" + "Biometric_Signature_" + fechaNombreFichFirma + ".idx";
			try {
				idxGenerado = XMLGenerator.generarXML(Constantes.RUTA_FICHEROS_IDX,identificationRequest,request,nombreFichFirmaXML,mimeTypeFichero);
				
				// Almacenar fichero en ruta
				boolean insertadoIdx = MomaServicesUtil.writeFile(ruta, nombreFichFirmaIDX, idxGenerado.getBytes());
				if(!insertadoIdx){
					return "Error al generar el IDX de la FIRMA de la orden "+request.getNumeroOrden();
				}
			} catch (TransformerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParserConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			try {
				// Abrir fichero que selecciono el usuario
				
				String[] rutaFichero = ruta.split("\\\\");
				String nombreFichero = rutaFichero[rutaFichero.length-1];
				ruta = ruta.replaceAll("\\\\"+nombreFichero, "");
				
//				fileNameTargetIDX = request.getNumeroOrden() + "_" + nombreFichero.split("\\.")[0] + ".idx";
//				fileNameTarget = request.getNumeroOrden() + "_" + nombreFichero;
				
				fileNameTargetIDX = nombreFichero.split("\\.")[0] + ".idx";
				fileNameTarget = nombreFichero;
				
				mimeTypeFichero = "";
				
				idxGenerado = XMLGenerator.generarXML(Constantes.RUTA_FICHEROS_IDX,identificationRequest,request,fileNameTarget,mimeTypeFichero);
				
				boolean insertadoIdx = MomaServicesUtil.writeFile(ruta, fileNameTargetIDX, idxGenerado.getBytes());
				if(!insertadoIdx){
					return "Error al generar el IDX de la foto de la orden "+request.getNumeroOrden();
				}
			} catch (TransformerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParserConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "";
	}

	/**
	 * @param eElement
	 * @return
	 */
	private GenDocumentumFilesRequest informarGenDocumentumFilesRequest(Element eElement) {
		GenDocumentumFilesRequest request = new GenDocumentumFilesRequest();
		request.setNumeroActividad(informarValorDeGetActivity(eElement.getElementsByTagName("id").item(0).getTextContent()));
		request.setNumeroOrden(String.valueOf(otActividad));
		request.setCodigoOperacion(informarValorDeGetActivity(eElement.getElementsByTagName("XA_OPERATION_CODE").item(0).getTextContent()));
		request.setNumeroContrato(informarValorDeGetActivity("")); //TODO 
		request.setCups(informarValorDeGetActivity(eElement.getElementsByTagName("XA_CUPS_NUMBER").item(0).getTextContent()));
		request.setCodigoConexion(informarValorDeGetActivity(eElement.getElementsByTagName("XA_CONNECTION_CODE").item(0).getTextContent())); 
		request.setRResultadoId(informarValorDeGetActivity(eElement.getElementsByTagName("XA_RESULT").item(0).getTextContent()));
		request.setCodigoUnidadGestora(informarValorDeGetActivity(eElement.getElementsByTagName("XA_WORK_GROUP").item(0).getTextContent()));
		if (null != eElement.getElementsByTagName("NS3:tipoOrden") && eElement.getElementsByTagName("NS3:tipoOrden").getLength() != 0) {
			request.setTipoOrden(informarValorDeGetActivity(eElement.getElementsByTagName("NS3:tipoOrden").item(0).getTextContent())); // N3
			request.setFechaFinalizacion(informarValorDeGetActivity(eElement.getElementsByTagName("NS3:fechaFinalizacion").item(0).getTextContent())); // N3
			request.setFechaCreacion(informarValorDeGetActivity(eElement.getElementsByTagName("NS3:fechaCreacion").item(0).getTextContent())); // N3
			request.setFechaEjecucion(informarValorDeGetActivity(eElement.getElementsByTagName("NS3:fechaEjecucion").item(0).getTextContent())); // N3
		}
		Cliente cliente = new Cliente();
		cliente.setId(informarValorDeGetActivity("")); //TODO 
		if (null != eElement.getElementsByTagName("NS3:tipoOrden") && eElement.getElementsByTagName("NS3:tipoOrden").getLength() != 0) {
			cliente.setIdioma(informarValorDeGetActivity(eElement.getElementsByTagName("NS3:idioma").item(0).getTextContent())); //N3
		} else {
			cliente.setIdioma(informarValorDeGetActivity(eElement.getElementsByTagName("XA_CUSTOMER_LANGUAGE_RESULT").item(0).getTextContent())); //N3
		}
		cliente.setNombre(informarValorDeGetActivity(eElement.getElementsByTagName("cname").item(0).getTextContent()));
		cliente.setNumeroDocumento(informarValorDeGetActivity(eElement.getElementsByTagName("XA_CUSTOMER_DOC").item(0).getTextContent()));
		request.setCliente(cliente);
		Firma firma = new Firma();
		firma.setCsvDispositivo(this.getCsvDispositivo());
		if (this.getInformarCSVServidor())
			firma.setCsvSevidor(this.getCsvDispositivo());
		// Vamos a informar el resultado de la firma de acuerdo al csv
		if (firma.getCsvDispositivo().equals(firma.getCsvSevidor())) 
			firma.setResultadoCSV("0");
		else 
			firma.setResultadoCSV("1");
		request.setFirma(firma);
		Ficheros ficheros = new Ficheros();

		for(int j=0;j<eElement.getElementsByTagName("file").getLength();j++) {
			ficheros.getNombrePropiedad().add(informarValorDeGetActivity(eElement.getElementsByTagName("file").item(j).getTextContent()));
		}

		request.setFicheros(ficheros);
		return request;
	}

	/**
	 * @param eElement
	 * @return
	 */
	private IdentificationRequest informarIdentificatonRequest(Element eElement) {
		Random randomGenerator = new Random();
		IdentificationRequest identificationRequest = new IdentificationRequest();
		// Informar en los datos del request	
//		identificationRequest.setCountryCode(informarValorDeGetActivity(mapaActividad.get("XA_COUNTRY_CODE"))); //TODO
		identificationRequest.setCountryCode("01");
		identificationRequest.setMessageId(String.valueOf(randomGenerator.nextInt(600000)));
//		identificationRequest.setSectorCode(informarValorDeGetActivity(mapaActividad.get("XA_SECTOR_CODE"))); //TODO
		identificationRequest.setSectorCode("2");
		try {
			XMLGregorianCalendar fecha = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());
			identificationRequest.setTimeStampRequest(fecha); //TODO
		} catch (DatatypeConfigurationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return identificationRequest;
	}

	/**
	 * @param string
	 * @return
	 */
	private String informarValorDeGetActivity(String string) {
		return (string != null)?string:"";
	}
	
	private IdentificationRequest informarIdentificatonRequest(Map<String, String> mapaActividad) {
		// Informar en los datos del request	
		IdentificationRequest identificationRequest = new IdentificationRequest();
		Random randomGenerator = new Random();

		identificationRequest.setCountryCode(informarValorDeGetActivity(mapaActividad.get("XA_COUNTRY_CODE")));
		identificationRequest.setMessageId(String.valueOf(randomGenerator.nextInt(600000)));
		identificationRequest.setSectorCode(informarValorDeGetActivity(mapaActividad.get("XA_SECTOR_CODE")));
		try {
			XMLGregorianCalendar fecha = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());
			identificationRequest.setTimeStampRequest(fecha); //TODO
		} catch (DatatypeConfigurationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return identificationRequest;
	}
		
	private GenDocumentumFilesRequest informarGenDocumentumFilesRequest(Map<String, String> mapaActividad) {
		GenDocumentumFilesRequest request = new GenDocumentumFilesRequest();
		String nombreFichero = ""; // TODO Este es el nombre que viene edel fichero fisico? 1050454_IMG_2016-06-06_10-22-51.jpg 
		String mimeTypeFichero = ""; // TODO Ver el mimetype de OFSC
		
		request.setNumeroActividad(informarValorDeGetActivity(mapaActividad.get("id")));
		request.setNumeroOrden(informarValorDeGetActivity(mapaActividad.get("appt_number")));
		request.setCodigoOperacion(informarValorDeGetActivity(mapaActividad.get("XA_OPERATION_CODE")));
		request.setTipoOrden(informarValorDeGetActivity(mapaActividad.get("XA_SERVICES")));
		request.setNumeroContrato(informarValorDeGetActivity("")); //TODO 
		request.setCups(informarValorDeGetActivity(mapaActividad.get("XA_CUPS_NUMBER")));
		request.setCodigoConexion(informarValorDeGetActivity("")); //TODO 
		request.setRResultadoId(informarValorDeGetActivity(mapaActividad.get("XA_RESULT")));
		request.setCodigoUnidadGestora(informarValorDeGetActivity(mapaActividad.get("XA_WORK_GROUP")));
		request.setFechaFinalizacion(informarValorDeGetActivity(mapaActividad.get("end_time")));
		request.setFechaCreacion(informarValorDeGetActivity(mapaActividad.get("date")));
		request.setFechaEjecucion(informarValorDeGetActivity(mapaActividad.get("start_time")));
		Cliente cliente = new Cliente();
		cliente.setId(informarValorDeGetActivity("")); //TODO 
		cliente.setIdioma(informarValorDeGetActivity(mapaActividad.get("XA_CUSTOMER_LANGUAGE_RESULT"))); //TODO 
		cliente.setNombre(informarValorDeGetActivity(mapaActividad.get("name")));
		cliente.setNumeroDocumento(informarValorDeGetActivity(mapaActividad.get("XA_CUSTOMER_DOC")));
		request.setCliente(cliente);
		Firma firma = new Firma();
		firma.setResultadoCSV("0"); //TODO 
		request.setFirma(firma);
		Ficheros ficheros = new Ficheros();
		for (String atributo : mapaActividad.keySet()) {
			if (atributo.startsWith("XA_ATTACH_IMAGE_")) {
				// los ficheros de OFSC vienen con esta informacion: <value>20160601_120237.jpg, 69K</value>
				ficheros.getNombrePropiedad().add(mapaActividad.get(atributo).split(",")[0]);
			}
		}
		request.setFicheros(ficheros);
		
		return request;
	}

	public String getCsvDispositivo() {
		return csvDispositivo;
	}

	public void setCsvDispositivo(String csvDispositivo) {
		this.csvDispositivo = csvDispositivo;
	}

	public Boolean getInformarCSVServidor() {
		return informarCSVServidor;
	}

	public void setInformarCSVServidor(Boolean informarCSVServidor) {
		this.informarCSVServidor = informarCSVServidor;
	}

}
