package activity.utilidades;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

import org.apache.log4j.Logger;

/** Clase con metodos de utilidad compartidos en varios servicios
 * @author m.moscoso.sanchez
 *
 */
public final class Util {
	private static final Logger LOGGER = Logger.getLogger(Util.class.getName());
	public static final String NOMBRE_FICHERO = "global.properties";
	
	private Util() {}
	
	/** Metodo que carga el fichero global.properties
	 * @return
	 */
	public static Properties loadProperties(){
    	Properties prop = new Properties();
    	InputStream in = null;
    	try {
    		// recuperar el fichero de propiedades de la misma ruta donde se deja el desplegable
    		Path currentRelativePath = Paths.get("");
    		//TODO Para pruebas en debug
    		//String currentPath = currentRelativePath.toAbsolutePath().getParent().getParent().toString();
    		String currentPath = currentRelativePath.toAbsolutePath().toString();

    		//TODO Para pruebas en debug
    		//in = new FileInputStream(currentPath + File.separator + "config" + File.separator + NOMBRE_FICHERO);
    		in = new FileInputStream(currentPath + File.separator + File.separator + NOMBRE_FICHERO);
    		prop.load(in);
    		in.close();
    	} catch (IOException e) {
    		LOGGER.error("Util -> loadProperties", e);
    	} finally {
    		try {
    			if (in != null) {
    				in.close();
    			}
    		} catch (IOException e) {
    			LOGGER.error("Util -> Could not close in stream", e);
    		}
    	}
    	return prop;
    }
	
	public static Properties loadProperties(String nombreArchivo){
    	Properties prop = new Properties();
    	InputStream in = null;
    	try {
    		// recuperar el fichero de propiedades de la misma ruta donde se deja el desplegable
    		Path currentRelativePath = Paths.get("");
    		//TODO Para pruebas en debug
    		//String currentPath = currentRelativePath.toAbsolutePath().getParent().getParent().toString();
    		String currentPath = currentRelativePath.toAbsolutePath().toString();
//    		String currentPath  ="";
    		//TODO Para pruebas en debug
    		//in = new FileInputStream(currentPath + File.separator + "config" + File.separator + NOMBRE_FICHERO);
    		in = new FileInputStream(currentPath + File.separator + File.separator + nombreArchivo);
    		prop.load(in);
    		in.close();
    	} catch (IOException e) {
    		LOGGER.error("Util -> loadProperties", e);
    	} finally {
    		try {
    			if (in != null) {
    				in.close();
    			}
    		} catch (IOException e) {
    			LOGGER.error("Util -> Could not close in stream", e);
    		}
    	}
    	return prop;
    }
	
	public static Properties loadPropertiesAbsolutePath(String absolutePath){
    	Properties prop = new Properties();
    	InputStream in = null;
    	try {
    		in = new FileInputStream(absolutePath);
    		prop.load(in);
    		in.close();
    	} catch (IOException e) {
    		LOGGER.error("Util -> loadProperties", e);
    	} finally {
    		try {
    			if (in != null) {
    				in.close();
    			}
    		} catch (IOException e) {
    			LOGGER.error("Util -> Could not close in stream", e);
    		}
    	}
    	return prop;
    }
}