package momatools.gui.tabs;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;
import org.datacontract.schemas._2004._07.sealsignbsstypes.ArrayOfBiometricSignatureReference;
import org.datacontract.schemas._2004._07.sealsignbsstypes.BiometricSignatureReference;
import org.datacontract.schemas._2004._07.sealsignbsstypes.BiometricSignatureVerification;
import org.datacontract.schemas._2004._07.sealsigndsstypes.SignatureProfile;
import org.json.JSONArray;
import org.json.JSONObject;
import org.tempuri.BiometricSignatureServiceBasic;
import org.tempuri.GetInfoFromBiometricState;
import org.tempuri.IBiometricSignatureServiceBasic;
import org.tempuri.IBiometricSignatureServiceBasicGetInfoFromBiometricStateSealSignDSSFaultContractFaultFaultMessage;
import org.tempuri.ObjectFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.gasnaturalfenosa.common.IdentificationRequest;
import com.gasnaturalfenosa.common.IdentificationResponse;
import com.gasnaturalfenosa.message_types.gendocumentumfiles.GenDocumentumFilesRequest;
import com.gasnaturalfenosa.message_types.gendocumentumfiles.GenDocumentumFilesRequest.Cliente;
import com.gasnaturalfenosa.message_types.gendocumentumfiles.GenDocumentumFilesRequest.Ficheros;
import com.gasnaturalfenosa.message_types.gendocumentumfiles.GenDocumentumFilesRequest.Firma;
import com.gasnaturalfenosa.message_types.gendocumentumfiles.GenDocumentumFilesResponse;
import com.gasnaturalfenosa.message_types.validatecsv.ValidateCSVRequest;
import com.gasnaturalfenosa.message_types.validatecsv.ValidateCSVResponse;
import com.gasnaturalfenosa.moma.validationcsv.ValidateCSVService_servicePortImpl;

import activity.utilidades.FormatUtils;
import activity.utilidades.Util;
import gnf.moma.gendocument.utilidades.Constantes;
import gnf.moma.gendocumentfiles.GenDocumentumFilesService;
import gnf.moma.gendocumentfiles.ServicePortType;
import gnf.momacon.momaconportal.ofsc.dto.GetResourceElement;
import gnf.momacon.momaconportal.ofsc.dto.GetResourceResponseElement;
import gnf.momacon.momaconportal.ofsc.dto.PropertyElement;
import gnf.momacon.momaconportal.ofsc.servicios.ApiPortType;
import gnf.momacon.momaconportal.ofsc.servicios.ResourceManagementPort;
import gnf.momacon.momaconportal.ofsc.servicios.impl.ResourceManagementService;
import gnf.momacon.momaconportal.toa.activity.dto.ActivityResponse;
import gnf.momacon.momaconportal.toa.activity.dto.GetActivityParameters;
import gnf.momacon.momaconportal.toa.servicios.impl.Activity_Service;
import gnf.sender.init.Entornos;
import gnf.sender.init.NotifyActivity;
import momatools.gui.main.FileUtils;
import momatools.gui.main.GuiUtils;
import oasis.names.tc.dss._1_0.core.schema.AnyType;
import oasis.names.tc.dss._1_0.core.schema.Base64Data;
import oasis.names.tc.dss._1_0.core.schema.ClaimedIdentity;
import oasis.names.tc.dss._1_0.core.schema.DocumentType;
import oasis.names.tc.dss._1_0.core.schema.DocumentWithSignature;
import oasis.names.tc.dss._1_0.core.schema.DssSignPortType;
import oasis.names.tc.dss._1_0.core.schema.DssSignService;
import oasis.names.tc.dss._1_0.core.schema.DssVerifyPortType;
import oasis.names.tc.dss._1_0.core.schema.DssVerifyService;
import oasis.names.tc.dss._1_0.core.schema.InputDocuments;
import oasis.names.tc.dss._1_0.core.schema.ResponseBaseType;
import oasis.names.tc.dss._1_0.core.schema.ReturnUpdatedSignature;
import oasis.names.tc.dss._1_0.core.schema.SignRequest;
import oasis.names.tc.dss._1_0.core.schema.SignResponse;
import oasis.names.tc.dss._1_0.core.schema.UpdatedSignatureType;
import oasis.names.tc.dss._1_0.core.schema.VerifyRequest;
import oasis.names.tc.saml._1_0.assertion.NameIdentifierType;

public class TabFirmaValidada extends TabParents{

	/**
	 * 
	 */
	private static final Logger LOGGER = Logger.getLogger(TabFirmaValidada.class);
	private static final String RUTA_EJECUTABLE = "executables/SyncDigitalSignature.exe";
	private static final long serialVersionUID = 1L;
	protected static final String RUTA_DEFECTO = "C:\\GNF\\";
	//TODO integracion aun no funciona
	private static final Entornos[] ENVIRONMENTS = { Entornos.DESARROLLO, Entornos.PRODUCCION };
	private final JComboBox<Entornos> envCombo = new JComboBox<Entornos>(ENVIRONMENTS);
	protected static final String DEFAULT_TICKET_SUFFIX = "_ticket.html";
	protected static final String DEFAULT_SIGNATURE_SUFFIX = "_DigitalSignature.xml";
	private String previousFolder=null;
	private String user=null;
	private String pwd=null;

	public TabFirmaValidada(JTextArea resultados) {
		super(new GridBagLayout(),resultados);
		initComponents();
		prePopulateFields();
	}

	/**
	 * Creo cada uno de los campos
	 */
	
