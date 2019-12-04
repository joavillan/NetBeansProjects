package gnf.sender.init;

/**
 * Clase de enumeracion con los tipos de peticion que se pueden crear (IRC, IRIAT,IRIT,IRIS, IRIAS)
 *
 */



public enum PlantillasCreacion
{
	
	
	
	IRC("IRC",Constants.RUTA_CREACION_20,false), 
	IRIAT("IRIAT",Constants.RUTA_CREACION_59,true),
	IRIT("IRIT",Constants.RUTA_CREACION_01,true),
	IRIS("IRIS",Constants.RUTA_CREACION_01,false),
	IRIAS("IRIAS",Constants.RUTA_CREACION_59,false),
	
	ALTA_DE_SUMINISTRO("ALTA DE SUMINISTRO",Constants.RUTA_CREACION_OOEE_01,false),
	BAJA_DE_SUMINISTRO("BAJA DE SUMINISTRO",Constants.RUTA_CREACION_OOEE_02,false),
	CONEXION_DE_EVENTUAL("CONEXIÓN DE EVENTUAL",Constants.RUTA_CREACION_OOEE_03,false),
	CONEXION_DE_SUMINISTRO("CONEXIÓN DE SUMINISTRO",Constants.RUTA_CREACION_OOEE_04,false),
	CONEXION_POR_CONTRATACION("CONEXIÓN POR CONTRATACIÓN",Constants.RUTA_CREACION_OOEE_05,false),
	CORTE_DE_EVENTUAL("CORTE DE EVENTUAL",Constants.RUTA_CREACION_OOEE_06,false),
	CORTE_DE_SUMINISTRO("CORTE DE SUMINISTRO",Constants.RUTA_CREACION_OOEE_07,false),
	CORTE_CON_FIN_OPERACIÓN("CORTE CON FIN OPERACIÓN",Constants.RUTA_CREACION_OOEE_08,false),
	IRREGULARIDAD("IRREGULARIDAD",Constants.RUTA_CREACION_OOEE_09,false),
	TOMA_DE_LECTURA("TOMA DE LECTURA",Constants.RUTA_CREACION_OOEE_10,false),
	PERMUTA("PERMUTA",Constants.RUTA_CREACION_OOEE_11,false),
	RETIRADA_DE_ACOMETIDA("RETIRADA DE ACOMETIDA",Constants.RUTA_CREACION_OOEE_12,false),
	RETIRADA_DE_SUMINISTRO("RETIRADA DE SUMINISTRO",Constants.RUTA_CREACION_OOEE_13,false),
	REVISION_DE_EQUIPOS("REVISIÓN DE EQUIPOS",Constants.RUTA_CREACION_OOEE_14,false),
	SEGUIMIENTO_Y_REFORMA("SEGUIMIENTO Y REFORMA",Constants.RUTA_CREACION_OOEE_15,false),
	REVISION_DE_ACOMETIDA("REVISIÓN DE ACOMETIDA",Constants.RUTA_CREACION_OOEE_16,false),
	REVISION_DE_SUMINISTRO("REVISIÓN DE SUMINISTRO",Constants.RUTA_CREACION_OOEE_17,false),
	SUSTITUCION_DE_EQUIPOS("SUSTITUCIÓN DE EQUIPOS",Constants.RUTA_CREACION_OOEE_18,false),
	VERIFICACION("VERIFICACIÓN",Constants.RUTA_CREACION_OOEE_19,false);
    
	
	private String nombreCombo;
	private String rutaPlantilla;//ruta de configuracion para el sender
	private boolean transformacion;
	
	private PlantillasCreacion (String nombreCombo, String rutaPlantilla,boolean transformacion){
		this.nombreCombo = nombreCombo;
		this.rutaPlantilla = rutaPlantilla;
		this.transformacion=transformacion;
	}

	public String getNombreCombo() {	
		return nombreCombo;
	}

	public String getRutaPlantilla() {
		return rutaPlantilla;
	}
	
	@Override
	public String toString(){
		return nombreCombo;
	}
	
	public static PlantillasCreacion fromString(String cadenaEntorno) {
	    if (cadenaEntorno != null) {
	      for (PlantillasCreacion env : PlantillasCreacion.values()) {
	        if (cadenaEntorno.equalsIgnoreCase(env.nombreCombo)) {
	          return env;
	        }
	      }
	    }
	    return null;
	  }

	public boolean isTransformacion() {
		return transformacion;
	}
	
	private static class Constants {
		public static final String PLANTILLAS = "templates";
		public static final String CREATE = "create";
		public static final String CREATEOOEE = "createOOEE";
		public static final String RUTA_CREACION_01 = PLANTILLAS + "/" + CREATE + "/01.xml";
		public static final String RUTA_CREACION_20 = PLANTILLAS + "/" + CREATE + "/20.xml";
		public static final String RUTA_CREACION_59 = PLANTILLAS + "/" + CREATE + "/59.xml";
		public static final String RUTA_CREACION_OOEE_01 = PLANTILLAS + "/" + CREATEOOEE + "/01.xml";
		public static final String RUTA_CREACION_OOEE_02 = PLANTILLAS + "/" + CREATEOOEE + "/02.xml";
		public static final String RUTA_CREACION_OOEE_03 = PLANTILLAS + "/" + CREATEOOEE + "/03.xml";
		public static final String RUTA_CREACION_OOEE_04 = PLANTILLAS + "/" + CREATEOOEE + "/04.xml";
		public static final String RUTA_CREACION_OOEE_05 = PLANTILLAS + "/" + CREATEOOEE + "/05.xml";
		public static final String RUTA_CREACION_OOEE_06 = PLANTILLAS + "/" + CREATEOOEE + "/06.xml";
		public static final String RUTA_CREACION_OOEE_07 = PLANTILLAS + "/" + CREATEOOEE + "/07.xml";
		public static final String RUTA_CREACION_OOEE_08 = PLANTILLAS + "/" + CREATEOOEE + "/08.xml";
		public static final String RUTA_CREACION_OOEE_09 = PLANTILLAS + "/" + CREATEOOEE + "/09.xml";
		public static final String RUTA_CREACION_OOEE_10 = PLANTILLAS + "/" + CREATEOOEE + "/10.xml";
		public static final String RUTA_CREACION_OOEE_11 = PLANTILLAS + "/" + CREATEOOEE + "/11.xml";
		public static final String RUTA_CREACION_OOEE_12 = PLANTILLAS + "/" + CREATEOOEE + "/12.xml";
		public static final String RUTA_CREACION_OOEE_13 = PLANTILLAS + "/" + CREATEOOEE + "/13.xml";
		public static final String RUTA_CREACION_OOEE_14 = PLANTILLAS + "/" + CREATEOOEE + "/14.xml";
		public static final String RUTA_CREACION_OOEE_15 = PLANTILLAS + "/" + CREATEOOEE + "/15.xml";
		public static final String RUTA_CREACION_OOEE_16 = PLANTILLAS + "/" + CREATEOOEE + "/16.xml";
		public static final String RUTA_CREACION_OOEE_17 = PLANTILLAS + "/" + CREATEOOEE + "/17.xml";
		public static final String RUTA_CREACION_OOEE_18 = PLANTILLAS + "/" + CREATEOOEE + "/18.xml";
		public static final String RUTA_CREACION_OOEE_19 = PLANTILLAS + "/" + CREATEOOEE + "/19.xml";
    }
	
}
