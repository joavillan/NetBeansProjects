package gnf.moma.gendocumentfiles;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.gasnaturalfenosa.message_types.gendocumentumfiles.GenDocumentumFilesRequest;

import gnf.moma.gendocument.utilidades.Constantes;
import gnf.moma.gendocument.utilidades.MomaServicesUtil;
import gnf.moma.gendocument.utilidades.XMLGenerator;
import gnf.moma.gendocumentfiles.common.IdentificationRequest;


@Transactional
@Service("fileService")
public class FileServiceImpl implements FileService {

	private static final Logger LOGGER = Logger.getLogger(FileServiceImpl.class);
	
	
	@Override
	public boolean genIdxDocumentumFirma(IdentificationRequest identificationRequest,GenDocumentumFilesRequest request) {

		// Generar XML de firma y guardarlo, asi como el IDX a generar si es que viene adjunta la firma
		String idxGenerado = null;
		Properties prop = loadProperties();
		final String ruta = prop.getProperty("gnf.ruta.osfc");
		
		try {
			if(request.getFirma() != null && request.getFirma().getDocBase64() != null){

				DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
				factory.setNamespaceAware(true);
				DocumentBuilder builder;
				builder = factory.newDocumentBuilder();

				Document document = builder.parse(new ByteArrayInputStream(request.getFirma().getDocBase64()));			

				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				DOMSource source = new DOMSource(document);

				ByteArrayOutputStream bos = new ByteArrayOutputStream();
				StreamResult result = new StreamResult(bos);
				transformer.transform(source, result);
				byte[] array = bos.toByteArray();
				
				//Nombre del fichero de firmas (tanto XML como IDX)
    	        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyyMMddhhmmss");
    	        String fechaNombreFichFirma = formatoFecha.format(Calendar.getInstance().getTime());
    	        String nombreFichFirmaXML = request.getNumeroOrden() + "_000001_" + "Biometric_Signature_" + fechaNombreFichFirma + ".xml";
    	        String nombreFichFirmaIDX = request.getNumeroOrden() + "_000001_" + "Biometric_Signature_" + fechaNombreFichFirma + ".idx";
    	        
    	        // generamos el IDX del fichero de firmas adjunto en la peticion
				idxGenerado = XMLGenerator.generarXML(Constantes.RUTA_FICHEROS_IDX,identificationRequest,request,nombreFichFirmaXML, Constantes.MIME_TYPE_FIRMA);
				
				boolean insertadoIdx = MomaServicesUtil.writeFile(ruta, nombreFichFirmaIDX, idxGenerado.getBytes());
				if(!insertadoIdx){
					LOGGER.error("File idx no subido a ruta: " + nombreFichFirmaIDX);		
					return false;
				}
				
				boolean insertadoFile = MomaServicesUtil.writeFile(ruta, nombreFichFirmaXML, array);
				if(!insertadoFile){						
					LOGGER.error("File xml no subido a ruta: " + nombreFichFirmaXML);			
					return false;
				}					
			} else {
				LOGGER.error("Fichero de firma no incluido en la peticion de la actividad: " + request.getNumeroActividad());		
			}
		} catch (TransformerException e) {			
			LOGGER.error("Ruta de destino: " + ruta,e);		
			return false;
		} catch (ParserConfigurationException e) {			
			LOGGER.error("Ruta de destino: " + ruta,e);		
			return false;
		} catch (SAXException e) {
			LOGGER.error("Ruta de destino: " + ruta,e);		
			return false;
		} catch (IOException e) {
			LOGGER.error("Ruta de destino: " + ruta,e);		
			return false;
		}
			
		return true;
	}

	
	private Properties loadProperties(){			
		Properties prop = new Properties();
		InputStream in = null;
		try {
			in = new FileInputStream(Constantes.RUTA_GLOBAL_PROPERTIES);
			prop.load(in);
			in.close();
		} catch (IOException ex) {
			LOGGER.error("FileServiceImpl -> loadProperties", ex);
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				LOGGER.error("FileServiceImpl -> Could not close in stream", e);
			}
		}
		return prop;
	}
}
