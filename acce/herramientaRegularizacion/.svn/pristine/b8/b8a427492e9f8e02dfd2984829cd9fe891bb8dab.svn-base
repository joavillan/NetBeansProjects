package gnf.moma.gendocument.utilidades;

import java.io.ByteArrayOutputStream;
import java.util.Date;
import java.util.regex.Pattern;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.gasnaturalfenosa.message_types.gendocumentumfiles.GenDocumentumFilesRequest;

import activity.utilidades.FormatUtils;
import gnf.moma.gendocumentfiles.common.IdentificationRequest;

public class XMLGenerator {

	private static final Logger LOGGER = Logger.getLogger(XMLGenerator.class);

	public XMLGenerator() {
		super();
	}

	public static String generarXML(String folder, IdentificationRequest identificationRequest,
			GenDocumentumFilesRequest request, String fileName, String mimeType)
					throws TransformerException, ParserConfigurationException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		DOMImplementation implementation = builder.getDOMImplementation();

		Document document = implementation.createDocument(null, "documento", null);
		document.setXmlVersion("1.0");

		// Informar el nombretipo de acuerdo al mimeType
		String extensionFichero = extraerExtensionDelNombreFichero(fileName);
		String nombreTipo = "";
		if (mimeType.equals(Constantes.MIME_TYPE_FIRMA_JPG) || mimeType.equals(Constantes.MIME_TYPE_FIRMA_PNG)
				|| mimeType.equals(Constantes.MIME_TYPE_FIRMA_GIF)) {
			nombreTipo = Constantes.DOCUMENTUM_TIPO_DOCUMENTAL_IMAGEN;
		} else if (mimeType.equals(Constantes.MIME_TYPE_FIRMA)) {
			nombreTipo = Constantes.DOCUMENTUM_TIPO_DOCUMENTAL_FIRMA;
		} else {
			nombreTipo = Constantes.DOCUMENTUM_TIPO_DOCUMENTAL_GENERICO;
		}

		// En la ruta de los ficheros incluir la carpeta con el tipo de
		// documento: MOBDOCFIMP01, MOBFOTOIMP01 o MOBDOCOIMP01
		String rutaFicheros = folder + "/" + nombreTipo;

		Element raiz = document.getDocumentElement();
		raiz.setAttribute("xmlns:param", "http://www.ismobile.com/files/public/coordinator/2004/");
		raiz.setAttribute("xmlns:coord", "http://www.ismobile.com/coordinator/2006/operations/");
		raiz.setAttribute("xmlns:date", "http://exslt.org/dates-and-times");
		raiz.setAttribute("encoding", "UTF-8");
		raiz.setAttribute("folder", rutaFicheros);
		raiz.setAttribute("formatofecha", "dd/MM/yyyy hh:mi:ss");
		raiz.setAttribute("nombreacl", Constantes.NOMBRE_ACLARADOR);
		raiz.setAttribute("nombrefichero", fileName);
		raiz.setAttribute("nombretipo", nombreTipo);

		// Llamar a la funcion que informa los atributos del fichero IDX de
		// acuerdo tambien con el tipo de documento que se genera (firma,
		// imagen, generico)
		createAtributosElement(identificationRequest, request, document, raiz, fileName, extensionFichero, nombreTipo);

