package gnf.sender.init;

import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.TimeZone;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.rpc.holders.IntHolder;
import javax.xml.rpc.holders.StringHolder;

import org.apache.axis.AxisFault;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import org.w3.www._2005._05.xmlmime.Base64Binary;

import activity.toa.ApiBindingStub;
import activity.toa.Property;
import activity.toa.User;
import activity.toa.holders.ActivityHolder;
import activity.toa.holders.Activity_listHolder;


public class UpdateActivity {

	private static final String USER = "url.wsdl.ofsc.user";
	private static final String PWD = "url.wsdl.ofsc.password";
	private static final String COMPANY = "url.wsdl.ofsc.company";
	private static final String STR_URL = "url.wsdl.ofsc.activity";

	private static final Logger LOGGER = Logger.getLogger(UpdateActivity.class);
    private static ResourceBundle resourceConf = ResourceBundle.getBundle("global");


	String[] properties = null;
	Integer activity;

	public UpdateActivity(int activity, String[] properties)
	{
		this.activity = activity;
		this.properties = properties;
	}

	public void update()
	{
		System.out.print("****** update() - INICIO - " + properties[0] + " ******\n");
		try
		{
			String urlOfscActivity = resourceConf.getString(STR_URL);
			URL url = new URL(urlOfscActivity);
			ApiBindingStub apiBinding = new ApiBindingStub(url, null);
			IntHolder result_code = new IntHolder();
			StringHolder error_msg = new StringHolder();

			apiBinding.set_file(
					getUser(), 
					activity.toString(), 
					properties[0], 
					activity + properties[1], 
					new Base64Binary(properties[3]), 
					properties[2], 
					result_code, 
					error_msg);			

			System.out.print("****** update() - FIN OK - " + properties[0] + " ******\n");
		}
		catch(AxisFault e)
		{
			System.out.print("****** update() - FIN ERROR - " + properties[0] + " ******\n");
			e.printStackTrace();
		}
		catch(RemoteException e)
		{
			System.out.print("****** update() - FIN ERROR - " + properties[0] + " ******\n");
			e.printStackTrace();
		} 
		catch (MalformedURLException e) 
		{
			System.out.print("****** update() - FIN ERROR - " + properties[0] + " ******\n");
			e.printStackTrace();
		}
	}

	public void cancelActivity()
	{
		System.out.print("****** cancelActivity - INICIO - "+ activity +" ******\n");
		try
		{
			String urlOfscActivity = resourceConf.getString(STR_URL);

			URL url = new URL(urlOfscActivity);
			ApiBindingStub apiBinding = new ApiBindingStub(url, null);
			IntHolder result_code = new IntHolder();
			StringHolder error_msg = new StringHolder();
			ActivityHolder activityHolder = new ActivityHolder();
			Activity_listHolder activity_list = new Activity_listHolder();

			Date date = new Date();
			TimeZone tz = TimeZone.getTimeZone("UTC");
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			df.setTimeZone(tz);

			apiBinding.cancel_activity(
					getUser(),
					activity.toString(), 
					"", 
					df.format(date), 
					null, 
					result_code, 
					error_msg, 
					activityHolder, 
					activity_list);

			System.out.print("****** cancelActivity - FIN OK - "+ activity +" ******\n");
		}
		catch(AxisFault e)
		{
			System.out.print("****** cancelActivity - FIN ERROR - "+ activity +" ******\n");
			e.printStackTrace();
		}
		catch(RemoteException e)
		{
			System.out.print("****** cancelActivity - FIN ERROR - "+ activity +" ******\n");
			e.printStackTrace();
		} 
		catch (MalformedURLException e) 
		{
			System.out.print("****** cancelActivity - FIN ERROR - "+ activity +" ******\n");
			e.printStackTrace();
		}
	}

