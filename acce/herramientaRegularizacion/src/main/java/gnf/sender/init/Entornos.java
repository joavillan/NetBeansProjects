package gnf.sender.init;

import java.util.ResourceBundle;

/**
 * Clase de enumeracion con los entornos y las caracteristicas de cada uno
 *
 */



public enum Entornos
{
	DESARROLLO("Desarrollo","/spring/sendconfDES/public-moma-development-ext-consumer.xml","des.ws.activityPCC","des.ws.trackOrder"), 
	TEST("TEST","/spring/sendconfTEST/public-moma-development-ext-consumer.xml","test.ws.activityPCC","test.ws.trackOrder"),
	INTEGRACION("Integracion","/spring/sendconfINT/public-moma-integration-ext-consumer.xml","int.ws.activityPCC","int.ws.trackOrder"),
	PRODUCCION("Produccion","/spring/sendconfPROD/public-moma-production-ext-consumer.xml","pro.ws.activityPCC","pro.ws.trackOrder"),
	DESARROLLOOOEE("Desarrollo","/springOOEE/sendconfDES/public-moma-development-ext-consumer.xml","des.ws.activityPCC","des.ws.trackOrder"), 
	TESTOOEE("TEST","/springOOEE/sendconfTEST/public-moma-development-ext-consumer.xml","test.ws.activityPCC","test.ws.trackOrder"),
	INTEGRACIONOOEE("Integracion","/springOOEE/sendconfINT/public-moma-integration-ext-consumer.xml","int.ws.activityPCC","int.ws.trackOrder"),
	PRODUCCIONOOEE("Produccion","/springOOEE/sendconfPROD/public-moma-production-ext-consumer.xml","pro.ws.activityPCC","pro.ws.trackOrder");
	/** Bundle con la informacion de la configuracion */
    private static final ResourceBundle resourceConf = ResourceBundle.getBundle("ConfiguracionRegularizacion");
    static
    {
    	for(Entornos env : Entornos.values()) {
    		env.wsdlpcc = resourceConf.getString(env.wsdlpcc);
    		env.wsdltrack = resourceConf.getString(env.wsdltrack);
    	}

    }
    
	
	private String nombreCombo;
	private String rutaSender;//ruta de configuracion para el sender
	private String wsdlpcc;//ruta de wsdl de PCC

	private String wsdltrack;//ruta de WSDL track order
	
	private Entornos (String nombreCombo, String rutaSender,String activityPCCKey,String trackOrderKey){
		this.nombreCombo = nombreCombo;
		this.rutaSender = rutaSender;
		this.wsdlpcc = activityPCCKey;
		this.wsdltrack = trackOrderKey;
	}

	public String getNombreCombo() {
		return nombreCombo;
	}

	public String getRutaSender() {
		return rutaSender;
	}
	
	@Override
	public String toString(){
		return nombreCombo;
	}
	
	public String getWsdlpcc() {
		return wsdlpcc;
	}

	public String getWsdltrack() {
		return wsdltrack;
	}
	
	public static Entornos fromString(String cadenaEntorno) {
	    if (cadenaEntorno != null) {
	      for (Entornos env : Entornos.values()) {
	        if (cadenaEntorno.equalsIgnoreCase(env.nombreCombo)) {
	          return env;
	        }
	      }
	    }
	    return null;
	  }
	
}