		Source source = new DOMSource(document);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		Result result = new StreamResult(out);
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		transformer.transform(source, result);
		return out.toString();
	}

	private static String extraerExtensionDelNombreFichero(String fileName) {
		if (fileName.contains(".")) {
			String[] partesNombre = fileName.split(Pattern.quote("."));
			if (partesNombre[partesNombre.length - 1].equals(Constantes.EXTENSION_FIRMA)) {
				return Constantes.EXT_DOCUMENT_DIGITAL_FIRMADO;
			} else {
				return partesNombre[partesNombre.length - 1].toUpperCase();
			}
		} else {
			return "";
		}
	}

	/**
	 * M�todo que crea etiquetas xml con siguiente formato
	 * <property> <label>label</label> <value>value</value> </property>
	 * 
	 *
	 * @author manuel.molero
	 *
	 * @param identificationRequest
	 * @param request
	 * @param document
	 * @param raiz
	 * @param fileName
	 * @return
	 */
	private static void createAtributosElement(IdentificationRequest identificationRequest,
			GenDocumentumFilesRequest request, Document document, Element raiz, String fileName,
			String extensionFichero, String nombreTipo) {
		Element elementAtributos = document.createElement("atributos");

		if (nombreTipo.equals(Constantes.DOCUMENTUM_TIPO_DOCUMENTAL_IMAGEN)) {
			createAtributo("TIPO_IMAGEN", extensionFichero, document, elementAtributos);
		} else {
			createAtributo("TIPO_DOCUMENTO", extensionFichero, document, elementAtributos);
		}
		String fechaFormatoNow = FormatUtils.parseAsString(new Date(), Constantes.FORMATO_FECHA_IDX);

		// Decodificar el sector
		String sectorDescripcion = Constantes.SECTOR_DESC_GAS;
		if (identificationRequest.getSectorCode().equals("1")) {
			sectorDescripcion = Constantes.SECTOR_DESC_ELECTRICIDAD;
		}
		
		// Informar VALIDEZ_CSV a 2 si en el request el getResultadoCSV viene a 0 
		// y a 3 si es que viene 1 (que significa que no coinciden el csv del sevidor con el cliente)
		String validezCSV = request.getFirma().getResultadoCSV();
		if ("0".equals(validezCSV)) {
			validezCSV = "2";
		} else if ("1".equals(validezCSV)) {
			validezCSV = "3";
		}

		// Parsear las distintas fechas del IDX al formato especificado
		String fechaFinalizacion = FormatUtils.convertirFechaAFormato(request.getFechaFinalizacion(), Constantes.FORMATO_FECHA_IDX);
		String fechaCreacion = FormatUtils.convertirFechaAFormato(request.getFechaCreacion(), Constantes.FORMATO_FECHA_IDX);
		String fechaEjecucion = FormatUtils.convertirFechaAFormato(request.getFechaEjecucion(), Constantes.FORMATO_FECHA_IDX);
		String fechaFirma = FormatUtils.convertirFechaAFormato(request.getFirma().getFechaFirma(), Constantes.FORMATO_FECHA_IDX);
		
		createAtributo("NUM_ORDEN", request.getNumeroOrden(), document, elementAtributos);
		createAtributo("ORIGEN", "ZEUS", document, elementAtributos);
		createAtributo("PAIS", identificationRequest.getCountryCode(), document, elementAtributos);
		createAtributo("IDIOMA_DOCUMENTO", request.getCliente().getIdioma(), document, elementAtributos);
		createAtributo("SECTOR", sectorDescripcion, document, elementAtributos);
		createAtributo("TIPOLOGIA", request.getCodigoOperacion(), document, elementAtributos);
		createAtributo("TIPO_OPERACION", request.getTipoOrden(), document, elementAtributos);
		createAtributo("NRO_DOCUMENTO", request.getCliente().getNumeroDocumento(), document, elementAtributos);
		createAtributo("NOMBRE_CLIENTE", request.getCliente().getNombre(), document, elementAtributos);
		createAtributo("ID_CLIENTE", request.getCliente().getId(), document, elementAtributos);
		if (!StringUtils.isEmpty(fechaFinalizacion))
			createAtributo("FECHA_FINALIZACION", fechaFinalizacion, document, elementAtributos);
		if (!StringUtils.isEmpty(fechaCreacion))
			createAtributo("FECHA_CREACION", fechaCreacion, document, elementAtributos);
		if (!StringUtils.isEmpty(fechaEjecucion))
			createAtributo("FECHA_EJECUCION", fechaEjecucion, document, elementAtributos);
		createAtributo("FECHA_PROCESO", fechaFormatoNow, document, elementAtributos);
		if (!StringUtils.isEmpty(fechaFirma))
			createAtributo("FECHA_FIRMA", fechaFirma, document, elementAtributos);
		createAtributo("CODIGO_CONTRATO", request.getNumeroContrato(), document, elementAtributos);
		createAtributo("CUPS", request.getCups(), document, elementAtributos);
		createAtributo("CODIGO_CONEXION", request.getCodigoConexion(), document, elementAtributos);
		createAtributo("RESULTADO_INTERVENCION", request.getRResultadoId(), document, elementAtributos);
		createAtributo("CONTRATA", request.getCodigoUnidadGestora(), document, elementAtributos);

		if (nombreTipo.equals(Constantes.DOCUMENTUM_TIPO_DOCUMENTAL_FIRMA)) {
			String fechaVerifFirmaElec = FormatUtils.convertirFechaAFormato(request.getFirma().getFechaVerifFirmaElec(),
					Constantes.FORMATO_FECHA_IDX);
			String fechaSelladoFirmaElec = FormatUtils.convertirFechaAFormato(request.getFirma().getFechaSelladoFirmaElec(),
					Constantes.FORMATO_FECHA_IDX);
			String fechaUltimoSello = FormatUtils.convertirFechaAFormato(request.getFirma().getFechaUltSello(),
					Constantes.FORMATO_FECHA_IDX);
			String fechaVencSello = FormatUtils.convertirFechaAFormato(request.getFirma().getFechaVencSello(),
					Constantes.FORMATO_FECHA_IDX);
			String fechaIniValLegal = FormatUtils.convertirFechaAFormato(request.getFirma().getFechaIniValLegal(),
					Constantes.FORMATO_FECHA_IDX);
			String fechaFinValLegal = FormatUtils.convertirFechaAFormato(request.getFirma().getFechaFinValLegal(),
					Constantes.FORMATO_FECHA_IDX);
			String fechaIniValCert = FormatUtils.convertirFechaAFormato(request.getFirma().getFechaIniValCert(),
					Constantes.FORMATO_FECHA_IDX);
			String fechaFinValCert = FormatUtils.convertirFechaAFormato(request.getFirma().getFechaFinValCert(),
					Constantes.FORMATO_FECHA_IDX);
			
			if (!StringUtils.isEmpty(fechaVerifFirmaElec))
				createAtributo("FECHA_VERIF_FIRMA_ELEC", fechaVerifFirmaElec, document, elementAtributos);
			if (!StringUtils.isEmpty(fechaSelladoFirmaElec))
				createAtributo("FECHA_SELLADO_FIRMA_ELEC", fechaSelladoFirmaElec, document, elementAtributos);
			if (!StringUtils.isEmpty(fechaUltimoSello))
				createAtributo("FECHA_ULT_SELLO", fechaUltimoSello, document, elementAtributos);
			if (!StringUtils.isEmpty(fechaVencSello))
				createAtributo("FECHA_VENC_SELLO", fechaVencSello, document, elementAtributos);
			createAtributo("CSV", request.getFirma().getCsvDispositivo(), document, elementAtributos);
			createAtributo("CSV_CALCULADO", request.getFirma().getCsvSevidor(), document, elementAtributos);
			if (!StringUtils.isEmpty(fechaIniValLegal))
				createAtributo("FECHA_INI_VAL_LEGAL", fechaIniValLegal, document, elementAtributos);
			if (!StringUtils.isEmpty(fechaFinValLegal))
				createAtributo("FECHA_FIN_VAL_LEGAL", fechaFinValLegal, document, elementAtributos);
			if (!StringUtils.isEmpty(fechaIniValCert))
				createAtributo("FECHA_INI_VAL_CERT", fechaIniValCert, document, elementAtributos);
			if (!StringUtils.isEmpty(fechaFinValCert))
				createAtributo("FECHA_FIN_VAL_CERT", fechaFinValCert, document, elementAtributos);
			createAtributo("VALIDEZ_PROCESO_FIRMA", request.getFirma().getValidezProcesoFirma(), document,
					elementAtributos);
			createAtributo("VALIDEZ_CERTIFICADO_GNF", request.getFirma().getValidezCertificadoGNF(), document,
					elementAtributos);
			createAtributo("MSJ_ERROR_CERTIFICADO_GNF", request.getFirma().getMensajeErrorCertificadoGNF(), document, 
					elementAtributos);
			// Informamos VALIDEZ_FIRMA_CLIENTE con el mismo valor que VALIDEZ_FIRMA_OPERARIO
			createAtributo("VALIDEZ_FIRMA_CLIENTE", request.getFirma().getResultadoFirmaOperario(), document,
					elementAtributos);
			createAtributo("MSJ_ERROR_FIRMA_CLIENTE", request.getFirma().getMensajeErrorFirmaCliente(), document,
					elementAtributos);
			createAtributo("VALIDEZ_FIRMA_OPERARIO", request.getFirma().getResultadoFirmaOperario(), document,
					elementAtributos);
			createAtributo("MSJ_ERROR_FIRMA_OPERARIO", request.getFirma().getMensajeErrorFirmaOperario(), document,
					elementAtributos);
			createAtributo("VALIDEZ_FIRMA_INSTALADOR", request.getFirma().getResultadoFirmaInstalador(), document,
					elementAtributos);
			createAtributo("MSJ_ERROR_FIRMA_INSTALADOR", request.getFirma().getMensajeErrorFirmaInstalador(), document,
					elementAtributos);
			createAtributo("VALIDEZ_CSV", validezCSV, document, elementAtributos);
			createAtributo("MSJ_ERROR_CSV", request.getFirma().getMensajeErrorCSV(), document, elementAtributos);
			createAtributo("FECHA_ALMACENADO", fechaFormatoNow, document, elementAtributos);
		}

		raiz.appendChild(elementAtributos);
	}

	/**
	 * M�todo que crea etiquetas xml con siguiente formato
	 * <property> <label>nombre</label> <value>valor</value> </property>
	 * 
	 *
	 * @author manuel.molero
	 *
	 * @param document
	 * @param name
	 * @param value
	 * @param elementAtributos
	 * @return
	 */
	private static void createAtributo(String name, String value, Document document, Element elementAtributos) {
		Element atributo = document.createElement("atributo");
		atributo.setAttribute("nombre", name);
		if (value != null && !value.isEmpty()) {
			atributo.setAttribute("valor", value);
		} else {
			atributo.setAttribute("valor", "");
		}
		elementAtributos.appendChild(atributo);
	}

}
