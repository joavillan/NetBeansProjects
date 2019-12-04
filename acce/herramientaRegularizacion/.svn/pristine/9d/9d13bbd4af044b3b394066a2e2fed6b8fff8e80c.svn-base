package gnf.sender.init;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import activity.utilidades.Constantes;
import activity.utilidades.Util;
import agent.toatech.AgentSender;


public class NotifyActivity {
	private static final Logger LOGGER = Logger.getLogger(NotifyActivity.class);

	//private static final String STR_URL = "http://dmqbrka1.intranet.gasnatural.com:14170/momaes/brkd00";
	private static final String STR_URL = "url.zeus.notificacion";
	private static final String STR_URL_GEN_DOCUMENT = "url.sernvicesnnr.gendocument";
	// private static final String STR_URL = "http://127.0.0.1:8080/";
	
	
	private String numOrden;
	private Integer activity;

	public NotifyActivity(String numOrden, Integer activity) {
		this.numOrden = numOrden;
		this.activity = activity;
	}

	public void notifyImposible() {
		InputStream imposibleStream = NotifyActivity.class.getClassLoader().getResourceAsStream("imposible.txt");
		try {
			if (imposibleStream == null) {
				LOGGER.error("No se ha encontrado el fichero imposible.txt");
				return;
			}
			notifyOrder(imposibleStream);
		} finally {
			if (imposibleStream != null) {
				try {
					imposibleStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public void notifyAusente() {
		InputStream ausenteStream = NotifyActivity.class.getClassLoader().getResourceAsStream("ausente.txt");
		try {
			if (ausenteStream == null) {
				LOGGER.error("No se ha encontrado el fichero ausente.txt");
				return;
			}
			notifyOrder(ausenteStream);
		} finally {
			if (ausenteStream != null) {
				try {
					ausenteStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public void notifyCorrecto() {
		InputStream correctoStream = NotifyActivity.class.getClassLoader().getResourceAsStream("correcto.txt");
		try {
			if (correctoStream == null) {
				LOGGER.error("No se ha encontrado el fichero ausente.txt");
				return;
			}
			notifyOrder(correctoStream);
		} finally {
			if (correctoStream != null) {
				try {
					correctoStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	private void notifyOrder(InputStream stream) {
		Scanner reader = new Scanner(stream, "UTF-8");
		String body = reader.useDelimiter("\\A").next();
		body = body.replace("#NUMEROORDEN#", numOrden);
		body = body.replace("#NUMACTIVITY#", activity.toString());

		Random randomGenerator = new Random();
		
		Properties prop = Util.loadProperties();
        String ulrBackEnd = prop.getProperty(STR_URL);

		AgentSender agentsender = new AgentSender(ulrBackEnd, randomGenerator.nextInt(600000),
				Constantes.SET_RESULT_TO_BACKEND, body);
		agentsender.send_message();
//		LOGGER.info("ENVIANDO MENSAJE CON TEXTO" + body);

		reader.close();

		System.out.println("****** notifyOrder() - Done - " + numOrden + " ******\n");
	}

	public void notificarMomacon(Map<String, String> mapaActividad) {
		// Componer XML
		String cabecera = xmlNotificarMomacon(mapaActividad);
		// ENviar notificacion
		enviarNotificacion(cabecera, Constantes.NOTIFICAR_MOMACON);
	}

	/** Generar XML con los datos para enviar la notifcacion a 
	 * @param mapaActividad datos de la actividad recuperados de OFSC (par Clave/valor)
	 * @return
	 */
	private String xmlNotificarMomacon(Map<String, String> mapaActividad) {
		String body = "";
		InputStream notifPCCStream = null;
		try {
			// Abrir la plantilla e informarla con los datos
			notifPCCStream = NotifyActivity.class.getClassLoader().getResourceAsStream("notificarMomacon.txt");
			
			if (notifPCCStream == null) {
				LOGGER.error("No se ha encontrado el fichero notificarMomacon.txt");
				return "";
			}
			// Reemplazar los datos de la actividad en la plantilla
			Scanner reader = new Scanner(notifPCCStream, "UTF-8");
			body = reader.useDelimiter("\\A").next();
			body = body.replace(Constantes.countryCode, mapaActividad.get(Constantes.XA_COUNTRY_CODE));
			body = body.replace(Constantes.sectorCode, mapaActividad.get(Constantes.XA_SECTOR_CODE));
			body = body.replace(Constantes.numeroOrden, mapaActividad.get(Constantes.APPT_NUMBER));
			body = body.replace(Constantes.numeroActividad, mapaActividad.get(Constantes.AID));
			body = body.replace(Constantes.IdTecnico, mapaActividad.get(Constantes.resource_external_id));
			body = body.replace(Constantes.NombreTecnico, mapaActividad.get(Constantes.resource_name));
			body = body.replace(Constantes.fechaCreacion, mapaActividad.get(Constantes.activity_time_of_booking));
			body = body.replace(Constantes.PosicionRuta, mapaActividad.get(Constantes.POSITION_IN_ROUTE));
			body = body.replace(Constantes.fechaIntervencion, mapaActividad.get(Constantes.route_date)); //TODO
			body = body.replace(Constantes.fechaIntervencionInicio, mapaActividad.get(Constantes.route_date)); //TODO
			body = body.replace(Constantes.fechaIntervencionFin, mapaActividad.get(Constantes.route_date));
			body = body.replace(Constantes.fechaCertificadoInicio, mapaActividad.get(Constantes.XA_CERTIFICATION_DATE_BEGIN));
			body = body.replace(Constantes.fechaCertificadoFin, mapaActividad.get(Constantes.XA_SIGNATURE_DATE));
			body = body.replace(Constantes.resultadoActividad, mapaActividad.get(Constantes.XA_RESULT));
			body = body.replace(Constantes.nroAparatosTransformar, mapaActividad.get(Constantes.XA_TRANSFORM_DEVICES_NUMBER));
			body = body.replace(Constantes.motivoImposibleRealizar, mapaActividad.get(Constantes.XA_ORDER_NFR_CASTELLANO_TOTAL));
			body = body.replace(Constantes.comentarioVisita, mapaActividad.get(Constantes.XA_INTERVENTION_OBS));
			body = body.replace(Constantes.tarifa, mapaActividad.get(Constantes.XA_TAX));
			body = body.replace(Constantes.telemedido, mapaActividad.get(Constantes.XA_TELEMETERED_RESULT));
			body = body.replace(Constantes.certificadoTecnico, mapaActividad.get(Constantes.XA_X509_INFORMATION));
			body = body.replace(Constantes.cierreFinca, mapaActividad.get(Constantes.XA_BUILDING_CLOSURE));
			body = body.replace(Constantes.fechaHoraCoordenadaPDA, mapaActividad.get(Constantes.XA_DATE_HOUR_GPS_COORD));
		} finally {
			if (notifPCCStream != null) {
				try {
					notifPCCStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return body;
	}

	/** Enviar la notificacion a backend a partir de una orden y una actividad
	 * @param mapaActividad datos de la actividad recuperados de OFSC (par Clave/valor)
	 */
	public String setResultToBackEnd(Map<String, String> mapaActividad) {
		// Componer XML
		String cuerpo = xmlNotificarBackEnd(mapaActividad);
		// ENviar notificacion
//		enviarNotificacion(Constantes.SET_RESULT_TO_BACKEND, cuerpo);
		return cuerpo;
	}
	
	/**
	 * Generar XML con los datos para enviar la notifcacion a backend
	 * @param mapaActividad datos de la actividad recuperados de OFSC (par Clave/valor)
	 * @return
	 */
	private String xmlNotificarBackEnd(Map<String, String> mapaActividad) {
		String body = "";
		ConfigurableApplicationContext contextBBDD = null;
		InputStream notifPCCStream = null;
		try {
			
			// Abrir la plantilla setResultToBackEnd.txt y los ficheros de properties
			if (mapaActividad.get("XA_RESULT").equals("10 - Correcto"))
				notifPCCStream = NotifyActivity.class.getClassLoader().getResourceAsStream("setResultToBackEnd.txt");
			else 
				notifPCCStream = NotifyActivity.class.getClassLoader().getResourceAsStream("setResultToBackEndFallida.txt");
			
			Properties mapGetAcvitity = Util.loadProperties("mapeoGetActivity.properties");
			Properties mapSendBE = Util.loadProperties("mapeoSendBE.properties");
			
			if (notifPCCStream == null || mapGetAcvitity == null || mapSendBE == null) {
				LOGGER.error("No se ha encontrado el fichero setResultToBackEnd.txt");
				return "";
			}

			// Reemplazar los datos del XML de trackOrder en la plantilla
			Scanner reader = new Scanner(notifPCCStream, "UTF-8");
			body = reader.useDelimiter("\\A").next();
			
			// Iteramos el fichero donde estan todas las entradas de la notificacion a backend
			for (Iterator<Object> iteratorS2BE = mapSendBE.keySet().iterator(); iteratorS2BE.hasNext();) {
				String atributoS2BE = (String) iteratorS2BE.next();
				String cadenaXMLSendBE = mapSendBE.getProperty(atributoS2BE);
				String valorGetActivity = mapaActividad.get(mapGetAcvitity.getProperty(atributoS2BE));
					
				// Reemplazar las cadenas sobrantes del XML para que este bien formado
				if (atributoS2BE.equals("anomalia")) {
					for (int i=1; i<=71; i++) {
						//TODO de momento informar vacio, luego corregir para que solo quede la anomalia recuperada
						//de ofsc
						body = body.replace("{"+cadenaXMLSendBE+i+":+<anomalia>R"+i+"</anomalia>}", "");
					}
				} else if (atributoS2BE.equals("ficheros")) { // Tratar los ficheros
					//TODO de momento informar vacio, luego corregir para que solo quede los ficheros recuperados
					//de ofsc
					String nombreFichero = cadenaXMLSendBE.substring(3);
					// {pr_XA_ATTACH_IMAGE_ANOMALIAS32:+<nombrePropiedad>XA_ATTACH_IMAGE_ANOMALIAS32</nombrePropiedad>}
					String expRegularFicheros = "\\{pr_XA_ATTACH_IMAGE[a-zA-Z_0-9]*:{1}\\+\\<[a-zA-Z]*\\>XA_ATTACH_IMAGE[a-zA-Z_0-9]*\\</{1}[a-zA-Z]*\\>\\}";
			        Pattern pat = Pattern.compile(expRegularFicheros);
			        body = body.replaceAll(pat.toString(), "");
//			        for (int i=1; i<=92; i++) {
//			        	if 
//			        	body = body.replace(pat.toString(), "");
//			        }
						
				} else if (atributoS2BE.equals("defectslast")) { // Tratar los defectos
					//TODO de momento informar vacio, luego informar tomando en cuenta + y - todas los defectos que tenga la orden
					String expRegularFicheros = "\\{pr_XA_DEFECTS_[a-zA-Z_0-9\\.]*\\:?\\+?\\-?;?[a-zA-Z_0-9\\.]*\\}?\\}?";
			        Pattern pat = Pattern.compile(expRegularFicheros);

					body = body.replaceAll(pat.toString(), "");
				} else if (atributoS2BE.equals("aparatos")) { // Tratar los aparatos
					int nroAparatos = 0;
					if (null != mapaActividad.get("aparatos"))
						nroAparatos = Integer.parseInt(mapaActividad.get("aparatos"));
					String nro = "";
					String strDatosAparato = "";
					int j = 0;
					for (int i=1; i<=15; i++) {
						// Cadena en XML con la plantilla de aparatos
						strDatosAparato = "{prnum_XA_DEVICES_TYPE"+nro+":+<aparato>"
								+ "<marca>{pr_XA_DEVICE_BRAND"+nro+"}</marca>"
								+ "<modelo>{pr_XA_DEVICE_MODEL"+nro+"}</modelo>"
								+ "<potencia>{pr_XA_DEVICE_POWER"+nro+"}</potencia>"
								+ "<zona>{prnum_XA_CA_ZONES"+nro+"}</zona>"
								+ "<campana>{prnum_XA_HOOD_TYPE"+nro+"}</campana>"
								+ "<numeroSerie>{pr_XA_EQUIPMENT_SERIAL_NUMBER_"+i+"}</numeroSerie>" 
								+ "<codigo>{pr_XA_DEVICES_TYPE"+nro+"}</codigo>"
								+ "<codigoEstado>{pr_XA_DEVICES_STATUS"+nro+"}</codigoEstado>"
								+ "<fechaAlta>{pr_XA_DEVICES_DISCHARGE_DATE"+nro+"}</fechaAlta>"
								+ "<fechaBaja/>"
								+ "{pr_XA_KITCHEN_KIT"+nro+":+<kitCocina>true</kitCocina>}{pr_XA_KITCHEN_KIT"+nro+":-<kitCocina>false</kitCocina>}"
								+ "{pr_XA_HEATING_BOILER_KIT"+nro+":+<kitCalentadorCaldera>true</kitCalentadorCaldera>}{pr_XA_HEATING_BOILER_KIT"+nro+":-<kitCalentadorCaldera>false</kitCalentadorCaldera>}"
								+ "</aparato>}";
						if (i <= nroAparatos) {
							if (i == 1) // Solo el primero se llama pr_XA_EQUIP_SERIAL_NUMBER_
								strDatosAparato = strDatosAparato.replace("pr_XA_EQUIPMENT_SERIAL_NUMBER_", "pr_XA_EQUIP_SERIAL_NUMBER_");
							
							String lineaAparato =  strDatosAparato;
							lineaAparato = lineaAparato.replace("{prnum_XA_DEVICES_TYPE"+nro+":+", "");
							lineaAparato = lineaAparato.replace("{pr_XA_DEVICE_BRAND"+nro+"}", mapaActividad.get("brand_"+j));
							lineaAparato = lineaAparato.replace("{pr_XA_DEVICE_MODEL"+nro+"}", mapaActividad.get("model_"+j));
							lineaAparato = lineaAparato.replace("{pr_XA_DEVICE_POWER"+nro+"}", mapaActividad.get("power_"+j));
							lineaAparato = lineaAparato.replace("{prnum_XA_CA_ZONES"+nro+"}", mapaActividad.get("brand_"+j));
							lineaAparato = lineaAparato.replace("{prnum_XA_HOOD_TYPE"+nro+"}", mapaActividad.get("brand_"+j));
							
							if (i == 1)
								lineaAparato = lineaAparato.replace("{pr_XA_EQUIP_SERIAL_NUMBER_"+i+"}", mapaActividad.get("serialNumber_"+j));
							else 
								lineaAparato = lineaAparato.replace("{pr_XA_EQUIPMENT_SERIAL_NUMBER_"+i+"}", mapaActividad.get("serialNumber_"+j));	
							
							lineaAparato = lineaAparato.replace("{pr_XA_DEVICES_TYPE"+nro+"}", mapaActividad.get("type_"+j));
							lineaAparato = lineaAparato.replace("{pr_XA_DEVICES_STATUS"+nro+"}", mapaActividad.get("status_"+j));
							lineaAparato = lineaAparato.replace("{pr_XA_DEVICES_DISCHARGE_DATE"+nro+"}", "");
							lineaAparato = lineaAparato.replace("</aparato>}", "</aparato>");			
							body = body.replace(strDatosAparato, lineaAparato);
							
							// Para el kitCocina y kitCalentadorCaldera el tratamiento es distinto por ser booleanos
							String informado =   "\\{pr_XA_KITCHEN_KIT"+nro+":{1}\\+\\<kitCocina\\>true</{1}kitCocina\\>\\}";
							String noInformado = "\\{pr_XA_KITCHEN_KIT"+nro+":{1}\\-\\<kitCocina\\>false</{1}kitCocina\\>\\}";
							Pattern pat;
							// TODO INFORMAR el kitcocina de mapaActividad
							if (null != mapaActividad.get("brand_"+j) && !mapaActividad.get("brand_"+j).trim().equals("") && mapaActividad.get("brand_"+j).equals("true")) {
								pat = Pattern.compile(informado);
								body = body.replaceAll(pat.toString(), "<kitCocina>true</kitCocina>");
								pat = Pattern.compile(noInformado);
								body = body.replaceAll(pat.toString(), "");
							} else {
								pat = Pattern.compile(noInformado);
								body = body.replaceAll(pat.toString(), "<kitCocina>false</kitCocina>");
								pat = Pattern.compile(informado);
								body = body.replaceAll(pat.toString(), "");
							}
							informado =   "\\{pr_XA_HEATING_BOILER_KIT"+nro+":{1}\\+\\<kitCalentadorCaldera\\>true</{1}kitCalentadorCaldera\\>\\}";
							noInformado = "\\{pr_XA_HEATING_BOILER_KIT"+nro+":{1}\\-\\<kitCalentadorCaldera\\>false</{1}kitCalentadorCaldera\\>\\}";
							// TODO INFORMAR el kitCalentadorCaldera de mapaActividad
							if (null != mapaActividad.get("brand_"+j) && !mapaActividad.get("brand_"+j).trim().equals("") && mapaActividad.get("brand_"+j).equals("true")) {
								pat = Pattern.compile(informado);
								body = body.replaceAll(pat.toString(), "<kitCalentadorCaldera>true</kitCalentadorCaldera>");
								pat = Pattern.compile(noInformado);
								body = body.replaceAll(pat.toString(), "");
							} else {
								pat = Pattern.compile(noInformado);
								body = body.replaceAll(pat.toString(), "<kitCalentadorCaldera>false</kitCalentadorCaldera>");
								pat = Pattern.compile(informado);
								body = body.replaceAll(pat.toString(), "");
							}
							
						} else {
							// No informar estas entradas de aparatos en el XML
							body = body.replace(strDatosAparato, "");
							strDatosAparato = strDatosAparato.replace("pr_XA_EQUIPMENT_SERIAL_NUMBER_", "pr_XA_EQUIP_SERIAL_NUMBER_");
							body = body.replace(strDatosAparato, "");
						}
						nro = "_"+String.valueOf(i+1);
						j = i;
					}
				} else if (atributoS2BE.equals("cConexionMontante") ||
						atributoS2BE.equals("cExisteReguladorEnFinca") ||
						atributoS2BE.equals("cLimitadorDeCaudal") ||
						atributoS2BE.equals("cMarchaConjunto") ||
						atributoS2BE.equals("cRearme") ||
						atributoS2BE.equals("cInformarContadorReal") ||
						atributoS2BE.equals("cColocacionContador") ||
						atributoS2BE.equals("cIndicadorDeEnterado") ||
						atributoS2BE.equals("cInterlocutor") ||
						atributoS2BE.equals("cNoFirmaInspeccion") ||
						atributoS2BE.equals("cPasaporte") ||
						atributoS2BE.equals("cEspirometalico") ||
						atributoS2BE.equals("cSupleAdecuacion") || 
						atributoS2BE.equals("cInformarRetiroContador") || 
						atributoS2BE.equals("IsSign")) {
				
					// Si se trata de valores booleanos ver si estan informados en el properties
							
					String valorTrue = (atributoS2BE.equals("IsSign")?"1":"true");
					String valorFalse =  (atributoS2BE.equals("IsSign")?"0":"false");
					
					String informado =   "\\{"+cadenaXMLSendBE+":{1}\\+\\<"+atributoS2BE+"\\>"+valorTrue+"</{1}"+atributoS2BE+"\\>\\}";
					String noInformado = "\\{"+cadenaXMLSendBE+":{1}\\-\\<"+atributoS2BE+"\\>"+valorFalse+"</{1}"+atributoS2BE+"\\>\\}";
					Pattern pat;
					if (null != valorGetActivity && !valorGetActivity.trim().equals("") && valorGetActivity.equals("true")) {
						pat = Pattern.compile(informado);
						body = body.replaceAll(pat.toString(), "<"+atributoS2BE+">"+valorTrue+"</"+atributoS2BE+">");
						pat = Pattern.compile(noInformado);
						body = body.replaceAll(pat.toString(), "");
					} else {
						pat = Pattern.compile(noInformado);
						body = body.replaceAll(pat.toString(), "<"+atributoS2BE+">"+valorFalse+"</"+atributoS2BE+">");
						pat = Pattern.compile(informado);
						body = body.replaceAll(pat.toString(), "");
					}
				} else { // Se trata de cualquier otra casuística
					String cadenaGetActivity = valorGetActivity;
					if (atributoS2BE.equals("horaIntervencionFin") || atributoS2BE.equals("horaIntervencion")) {
						// Solo recuperar la hora de la fecha
						cadenaGetActivity = cadenaGetActivity.substring(11, 16);
					}
					if (atributoS2BE.equals("dPlantillaIdioma")) {
						// Informar del idioma que estamos tratando
						cadenaGetActivity = cadenaGetActivity.equals("1")?"CASTELLANO":"CATALÁN";
					}
					
					String expRegularFicheros = "\\{"+cadenaXMLSendBE+":{1}\\+\\<"+atributoS2BE+"\\>\\{"+cadenaXMLSendBE+"\\}\\</{1}"+atributoS2BE+"\\>\\}";
			        Pattern pat;
					// Buscar el elemento en el hashmap  
					if (null != cadenaGetActivity && !cadenaGetActivity.trim().equals("") && !cadenaGetActivity.trim().equals("null")) {
				        pat = Pattern.compile(expRegularFicheros);
						body = body.replaceAll(pat.toString(), "<"+atributoS2BE+">"+cadenaGetActivity+"</"+atributoS2BE+">");	
					} else {
				        pat = Pattern.compile(expRegularFicheros);
						body = body.replaceAll(pat.toString(), "");
					}
				}
			}
			// TODO si existe alguna cadena no reemplazada significa qeu el fichero no ha sido procesado del todo
			// lo mismo se trata de un nuevo parametro en el XML del padron o de otro
			// intentamos que se adapte a todos los ficheros, para ello se debera informar todas las entradas en 
			// los correspondientes properties y en caso de faltar alguno que se muestre cual puede ser. 
			
			// Finalmente reemplazamos todas las ocurrencias del XML ">}"
//			body = body.replace(">}", ">");
		} catch  (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (notifPCCStream != null) {
				try {
					notifPCCStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return body;
	}

	/**
	 * Enviar notificacion al bus
	 * @param cabecera cabecera del mensaje
	 * @param cuerpo cuerpo del mensaje
	 */
	private void enviarNotificacion(String cabecera, String cuerpo) {
		System.out.println("****** enviarNotificacion() - BEGIN - " + numOrden + " - " + activity + " ******\n");
		Properties prop = Util.loadProperties();
        String ulrBackEnd = prop.getProperty(STR_URL);
        
		//TODO Verificar si en el ID se le puede enviar una concatenacion para identificar correcciones manuales 
		//nuestras (como MAN001...), preguntar a catia
        Random randomGenerator = new Random();
        
		AgentSender agentsender = new AgentSender(ulrBackEnd, randomGenerator.nextInt(600000),
				cabecera, cuerpo);
		agentsender.send_message();

		System.out.println("****** enviarNotificacion() - END - " + numOrden + " - " + activity + " ******\n");
	}

	

	private String informarValorDeGetActivity(String string) {
		// TODO Auto-generated method stub
		return (string != null)?string:"";
	}
	

	
}