	public Map<String, String> getActivity() {
		System.out.print("****** getActivity - INICIO - "+ activity +" ******\n");
		Map<String, String> resultGetActivity = new HashMap<String, String>();
		try
		{
			String urlOfscActivity = resourceConf.getString(STR_URL);
			URL url = new URL(urlOfscActivity);
			ApiBindingStub apiBinding = new ApiBindingStub(url, null);
			IntHolder result_code = new IntHolder();
			StringHolder error_msg = new StringHolder();
			ActivityHolder activityHolder = new ActivityHolder();
			Activity_listHolder activity_list = new Activity_listHolder();

			// Recuperar los datos de la actividad
			apiBinding.get_activity(getUser(), activity.toString(), result_code, error_msg, activityHolder, activity_list);

			if (null != result_code && result_code.value == 0) {
				// Mapear el resultado del getActivity
				for (Property property : activityHolder.value) {
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
										String valorArray = (String) jsonArray.get(i);
										resultGetActivity.put(key+"_"+i, valorArray);
										System.out.print(key+"_"+ i +"="+ valorArray+"\n");
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

//			if (null != result_code && result_code.value == 0) {
				// Anular la actividad en OFSC
				//				Date date = new Date();
				//				TimeZone tz = TimeZone.getTimeZone("UTC");
				//				DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				//				df.setTimeZone(tz);
				//
				//				Property[] propiedades = null;
				//				
				//				// cancelamos la actividad
				//				apiBinding.cancel_activity(getUser(prop), activity.toString(), "", df.format(date), propiedades, result_code, error_msg, activityHolder, activity_list);
				//				
				//				// Mapear el resultado del getActivity
				//				for (Property property : activityHolder.value) {
				//					resultGetActivity.put(property.getName(), property.getValue());
				//					System.out.print(property.getName()+"\n");
				//				}

				//				if (null != result_code && result_code.value == 0) {
				//					if(resultGetActivity.get("status").equals("31 - Ausente")){
				//						System.out.print("31 - Ausente\n");
				//						// notificar momacon
				//						// set_result_to_backend
				//						xmlNotificarMomacon(resultGetActivity);
				//						
				//					} else if (resultGetActivity.get("status").equals("34 - Imposible")) {
				//						System.out.print("34 - Imposible\n");
				//						
				//					} else if (resultGetActivity.get("status").equals("10 - Correcto")) {
				//						System.out.print("10 - Correcto\n");
				//					}
			} else {
				System.out.print("Resultado: " + result_code.value + " - " + error_msg.value +"\n");
			}

			System.out.print("****** getActivity - FIN OK - "+ activity +" ******\n");
		}
		catch(AxisFault e)
		{
			System.out.print("****** getActivity - FIN ERROR - "+ activity +" ******\n");
			e.printStackTrace();
		}
		catch(RemoteException e)
		{
			System.out.print("****** getActivity - FIN ERROR - "+ activity +" ******\n");
			e.printStackTrace();
		} 
		catch (MalformedURLException e) 
		{
			System.out.print("****** getActivity - FIN ERROR - "+ activity +" ******\n");
			e.printStackTrace();
		}
		return resultGetActivity;
	}

	private void escribirRespuesta(String numeroActividad, ActivityHolder respuesta){
		try {
			LOGGER.info("************************* Respuesta - " + numeroActividad + "*************************");
			JAXBContext context = JAXBContext.newInstance(ActivityHolder.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			StringWriter sw = new StringWriter();
			marshaller.marshal(respuesta.value, sw);
			LOGGER.info(sw.toString());

			LOGGER.info("************************* Respuesta - FIN " + numeroActividad
					+ "*************************");
		} catch (Exception e) {
			LOGGER.error("************************* Respuesta - " + numeroActividad
					+ "************************* \n ERROR parseo: " + e.getMessage());
		}
	}

	private User getUser()
	{
		String password = resourceConf.getString(PWD);
		String company = resourceConf.getString(COMPANY);
		String usuario = resourceConf.getString(USER);

		Date date = new Date();
		AuthOFSC auth_string = new AuthOFSC(password, date);
		TimeZone tz = TimeZone.getTimeZone("UTC");
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mmZ");
		df.setTimeZone(tz);

		User user = new User();
		//TODO
		user.setCompany(company);
		user.setLogin(usuario);
		user.setNow(df.format(date));
		user.setAuth_string(auth_string.genAuthString());

		return user;
	}
	
}
