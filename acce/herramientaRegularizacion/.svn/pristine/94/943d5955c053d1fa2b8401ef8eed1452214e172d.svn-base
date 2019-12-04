package gnf.sender.init;

/**
 * Clase de enumeracion con los archivos properties que habria que cargar y en su caso escribir
 *
 */



public enum PropertiesToLoad
{
	//properties con valores por defecto que se usará para cargar en otros properties
	DEFAULT("herramientaRegularizacionDefault.properties"),
	//properties con los valores de la ultima vez que se lanzó, y que se cargaran la proxima vez que se lancen
	LAST_CONFIG("herramientaRegularizacionLastConfig.properties");
	
	private String fileName;
	
	private PropertiesToLoad (String fileName){
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}
	
	@Override
	public String toString(){
		return fileName;
	}
	
}