	@Override
	protected void initComponents() {
		super.initComponents();
		Properties mapUserData = Util.loadPropertiesAbsolutePath("C:\\apps\\HerramientaRegularizacion\\herramientaregularizacion.properties");
		user = mapUserData.getProperty("userGasNat");
		pwd = mapUserData.getProperty("passGasNat");
		final JLabel etiquetaXMLRuta = new JLabel("DigitalSignature.xml");
		final JLabel etiquetaHtmlRuta = new JLabel("ticket.html");
		final JLabel etiquetaOrden = new JLabel("Número de actividad");
		final JLabel etiquetaTecnico = new JLabel("Id del técnico");

		//Text para informar la ruta donde se dejan los ficheros
		final JTextField rutaFicheroXML = new JTextField("");
		//Text para informar la ruta donde se dejan los ficheros
		final JTextField rutaFicheroHTML= new JTextField("");
		// Text para informar el numero de actividad
		final JTextField numeroActividad= new JTextField("");
		// Text para informar el id del tecnico
		final JTextField idTecnico= new JTextField("");
		
		
		
		//Check que indica si no se enviara la peticion, solo se genera el reqquest al WS de gendocument
		final JCheckBox checkNoEnvio = new JCheckBox("No enviar, solo imprimir Request a GenDocument", true);
		checkNoEnvio.setHorizontalTextPosition(SwingConstants.LEFT);
		JButton btnFolder = new JButton("Carpeta...");
		btnFolder.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String folderPath = FileUtils.selectFolder(previousFolder);
				if(folderPath!=null){
					try{
						File folder=new File(folderPath);
						String actividad=folder.getName();
						File digSig=new File(folder,actividad+DEFAULT_SIGNATURE_SUFFIX);
						File ticket=new File(folder,actividad+DEFAULT_TICKET_SUFFIX);
						if(digSig.exists()&&ticket.exists()){
							rutaFicheroXML.setText(digSig.getAbsolutePath());
							rutaFicheroHTML.setText(ticket.getAbsolutePath());
							numeroActividad.setText(actividad);
							Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
					    	StringSelection data = new StringSelection(folder.getAbsolutePath());
					    	previousFolder=folder.getAbsolutePath();
					    	clipboard.setContents(data, data);
						}else{
							LOGGER.error("La carpeta seleccionada no es valida: ");
						}
					}catch (Exception eFolder){
						LOGGER.error("La carpeta seleccionada no es valida: ");
					}
					
				}
			}
		});
		
		JButton btnOFSC = new JButton("Add OFSC...");
		btnOFSC.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				final String rutaEjecutableString = this.getClass().getClassLoader().getResource(RUTA_EJECUTABLE).getPath();
		    	
		        String[] cmd = { rutaEjecutableString};
		        Process p;
				try {
					p = Runtime.getRuntime().exec(cmd);
			        p.waitFor();
				} catch (IOException e1) {
					e1.printStackTrace();
					LOGGER.error("IOException ");
				} catch (InterruptedException e1) {
					e1.printStackTrace();
					LOGGER.error("InterruptedException ");
				}
			}
		});
				
		// Boton para seleccionar el fichero de firma XML
		JButton btnExplorarXML = new JButton("Buscar...");
		btnExplorarXML.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FileUtils.selectFile(rutaFicheroXML, RUTA_DEFECTO, "xml");
			}
		});
		
		// Boton para seleccionar el fichero de firma HTML
		JButton btnExplorarHTML = new JButton("Buscar...");
		btnExplorarHTML.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FileUtils.selectFile(rutaFicheroHTML, RUTA_DEFECTO, "html");
			}
		});

		//Boton generar
		JButton botonFirma = new JButton("Generar Ficheros Firma");
		botonFirma.setBounds(10, 10, 10, 10);
		
		JButton boton2 = new JButton("Generar sendResultToBackend");
		boton2.setBounds(10, 10, 10, 10);
		
		// Colocar los elementos en la ventana
		add(etiquetaXMLRuta, 	GuiUtils.posicionarElemento(5,1,0,0,1,1,		GridBagConstraints.NONE, 		GridBagConstraints.EAST, null));
		add(rutaFicheroXML, 	GuiUtils.posicionarElemento(10,1,1,0,2,1,	GridBagConstraints.HORIZONTAL, 	GridBagConstraints.EAST, null));
		add(btnExplorarXML, 	GuiUtils.posicionarElemento(0,1,3,0,1,1,		GridBagConstraints.HORIZONTAL, 	GridBagConstraints.EAST, new Insets(0, 10, 0, 10)));
		add(btnFolder, 	GuiUtils.posicionarElemento(0,1,4,0,1,1,		GridBagConstraints.HORIZONTAL, 	GridBagConstraints.EAST, new Insets(0, 10, 0, 10)));
		
		
		add(etiquetaHtmlRuta, 	GuiUtils.posicionarElemento(5,1,0,1,1,1,		GridBagConstraints.NONE, 		GridBagConstraints.EAST, null));
		add(rutaFicheroHTML, 	GuiUtils.posicionarElemento(10,1,1,1,2,1,	GridBagConstraints.HORIZONTAL, 	GridBagConstraints.EAST, null));
		add(btnExplorarHTML, 	GuiUtils.posicionarElemento(0,1,3,1,1,1,		GridBagConstraints.HORIZONTAL, 	GridBagConstraints.EAST, new Insets(0, 10, 0, 10)));
		add(btnOFSC, 	GuiUtils.posicionarElemento(0,1,4,1,1,1,		GridBagConstraints.HORIZONTAL, 	GridBagConstraints.EAST, new Insets(0, 10, 0, 10)));		

		
		add(etiquetaOrden, 		GuiUtils.posicionarElemento(5,1,0,2,1,1,		GridBagConstraints.NONE, 	GridBagConstraints.EAST, null));
		add(numeroActividad, 		GuiUtils.posicionarElemento(10,1,1,2,1,1,	GridBagConstraints.HORIZONTAL, 	GridBagConstraints.EAST, null));
		add(etiquetaTecnico, 	GuiUtils.posicionarElemento(5,1,2,2,1,1,		GridBagConstraints.NONE, 	GridBagConstraints.EAST, null));
		add(idTecnico, 			GuiUtils.posicionarElemento(10,1,3,2,1,1,	GridBagConstraints.HORIZONTAL, 	GridBagConstraints.EAST, null));
		
		

		add(checkNoEnvio, 		GuiUtils.posicionarElemento(5,1,0,3,2,1,		GridBagConstraints.NONE, 		GridBagConstraints.EAST, null));
		add(new JLabel("En el entorno de:"), 			GuiUtils.posicionarElemento(5,1,2,3,1,1,		GridBagConstraints.NONE, 		GridBagConstraints.EAST, null));
		add(envCombo, 			GuiUtils.posicionarElemento(5,1,3,3,1,1,		GridBagConstraints.NONE, 		GridBagConstraints.EAST, null));
		add(botonFirma, 				GuiUtils.posicionarElemento(0,1,0,4,2,1,		GridBagConstraints.HORIZONTAL, 	GridBagConstraints.CENTER, new Insets(10, 0, 0, 0)));
		add(boton2, 			GuiUtils.posicionarElemento(0,1,2,4,1,1,		GridBagConstraints.HORIZONTAL, 	GridBagConstraints.CENTER, new Insets(10, 0, 0, 0)));

		boton2.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int numerActividad = 0;
				String mensajeError = "";
				try {
					if (!numeroActividad.getText().isEmpty()) {
						numerActividad = Integer.parseInt(numeroActividad.getText());
						NotifyActivity actividad = new NotifyActivity("", numerActividad);
						String mensaje = actividad.setResultToBackEnd(invocarActivityOFSC(numerActividad));
						resultados.append("\n"+mensaje);
						System.out.println(mensaje);

					} else {
						throw new NullPointerException("Error, informe el número de actividad");

					}
				} catch (Exception e1) {
					// Otra excepcion no controlada
					e1.printStackTrace();
					mensajeError = e1.getMessage();
					if (e1.getMessage().isEmpty())
						mensajeError = e1.toString();
					mensajeError = Exception.class.toString() + mensajeError;
				}
			}
		});
		
		//Acciones del boton
		botonFirma.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String mensajeError = "";
				FileInputStream fileInputStreamReader=null;
				try{
					//Añadir hora de inicio
					resultados.append("\n INICIO || " + FormatUtils.parseAsString(new Date(), Constantes.FORMATO_FECHA_IDX));
					
					// Convertir el fichero generado en Base64
					File ficheroFirmaXML = new File(rutaFicheroXML.getText());
					fileInputStreamReader = new FileInputStream(ficheroFirmaXML);
		            byte[] bytes = new byte[(int)ficheroFirmaXML.length()];
		            fileInputStreamReader.read(bytes);
		            
		            // Convertir el HTML de la firma tambien a base64
		            File ficheroFirmaHTML = new File(rutaFicheroHTML.getText());
					fileInputStreamReader = new FileInputStream(ficheroFirmaHTML);
		            byte[] bytesHtml = new byte[(int)ficheroFirmaHTML.length()];
		            fileInputStreamReader.read(bytesHtml);
		            
		            // Validar de que haya ingresado valores correctos en los campos numero actividad y tecnico
		            int numerActividad = 0;
		            if (numeroActividad.getText().isEmpty()) {
		            	throw new NullPointerException("Error, informe el número de actividad");
		            } else {
		            	numerActividad = Integer.parseInt(numeroActividad.getText());
		            }
		            String codigoTecnico = "";
		            if (idTecnico.getText().isEmpty()) {
		            	throw new NullPointerException("Error, informe el Identificador del técnico");
		            } else {
		            	codigoTecnico = idTecnico.getText();
		            }
		            
		            // Obtener los datos para llamar al servicio BSS para obtener la fecha de la firma
		            HashMap<String, String> listaDatosFirmaBSS = obtenerDatosFirma(bytes);
					
					// Informamos los datos del request
					VerifyRequest firmaSinValidar = new VerifyRequest();
					firmaSinValidar.setProfile("adss:verification:profile:001");
					firmaSinValidar.setRequestID("6b140fb4-e521-3f85-6bab-abe46d40be35");
					AnyType entradasOpcionales = new AnyType();
					
					ClaimedIdentity identidad = new ClaimedIdentity();
					NameIdentifierType nombre = new NameIdentifierType();
					nombre.setValue("Gas-Natural-client");
					identidad.setName(nombre);
					entradasOpcionales.getAny().add(identidad);
							
					// SI este dato se informa mal en SOAPUI da 
					// [Error-42034] Failed to process request - signature enhancement failed
					ReturnUpdatedSignature retFirmaActualizada = new ReturnUpdatedSignature();
					retFirmaActualizada.setType("urn:oasis:names:tc:dss:1.0:profiles:AdES:forms:ES-X-L");
					entradasOpcionales.getAny().add(retFirmaActualizada);
					
					Base64Data base64 = new Base64Data();
					base64.setValue(bytes);
					DocumentType documento = new DocumentType();
					documento.setBase64Data(base64);
					InputDocuments inputDocumentos = new InputDocuments();
					inputDocumentos.getDocumentOrTransformedDataOrDocumentHash().add(documento);
					
					firmaSinValidar.setOptionalInputs(entradasOpcionales);
					firmaSinValidar.setInputDocuments(inputDocumentos);
					
					 // llamamos al servicio de verificacion
					DssVerifyService servVerif = new DssVerifyService();
					DssVerifyPortType servVerifPort = servVerif.getDssPort();
					
					// Llamar al servicio web de verificacion de firmas
					ResponseBaseType fd = servVerifPort.verify(firmaSinValidar);
					
					System.out.println("El resultado fue: "+fd.getResult().getResultMajor());
				if (fd.getResult().getResultMajor().contains("Success") && null == fd.getResult().getResultMessage()) {//TODO	
						// La firma se realizo correctamente, obtener el base64
						resultados.append("\n DssVerifyService -> " + fd.getResult().getResultMajor());
						resultados.append("\n DssVerifyService ->" + fd.getResult().getResultMinor());
						
						// Obtenemos el tag <ns2:Base64Signature> y lo decodificamos
						List<Object> listaSalidas = fd.getOptionalOutputs().getAny();
						JAXBElement<UpdatedSignatureType> elemento = (JAXBElement<UpdatedSignatureType>) listaSalidas.get(2);
						UpdatedSignatureType objetoFirma = elemento.getValue();
						
						DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
						factory.setNamespaceAware(true);
						DocumentBuilder builder;
						builder = factory.newDocumentBuilder();
						Document document = builder.parse(new ByteArrayInputStream(objetoFirma.getSignatureObject().getBase64Signature().getValue()));

						Document document2 = builder.parse(new ByteArrayInputStream(objetoFirma.getSignatureObject().getBase64Signature().getValue()));
						Node nodoSignature = document.importNode(document2.getDocumentElement(), true);

						
						// Aniadimos la estructura ds:Object al final del tag ds:Signature
						Node tagSignature = document.getFirstChild().getLastChild();
							
						// Creamos la nueva estructura de dentro del XML verificado
						Element dsObject = document.createElement("ds:Object");
						Element verifiedDocument = document.createElement("VerifiedDocument");  
						Element verifiedDigitalObject = document.createElement("VerifiedDigitalObject");
						Element documentCSV = document.createElement("DocumentCSV");						
						documentCSV.appendChild(nodoSignature);
						verifiedDigitalObject.appendChild(documentCSV);
						verifiedDocument.appendChild(verifiedDigitalObject);
						dsObject.appendChild(verifiedDocument);
						dsObject.setAttribute("Id", "Object-1");
						tagSignature.appendChild(dsObject);
						
						// Aniadir al XML los TAGS correspomdientes
						byte[] array = decodificarXML(document);
						
						SignRequest requestFirma = new SignRequest();
						requestFirma.setProfile("adss:signing:profile:002");
						entradasOpcionales = new AnyType();
						identidad = new ClaimedIdentity();
						nombre = new NameIdentifierType();
						nombre.setValue("Gas-Natural-client");
						identidad.setName(nombre);
						entradasOpcionales.getAny().add(identidad);
						
						requestFirma.setOptionalInputs(entradasOpcionales);
						
						documento = new DocumentType();
						documento.setBase64XML(array);
						inputDocumentos = new InputDocuments();
						inputDocumentos.getDocumentOrTransformedDataOrDocumentHash().add(documento);
						
						requestFirma.setInputDocuments(inputDocumentos);
						
						// llamamos al servicio de firma
						DssSignService servFirma = new DssSignService();
						DssSignPortType servFirmaPort = servFirma.getDssPort();
						SignResponse respFirma = servFirmaPort.sign(requestFirma);
						
//						escribirXML(requestFirma,false);
						
						if (respFirma.getResult().getResultMajor().contains("Success") && null == respFirma.getResult().getResultMessage()) {
							// La firma se realizo correctamente, obtener el base64
							resultados.append("\n DssSignService -> " + respFirma.getResult().getResultMajor());
							resultados.append("\n DssSignService -> " + respFirma.getResult().getResultMinor());
							
							listaSalidas = respFirma.getOptionalOutputs().getAny();

							DocumentWithSignature docConFirma = (DocumentWithSignature) listaSalidas.get(0);
							
							document = builder.parse(new ByteArrayInputStream(docConFirma.getDocument().getBase64XML()));
							document2 = builder.parse(new ByteArrayInputStream(docConFirma.getDocument().getBase64XML()));
							
							// Mostrar XML devuelto por ADSS firma
							decodificarXML(document);
							
							// Haremos la edicion del documento recuperado por el servicio de firma:
							// 1. Dentro de <ds:Object Id="Object-1"> hay el tag anidado con el mismo nombre <ds:Object Id="Object-1">, eliminarlo
							// 2. Dentro de <ds:Object Id="Object-1"> meter el tag <SignedDocument> dentro de <VerifiedDocument><VerifiedDigitalObject><DocumentCSV>
							// Asi: <ds:Object Id="Object-1"><VerifiedDocument><VerifiedDigitalObject><DocumentCSV><SignedDocument>....
							// 3. Eliminar el hijo <SignedDocument> que esta dentro de <ds:Object Id="Object-1"> ya que lo hemos copiado en el paso anterior
							// Si todos los pasos han ido bien ya tenemos el documento de firma generado.
							
							// Eliminar el <ds:Object Id="Object-1"> anidado
							Node nodo = document.getLastChild().getLastChild().getLastChild().getLastChild().getLastChild();
							document.getLastChild().getLastChild().getLastChild().getLastChild().removeChild(nodo);
							Node nodo2 = document2.getLastChild().getLastChild().getLastChild().getLastChild().getLastChild();
							document2.getLastChild().getLastChild().getLastChild().getLastChild().removeChild(nodo2);
							
							// Mostrar XML con el tag <ds:Object Id="Object-1"> anidado eliminado
							array = decodificarXML(document);
							
							// Recuperamos el tag a introducir dentro de la nueva estructura y lo añadimos
							nodoSignature = document.importNode(document2.getLastChild().getLastChild().getFirstChild(), true);
							verifiedDocument = document.createElement("VerifiedDocument");  
							verifiedDigitalObject = document.createElement("VerifiedDigitalObject");
							documentCSV = document.createElement("DocumentCSV");
							documentCSV.appendChild(nodoSignature);
							verifiedDigitalObject.appendChild(documentCSV);
							verifiedDocument.appendChild(verifiedDigitalObject);
							
							// Añadimos esta nueva estructura y quitamos el tag de la estructura anterior
							document.getLastChild().getLastChild().appendChild(verifiedDocument);
							document.getLastChild().getLastChild().removeChild(document.getLastChild().getLastChild().getFirstChild());

							// Mostrar XML modificado que se enviará a gendocument.
							array = decodificarXML(document);
														
							// Llamar al servicio de Gendocument en desarrollo
							if (!informarRequestGenDocument(numerActividad, array, listaDatosFirmaBSS, bytesHtml, codigoTecnico, checkNoEnvio.isSelected()).equals("0"))
								mensajeError = "Error en GenDocumentumFilesService: No se ha realizado el envío de documentos al servicio";
						} else {
							// Error
							mensajeError = "Error en DssSignService: " + respFirma.getResult().getResultMessage().getValue();
							resultados.append("\n DssSignService -> " + respFirma.getResult().getResultMajor());
							resultados.append("\n DssSignService -> " + respFirma.getResult().getResultMessage().getValue());
						}
					} else {
						// Error
						System.out.println("Erroraso");
						mensajeError = "Error en DssVerifService: " + fd.getResult().getResultMessage().getValue();
						resultados.append("\n DssVerifService -> " + fd.getResult().getResultMajor());
						resultados.append("\n DssVerifService -> " + fd.getResult().getResultMessage().getValue());
					}

				}catch(FileNotFoundException e1){
					e1.printStackTrace();
					mensajeError = e1.getMessage();
					if (e1.getMessage().isEmpty())
						mensajeError = e1.toString();
					mensajeError = FileNotFoundException.class.toString() + mensajeError;
				} catch (ParserConfigurationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					mensajeError = e1.getMessage();
					if (e1.getMessage().isEmpty())
						mensajeError = e1.toString();
					mensajeError = ParserConfigurationException.class.toString() + mensajeError;
				} catch (SAXException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					mensajeError = e1.getMessage();
					if (e1.getMessage().isEmpty())
						mensajeError = e1.toString();
					mensajeError = SAXException.class.toString() + mensajeError;
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					mensajeError = e1.getMessage();
					if (e1.getMessage().isEmpty())
						mensajeError = e1.toString();
					mensajeError = IOException.class.toString() + mensajeError;
				} catch (NullPointerException e1) {
					e1.printStackTrace();
					mensajeError = e1.getMessage();
					if (e1.getMessage().isEmpty())
						mensajeError = e1.toString();
					mensajeError = NullPointerException.class.toString() + mensajeError;
				}catch (NumberFormatException e1) {
					e1.printStackTrace();
					mensajeError = e1.getMessage();
					if (e1.getMessage().isEmpty())
						mensajeError = e1.toString();
					mensajeError = NullPointerException.class.toString() + mensajeError;
				} catch (DatatypeConfigurationException e1) {
					e1.printStackTrace();
					mensajeError = e1.getMessage();
					if (e1.getMessage().isEmpty())
						mensajeError = e1.toString();
					mensajeError = DatatypeConfigurationException.class.toString() + mensajeError;
				} catch (TransformerException e1) {
					e1.printStackTrace();
					mensajeError = e1.getMessage();
					if (e1.getMessage().isEmpty())
						mensajeError = e1.toString();
					mensajeError = TransformerException.class.toString() + mensajeError;
				} catch (Exception e1) {
					// Otra excepcion no controlada
					e1.printStackTrace();
					mensajeError = e1.getMessage();
					if (e1.getMessage().isEmpty())
						mensajeError = e1.toString();
					mensajeError = Exception.class.toString() + mensajeError;
				}
				finally{
					if( fileInputStreamReader!=null){
						try {
							fileInputStreamReader.close();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
				}
				
				if ("".equals(mensajeError))
					JOptionPane.showMessageDialog(null, "Envio a DDMM Realizado correctamente para la actividad "+numeroActividad.getText(), "Fin", JOptionPane.INFORMATION_MESSAGE);
				else {
					System.out.println("El mensaje de error qiyo");
					JOptionPane.showMessageDialog(null, mensajeError, "Error", JOptionPane.ERROR_MESSAGE);
					String fechaFormatoNow = FormatUtils.parseAsString(new Date(), Constantes.FORMATO_FECHA_IDX);
					resultados.append("\n" + fechaFormatoNow + " >>>> " + mensajeError);
				}
				resultados.append("\n FIN actividad " + numeroActividad.getText() + "|| " + FormatUtils.parseAsString(new Date(), Constantes.FORMATO_FECHA_IDX));
			}
		});

	}

	private HashMap<String, String> obtenerDatosFirma(byte[] bytes) {
		// Generamos el DOM a partir del fichero de la firma  sin validar
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		DocumentBuilder builder;
		Document document;
		HashMap<String, String> informacionReqBSS = new HashMap<String, String>();

		try {
			builder = factory.newDocumentBuilder();
			document = builder.parse(new ByteArrayInputStream(bytes));
			
			// Obtenemos los datos para el request
			NodeList bioSignature = document.getElementsByTagName("BioSignature");
			for (int i = 0; i < bioSignature.getLength(); i++) {
				Node item = bioSignature.item(i);
				NamedNodeMap elemento = item.getAttributes();
				for (int j = 0; j < elemento.getLength(); j++) {
					Node elto = elemento.item(j);
					if (elto.getNodeName().equals("IdBioSignature")) {
						informacionReqBSS.put("IdBioSignature"+i, elto.getTextContent());
					}
				}
				NodeList nodosBio = item.getChildNodes();
				for (int j = 0; j < nodosBio.getLength(); j++) {
					Node elto = nodosBio.item(j);
					if (elto.getNodeName().equals("BioSignatureDigitalObject")) {
						informacionReqBSS.put("BioSignatureDigitalObject"+i, elto.getTextContent());
					}
				}
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return informacionReqBSS;
	}
	
	public static void recuperarTagsEnArray(Map<String, String> mapaValores, Node nodes){
		if(nodes.hasChildNodes()  || nodes.getNodeType()!=3){
			mapaValores.put(nodes.getNodeName(), nodes.getTextContent());
			NodeList nl=nodes.getChildNodes();
			for(int j=0;j<nl.getLength();j++)
				recuperarTagsEnArray(mapaValores, nl.item(j));
		}
	}
	
	private String informarRequestGenDocument(int actividad, byte[] array, HashMap<String, String> listaDatosFirmaBSS, byte[] bytes, String codigoTecnico, boolean isSelected) throws Exception {
		// vamos a recuperar la informacion de OFSC
//		UpdateActivity updateActivity = new UpdateActivity(actividad, null);
//		Map<String, String> mapaActividad = updateActivity.getActivity();
		
		Map<String, String> mapaActividad = invocarActivityOFSC(actividad);

		//Informar la cabecera de la peticion al servicio de GenDOcumebnt
		GenDocumentumFilesRequest request = informarGenDocumentumFilesRequest(mapaActividad, array, listaDatosFirmaBSS, bytes, codigoTecnico);
		gnf.moma.gendocumentfiles.common.IdentificationRequest identificationRequest = new gnf.moma.gendocumentfiles.common.IdentificationRequest();
		identificationRequest.setMessageId("5835");
		identificationRequest.setCountryCode("01");
		identificationRequest.setSectorCode("2");
		
		GregorianCalendar gc = new GregorianCalendar();
		XMLGregorianCalendar xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendarDate(
				gc.get(Calendar.YEAR), gc.get(Calendar.MONTH) + 1, gc.get(Calendar.DAY_OF_MONTH),
				DatatypeConstants.FIELD_UNDEFINED);
		identificationRequest.setTimeStampRequest(xmlDate);

		Holder<gnf.moma.gendocumentfiles.common.IdentificationResponse> identificationResponse = new Holder<gnf.moma.gendocumentfiles.common.IdentificationResponse>();
		Holder<GenDocumentumFilesResponse> genDocumentumFilesResponse = new Holder<GenDocumentumFilesResponse>();
		
		// Si se selecciona el check se envia la peticion a gendocument
		if (isSelected) {
			// Solo imprimir la traza en la consola
			escribirXML(request,true);
			return "0";	
		} else {
			//Invocar a GenDocument 
			GenDocumentumFilesService servicio = new GenDocumentumFilesService();
			Class<ServicePortType> serviceEndpointInterface = ServicePortType.class;
			ServicePortType puerto =  servicio.getPort(serviceEndpointInterface);	
		
			puerto.genDocumentumfiles(identificationRequest, request, identificationResponse, genDocumentumFilesResponse);
			resultados.append("\n GenDocumentumFilesService -> " + genDocumentumFilesResponse.value.getResult());
			JOptionPane.showMessageDialog(null, "Envio a DDMM de la actividad "+actividad+" con resultado " + genDocumentumFilesResponse.value.getResult(), "Fin", JOptionPane.INFORMATION_MESSAGE);
			
			return genDocumentumFilesResponse.value.getResult();
		}
	}
	
	public Map<String, String> invocarActivityOFSC(int actividad) throws Exception {
		
		Activity_Service toa = new Activity_Service();
		ApiPortType port = toa.getActivity();

		GetActivityParameters body = new GetActivityParameters();
		body.setActivityId(String.valueOf(actividad));
		System.out.println("El usuario cargado es: "+user);
		System.out.println("La contraseña cargada es: "+pwd);
		System.out.println(body.getActivityId());
		System.err.println(body.getUser());
		ActivityResponse respuesta = port.getActivity(body);
		
		Map<String, String> resultGetActivity = new HashMap<String, String>();
		
		if (respuesta.getResultCode() == 0) {
			// Mapear el resultado del getActivity
			for (gnf.momacon.momaconportal.toa.activity.dto.Property property : respuesta.getActivity().getProperties()) {
				if (property.getName().equals("XA_ACCREDITATIONS_JSON") || 
					property.getName().equals("XA_TICKET_INFO") ||
					property.getName().equals("XA_FULL_RESULTS_JSON")) {

					// Tratar los campos JSON del XML
					JSONObject jsonFullResult = new JSONObject(property.getValue());

					Iterator<?> keys = jsonFullResult.keys();
					String key = "";
					JSONArray jsonArray;
					String keyAparato = "";
					while( keys.hasNext() ) {
					    key = (String)keys.next();
					   
					    // Verificamos si el item recuperado del JSON es instancia de JSONArray
					    if (jsonFullResult.get(key) instanceof JSONArray) {
					    	jsonArray = ((JSONArray)jsonFullResult.get(key));
					    	int count = jsonArray.length();
							
					    	// Iteramos dentro del JSONArray
					    	int i = 0;
					    	for(i=0 ; i< count; i++){
								if (jsonArray.get(i) instanceof JSONObject) {
									JSONObject jsonAparatos = jsonArray.getJSONObject(i);
									
									// Vienen aparatos informados hasta que el numero es "xxx"
									if (!jsonAparatos.get("number").equals("xxx")) {
										Iterator<?> itAparatos = jsonAparatos.keys();
										while(itAparatos.hasNext()) {
											keyAparato = (String)itAparatos.next();
											resultGetActivity.put(keyAparato.toString().trim()+"_"+i, jsonAparatos.get(keyAparato).toString().trim());
											System.out.print(keyAparato.toString().trim() +"_"+i+"="+ jsonAparatos.get(keyAparato).toString().trim()+"\n");
										}
									}
								} else {
									 // Son listas simples, no JSONObject. Hacen referencia a los Attachments o Defectos (anomalias)									
									Object o = jsonArray.get(i);
									    if (!JSONObject.NULL.equals(o)) {																			
										String valorArray = (String) jsonArray.get(i);
										resultGetActivity.put(key+"_"+i, valorArray);
										System.out.print(key+"_"+ i +"="+ valorArray+"\n");										
									}
								}
							}
					    	
					    	//Almacenamos el numero de aparatos recuperados
					    	if (key.equals("aparatos")) 
								resultGetActivity.put(key, String.valueOf(i-1));
					    	else
					    		resultGetActivity.put(key, String.valueOf(i));
							System.out.print(key+"="+ resultGetActivity.get(key)+"\n");
					    } else {
					    	// Se trata de un item simple dentro del JSON
					    	if (!resultGetActivity.containsKey(key)) {
					    		resultGetActivity.put(key.toString().trim(), jsonFullResult.get(key).toString().trim());
					    		System.out.print(key.toString().trim() +"="+ jsonFullResult.get(key).toString().trim()+"\n");
					    	}
					    }
					}
				} else {
					// Se trata de entradas simples, adjuntarlas al map como cadenas atributo/valor
					if (!resultGetActivity.containsKey(property.getName().trim())) {
						resultGetActivity.put(property.getName().trim(), property.getValue().trim());
						System.out.print(property.getName()+"="+ resultGetActivity.get(property.getName())+"\n");
					}
				}
			}
		} else {
			System.out.print("KO en invocarActivityOFSC, resultCode = "+respuesta.getResultCode());
			throw new Exception(respuesta.getErrorMsg());
		}
		
		return resultGetActivity;
	}

	private GenDocumentumFilesRequest informarGenDocumentumFilesRequest(Map<String, String> mapaActividad, byte[] array, HashMap<String, String> listaDatosFirmaBSS, byte[] bytes, String codigoTecnico) {
		GenDocumentumFilesRequest request = new GenDocumentumFilesRequest();
		
		String idioma = "CASTELLANO";
		if (null != mapaActividad.get("XA_CUSTOMER_LANGUAGE")) {
			idioma = mapaActividad.get("XA_CUSTOMER_LANGUAGE");
		}
		if (null != mapaActividad.get("XA_CUSTOMER_LANGUAGE_RESULT") && mapaActividad.get("XA_CUSTOMER_LANGUAGE_RESULT").equals("2"))
			idioma = "CATALÁN";
		
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
		cliente.setIdioma(informarValorDeGetActivity(idioma)); 
		cliente.setNombre(informarValorDeGetActivity(mapaActividad.get("name")));
		cliente.setNumeroDocumento(informarValorDeGetActivity(mapaActividad.get("XA_CUSTOMER_DOC")));
		request.setCliente(cliente);
		Firma firma = new Firma();
		
		// Obtenemos la fecha de hoy
		String fechaHoy = FormatUtils.parseAsString(new Date(), Constantes.FORMATO_FECHA_IDX);
		
		// Añadir 10 años a la fecha
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		c.add(Calendar.YEAR, 10);
		Date newDate = c.getTime();
		String fechaMas10 = FormatUtils.parseAsString(newDate, Constantes.FORMATO_FECHA_IDX);
		
		// calculamos el CSV de la firma
		String csv = obtenerCSV(array);
		firma.setDocBase64(array);
		firma.setFechaFirma(obtenerFechaFirma(listaDatosFirmaBSS, bytes)); // BSS
		firma.setFechaVerifFirmaElec(fechaHoy);
		firma.setFechaSelladoFirmaElec(fechaHoy);
		firma.setCsvDispositivo(csv);
		firma.setCsvSevidor(csv);
		firma.setFechaIniValLegal(fechaHoy);
		firma.setFechaFinValLegal(fechaMas10);
		
		HashMap<String, String> datosTecnico = obtenerDatosTecnico(codigoTecnico);
		
		firma.setFechaIniValCert(datosTecnico.get("XR_CERTIFICATE_START_DATE")); // RMM
		firma.setFechaFinValCert(datosTecnico.get("XR_CERTIFICATE_END_DATE")); // RMM
		firma.setValidezProcesoFirma("2");
		firma.setValidezCertificadoGNF("2");
		firma.setMensajeErrorCertificadoGNF("");
		firma.setResultadoFirmaCliente("2");
		firma.setMensajeErrorFirmaCliente("");
		firma.setResultadoFirmaOperario("2");
		firma.setMensajeErrorFirmaOperario("");
		firma.setResultadoFirmaInstalador("");
		firma.setResultadoCSV("0");
		firma.setMensajeErrorCSV("");
		request.setFirma(firma);

		Ficheros ficheros = new Ficheros();
		List<String> nombrePropiedad = new ArrayList<String>();
 
		for (String atributo : mapaActividad.keySet()) {
			if (atributo.startsWith("XA_ATTACH_IMAGE_")) {
				// los ficheros de OFSC vienen con esta informacion: <value>20160601_120237.jpg, 69K</value>
//				nombrePropiedad.add(mapaActividad.get(atributo).split(",")[0]);
				//recuperaremos los nombres de las prpiedades en lugar de los nombres de los archivos
				nombrePropiedad.add(atributo);
			}
		}
		
		ficheros.setNombrePropiedad(nombrePropiedad);
		request.setFicheros(ficheros);
		
		return request;
	}
	
	private HashMap<String, String> obtenerDatosTecnico(String usuario) {
		ResourceManagementService toa = new ResourceManagementService();
		ResourceManagementPort port = toa.getResourceManagementPort();
		
		HashMap<String, String> fechasTecnico = new HashMap<String, String>();
		
		GetResourceElement params = new GetResourceElement();
		params.setId(usuario);
//		AuthNodeElement user = new AuthNodeElement();
		GetResourceResponseElement respuesta = port.getResource(params);
		
		List<PropertyElement> propiedades = respuesta.getProperties().getProperty();
		for (Iterator<PropertyElement> iterator = propiedades.iterator(); iterator.hasNext();) {
			PropertyElement propertyElement = iterator.next();
			if (propertyElement.getName().equals("XR_CERTIFICATE_END_DATE"))
				fechasTecnico.put("XR_CERTIFICATE_END_DATE", propertyElement.getValue());
			if (propertyElement.getName().equals("XR_CERTIFICATE_START_DATE"))
				fechasTecnico.put("XR_CERTIFICATE_START_DATE", propertyElement.getValue());
		}
		
		resultados.append("\n ResourceManagementService -> " + respuesta.getResultCode() + respuesta.getErrorMsg());
		
		return fechasTecnico;
	}

	private String obtenerFechaFirma(HashMap<String, String> listaDatosFirmaBSS, byte[] bytes) {
		// Invocar al servicio de BSS
		BiometricSignatureServiceBasic servicioBSS = new BiometricSignatureServiceBasic();
		IBiometricSignatureServiceBasic servicio = servicioBSS.getBasicHttpBindingIBiometricSignatureServiceBasic();
		
		ArrayList<String> fechas = new ArrayList<String>();

		// Informamos los datos del usuario para poder invocar al WS
		BindingProvider bindingProviderBSS = (BindingProvider) servicio;
		bindingProviderBSS.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, user);
		bindingProviderBSS.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, pwd );
		
		// Informamos los datos del request
		ObjectFactory fact = new ObjectFactory();
	
		JAXBElement<byte[]> biometricState = null;
		JAXBElement<byte[]> documentoFirma = null;
		String instance = "";

		for (int i = 0; i < listaDatosFirmaBSS.size()/2; i++) {
			instance = listaDatosFirmaBSS.get("IdBioSignature"+i);
			biometricState = fact.createVerifyBiometricState(Base64.decodeBase64(listaDatosFirmaBSS.get("BioSignatureDigitalObject"+i).getBytes()));
			documentoFirma = fact.createVerifyDocument(bytes);
			
			GetInfoFromBiometricState requestBSS = new GetInfoFromBiometricState();
			requestBSS.setBiometricState(biometricState);
			requestBSS.setInstance(instance);
			requestBSS.setDocument(documentoFirma);
			requestBSS.setSignatureProfile(SignatureProfile.DEFAULT);
			
//			escribirXML(requestBSS,false);
			
			BiometricSignatureVerification respuestaBSS = new BiometricSignatureVerification();
			
			
			try {
				respuestaBSS = servicio.getInfoFromBiometricState(requestBSS.getSignatureProfile(), requestBSS.getInstance(), requestBSS.getBiometricState().getValue(), requestBSS.getDocument().getValue());

				if (null != respuestaBSS && respuestaBSS.getResult().value().toString().equals("SignatureFound")) {
					JAXBElement<ArrayOfBiometricSignatureReference> firmasBSS = respuestaBSS.getSignatures();
					ArrayOfBiometricSignatureReference objetoFirma = firmasBSS.getValue();
					BiometricSignatureReference referenciaBSS = objetoFirma.getBiometricSignatureReference().get(0);
					fechas.add(referenciaBSS.getSigningTime().toString());
				}
				
				resultados.append("\n BiometricSignatureVerification -> " + respuestaBSS.getResult().value().toString());
				resultados.append("\n BiometricSignatureVerification -> " + fechas.get(i).toString());
			} catch (IBiometricSignatureServiceBasicGetInfoFromBiometricStateSealSignDSSFaultContractFaultFaultMessage e) {
				LOGGER.error("SealSignDSSFaultContractFaultFaultMessage " + e.getMessage() , e);
			} catch (Exception e2) {
				LOGGER.error("Exception " + e2.getMessage() + "\n" , e2);
			}			
		}		
		return fechas.get(0); // TODO averiguar cual es la fecha que necesitan, de momento estamos retornando la de OPERARIO
	}

	private String obtenerCSV(byte[] array) {
//		String csv = "";
		 
		ValidateCSVService_servicePortImpl servicioValidCSV= new ValidateCSVService_servicePortImpl();
		IdentificationRequest identificationRequest = new IdentificationRequest();
		identificationRequest.setMessageId("5835");
		identificationRequest.setCountryCode("01");
		identificationRequest.setSectorCode("2");
		// Se obtiene la fecha actual y se formatea
		GregorianCalendar gc = new GregorianCalendar();
		try {
			XMLGregorianCalendar xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendarDate(
					gc.get(Calendar.YEAR), gc.get(Calendar.MONTH) + 1, gc.get(Calendar.DAY_OF_MONTH),
					DatatypeConstants.FIELD_UNDEFINED);
			identificationRequest.setTimeStampRequest(xmlDate);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ValidateCSVRequest validationCSVRequest  = new ValidateCSVRequest();
		validationCSVRequest.setFirmaBase64(array);
		
		Holder<IdentificationResponse> identificationResponse = new Holder<IdentificationResponse>();
		Holder<ValidateCSVResponse> validationCSVResponse = new Holder<ValidateCSVResponse>();
		
		servicioValidCSV.validateCSV(identificationRequest, validationCSVRequest, identificationResponse, validationCSVResponse);
		
		return validationCSVResponse.value.getCsvServidor();
	}

	private String informarValorDeGetActivity(String string) {
		return (string != null)?string:"";
	}
	
	private byte[] decodificarXML(Document documento) throws TransformerException {
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer;
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(documento);
		
		StreamResult result = new StreamResult(bos);
		transformer.transform(source, result);
		
		LOGGER.info("----->> decodificarXML - "+documento.toString()+" - INICIO <<-----");
		LOGGER.info(bos.toString());
		LOGGER.info("----->> decodificarXML - "+documento.toString()+" - FIN <<-----");
		
		return bos.toByteArray();
	}

	/**
	 * Cargo aquellos componentes que deban tener un valor por defecto
	 */
	
	@Override
	protected void prePopulateFields() {
		super.prePopulateFields();

	}
	
//	private static void setProxy(Boolean conProxy) {
//		String proxy = "";
//		String port = "";
//		String user = "";
//		String pwd = "";
//		String conProxyStr = conProxy.toString();
//
//		if (conProxy) {
//				proxy = "gnfproxy2010.intranet.gasnatural.com";
//				port = "80";
//				user = "esgasnatural\\90036664";
//				pwd = "abc54321";
//		}
//		
//		System.setProperty("https.proxySet", conProxyStr);
//		System.setProperty("https.proxyHost", proxy);
//		System.setProperty("https.proxyPort", port);
//		System.setProperty("https.proxyUser", user);
//		System.setProperty("https.proxyPassword", pwd);
//		
//	}

	private void escribirXML(Object contenido,boolean volcarFile) {
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(contenido.getClass());
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			StringWriter sw = new StringWriter();
			
			if (contenido instanceof VerifyRequest) 
				marshaller.marshal(contenido, sw);
			else if (contenido instanceof SignRequest)
				marshaller.marshal(contenido, sw);
			else if (contenido instanceof GenDocumentumFilesRequest)
				marshaller.marshal(contenido, sw);
			else if (contenido instanceof GetInfoFromBiometricState)
				marshaller.marshal(contenido, sw);
			else if (contenido instanceof BiometricSignatureVerification)
				marshaller.marshal(contenido, sw);
			
//			resultados.append(sw.toString());
			System.out.println("----->> "+contenido.getClass().toString()+" - INICIO <<-----");
			System.out.println(sw.toString());
			System.out.println("----->> "+contenido.getClass().toString()+" - FIN <<-----");
			if(volcarFile){//por como esta configurado log4j vuelca a archivo
				LOGGER.info("----->> "+contenido.getClass().toString()+" - INICIO <<-----");
				LOGGER.info(sw.toString());
				LOGGER.info("----->> "+contenido.getClass().toString()+" - FIN <<-----");
			}
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
