package momatools.gui.tabs;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import org.apache.log4j.Logger;
import org.apache.poi.util.IOUtils;
import org.json.JSONObject;

import momatools.excel.UtilidadesExcel;
import momatools.gui.main.FileUtils;
import okhttp3.Credentials;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class TabRestauraInfo extends TabParents{

	private static final long serialVersionUID = 1L;

	private static final Logger LOGGER = Logger.getLogger(TabRestauraInfo.class);

	/** Bundle con la informacion de la configuracion */
	private static ResourceBundle resourceConf = ResourceBundle.getBundle("ConfiguracionRestaura");

	/** Opciones de entorno */
	private static final String OPCION_DES = "gnf-es1.test";
	private static final String OPCION_INT = "gnf-es2.test";
	private static final String OPCION_PRO = "gnf-es";
	private Properties propsLastConfig;
	private String excelPath;

	public TabRestauraInfo(JTextArea resultados,Properties propsLastConfig) {
		super(new GridBagLayout(),resultados);
		this.propsLastConfig=propsLastConfig;
		initComponents();
		prePopulateFields();
	}

	/**
	 * Creo cada uno de los campos
	 */
	
	@Override
	protected void initComponents() {
		excelPath=propsLastConfig.getProperty("restaura.rutaexcel");
		

		super.initComponents();

		/************************* CONTROLES *************************/

		//Text para informar la ruta de la excel con las ordenes
		final JTextField rutaExcel = new JTextField();
		rutaExcel.setText(excelPath);

		//Boton para seleccionar un fichero excel
		final JButton btnBuscaExcel = new JButton("Buscar...");
		btnBuscaExcel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FileUtils.selectExcelFile(rutaExcel, excelPath);
				propsLastConfig.setProperty("restaura.rutaexcel", rutaExcel.getText());
			}
		});

		//Check que indica si la excel tiene cabecera
		final JCheckBox cabecera = new JCheckBox("¿Tiene cabecera?", true);
		cabecera.setHorizontalTextPosition(SwingConstants.LEFT);

		//Radio Buttons para seleccionar el entorno
		final JRadioButton option1 = new JRadioButton("Desarrollo", true);
		final JRadioButton option2 = new JRadioButton("Integracion");
		final JRadioButton option3 = new JRadioButton("Produccion");

		ButtonGroup group = new ButtonGroup();
		group.add(option1);
		group.add(option2);
		group.add(option3);

		//Text para informar usuario y clave
		final JTextField usuario = new JTextField();
		final JTextField clave = new JTextField();
		usuario.setText("soap_datasync");
		clave.setText("soap_datasync");

		//Boton restaurar
		JButton boton = new JButton("Restaurar");


		/************************* PANELES *************************/

		GridBagConstraints constraints = new GridBagConstraints();
		constraints.ipadx = 20;

		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.EAST;
		add(new JLabel("Ruta fichero excel de ordenes: "), constraints);

		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.gridwidth = 3;
		constraints.gridheight = 1;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.anchor = GridBagConstraints.EAST;
		add(rutaExcel, constraints);

		constraints.gridx = 4;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(0, 10, 0, 10);
		add(btnBuscaExcel, constraints);

		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.EAST;
		add(cabecera, constraints);

		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.EAST;
		add(option1, constraints);

		constraints.gridx = 2;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.WEST;
		add(option2, constraints);

		constraints.gridx = 3;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.WEST;
		add(option3, constraints);

		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.EAST;
		add(new JLabel("Usuario / Clave:"), constraints);

		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.anchor = GridBagConstraints.EAST;
		add(usuario, constraints);

		constraints.gridx = 2;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.anchor = GridBagConstraints.EAST;
		add(clave, constraints);

		constraints.gridx = 0;
		constraints.gridy = 3;
		constraints.gridwidth = 5;
		constraints.gridheight = 1;
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.insets = new Insets(10, 0, 0, 0);
		add(boton, constraints);


		/************************* ACCIONES *************************/

		//Acciones del boton
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean correcto = true;
				try{
					String entorno = option1.isSelected()? OPCION_DES: option2.isSelected()? OPCION_INT: OPCION_PRO;
					restauraOrdenes(rutaExcel.getText(), cabecera.isSelected(), entorno, usuario.getText(), clave.getText());
				}catch(Exception e1){
					correcto = false;
					resultados.setText(resultados.getText() + e1.getMessage());
				}
				if (correcto){
					JOptionPane.showMessageDialog(null, "Finalizado", "Fin", JOptionPane.INFORMATION_MESSAGE);
				}else
					JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
			}
		});
	}

	/**
	 * Cargo aquellos componentes que deban tener un valor por defecto
	 */
	
	@Override
	protected void prePopulateFields() {
		super.prePopulateFields();
	}

	/** Metodo que lee el fichero de entrada y manda a los WS la actualizacion del estado
	 * @param rutaExcel
	 * @param tieneCabecera
	 * @param entorno
	 * @param usuario
	 * @param clave
	 * @throws Exception
	 */
	private void restauraOrdenes(String rutaExcel, boolean tieneCabecera, String entorno, String usuario, String clave) throws Exception{
		//Leemos el fichero excel
		List<String[]> excel = UtilidadesExcel.leeExcel(rutaExcel, 3, tieneCabecera);

		resultados.setText("Inicio regularizacion entorno: " + entorno + " \n");
		for (int i = 0; i < excel.size(); i++){
			String[] fila = excel.get(i);
			String orden = fila[0];
			String actViva = fila[1];
			String actSuspendida = fila[2];
			
			LOGGER.info("Restaurando orden: " + orden);

			//Obtenemos los datos de la actividad suspendida
			JSONObject jsonGet =  get(entorno, usuario, clave, actSuspendida);

			if (jsonGet == null){
				resultados.setText(resultados.getText() + "La Orden '" + orden + "' ha dado error al leer la actividad suspendida  \n");
			}else{
				resultados.setText(resultados.getText() + "Restaurando datos de la Orden '" + orden + "' Actividad " + actSuspendida + " hacia " + actViva + "....");

				//Objetos para almacenar las Keys de ficheros
				String[] fileIndex = resourceConf.getString("file").split(";");
				int ini = new Integer(fileIndex[0]).intValue();
				int fin = new Integer(fileIndex[1]).intValue();
				List<String> fileKeys = new ArrayList<String>();

				//Eliminamos de la respuesta los campos que no se deben transferir
				int x = 1;
				while (resourceConf.containsKey("remove." + x)){
					//Eliminamos el campo
					Object obj = jsonGet.remove(resourceConf.getString("remove." + x));

					//Si el indice esta dentro de los indices de fichero guardamos el objeto eliminado
					if (ini <= x && x <= fin && obj != null){
						fileKeys.add(resourceConf.getString("remove." + x));
					}

					//Incrementamos y pasamos al siguiente
					x++;
				}

				//Actualizamos la orden
				JSONObject jsonPatch = patch(entorno, usuario, clave, actViva, jsonGet.toString());

				if (jsonPatch == null){
					resultados.setText(resultados.getText() + "Error \n");
				}else{
					resultados.setText(resultados.getText() + "Restaurada \n");
					resultados.setText(resultados.getText() + "Restaurando ficheros de la Orden '" + orden + "' ....");

					//Se envian los ficheros
					boolean resultado = getsetFile(entorno, usuario, clave, actViva, actSuspendida, fileKeys);

					if (resultado)
						resultados.setText(resultados.getText() + "Restaurados \n");
					else
						resultados.setText(resultados.getText() + "Error \n");
				}
			}

		}
		resultados.setText(resultados.getText() + "Fin regularizacion entorno: " + entorno + " \n");
	}

	/** Metodo que llama al WS 'API Core - GET' con los datos de entrada y devuelve el resultado
	 * @param entorno
	 * @param usuario
	 * @param clave
	 * @param numActividad
	 * @return
	 */
	private JSONObject get(String entorno, String usuario, String clave, String numActividad) {
		try {
			//Creamos el objeto de credenciales
			String credential = Credentials.basic(usuario + "@" + entorno, clave);

			//Creamos el cliente del WS
			OkHttpClient client = new OkHttpClient();
			Request request = new Request.Builder()
					.url("https://api.etadirect.com/rest/ofscCore/v1/activities/" + numActividad)
					.get()
					.addHeader("authorization", credential)
					.build();

			//LLamamos al cliente
			Response response = client.newCall(request).execute();

			//Convertimos la respuesta a un objeto JSON
			JSONObject jsonObj = new JSONObject(response.body().string());
			//LOGGER.info("Respuesta actividad '" + numActividad + "': " + jsonObj.toString());
			LOGGER.info("Respuesta GET '" + numActividad + "': " + response.message());

			return jsonObj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/** Metodo que llama al WS 'API Core - PATCH' con los datos de entrada y devuelve el resultado
	 * @param entorno
	 * @param usuario
	 * @param clave
	 * @param numActividad
	 * @param bodyStr
	 * @return
	 */
	private JSONObject patch(String entorno, String usuario, String clave, String numActividad, String bodyStr){
		try {
			//Creamos el objeto de credenciales
			String credential = Credentials.basic(usuario + "@" + entorno, clave);

			//Creamos el cliente del WS con el body de entrada en formato JSON
			OkHttpClient client = new OkHttpClient();
			MediaType mediaType = MediaType.parse("application/json");
			RequestBody body = RequestBody.create(mediaType, bodyStr);
			Request request = new Request.Builder()
					.url("https://api.etadirect.com/rest/ofscCore/v1/activities/" + numActividad)
					.patch(body)
					.addHeader("authorization", credential)
					.addHeader("content-type", "application/json")
					.build();

			//LLamamos al cliente
			Response response = client.newCall(request).execute();

			//Convertimos la respuesta a un objeto JSON
			JSONObject jsonObj = new JSONObject(response.body().string());
			//LOGGER.info("Respuesta PATCH: " + jsonObj.toString());
			LOGGER.info("Respuesta PATCH '" + numActividad + "': " + response.message());

			return jsonObj;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	/** Metodo que llama al WS 'API Core - GET y PUT' para pasar los ficheros de una actividad a otra
	 * @param entorno
	 * @param usuario
	 * @param clave
	 * @param numActividad
	 * @param jsonSetFile
	 * @return
	 */
	private boolean getsetFile(String entorno, String usuario, String clave, String numActViva, String numActSuspendida, List<String> fileKeys){
		String key=null;
		try {
			//Creamos el objeto de credenciales
			String credential = Credentials.basic(usuario + "@" + entorno, clave);
			//Recorremos la lista de ficheros de entrada
			for (int i = 0; i < fileKeys.size(); i++){
				key = fileKeys.get(i);

				//Creamos el cliente del WS para get_file
				//OkHttpClient clientGet = new OkHttpClient();
				OkHttpClient clientGet = new OkHttpClient.Builder()
				        .writeTimeout(60, TimeUnit.SECONDS)
				        .readTimeout(60, TimeUnit.SECONDS)
				        .build();
				Request requestGet = new Request.Builder()
						.url("https://api.etadirect.com/rest/ofscCore/v1/activities/" + numActSuspendida + "/" + key)
						.get()
						.addHeader("authorization", credential)
						.addHeader("accept", "application/octet-stream")
						.build();

				Response response = clientGet.newCall(requestGet).execute();
				LOGGER.info("Respuesta GET " + key + ": " + response.message());

				//Pasamos la respuesta a array de bytes
				byte[] bytes = IOUtils.toByteArray(response.body().byteStream());

				//Creamos el body con el fichero recibido
				MediaType mediaType = MediaType.parse(response.header("Content-Type"));
				RequestBody body = RequestBody.create(mediaType, bytes);

				//Creamos el cliente del WS para set_file
				//OkHttpClient clientSet = new OkHttpClient();
				OkHttpClient clientSet = new OkHttpClient.Builder()
				        .writeTimeout(60, TimeUnit.SECONDS)
				        .readTimeout(60, TimeUnit.SECONDS)
				        .build();
				Request requestSet = new Request.Builder()
						.url("https://api.etadirect.com/rest/ofscCore/v1/activities/" + numActViva + "/" + key)
						.put(body)
						.addHeader("authorization", credential)
						.addHeader("Content-Type", response.header("Content-Type"))
						.addHeader("content-disposition", response.header("content-disposition").replace(numActSuspendida, numActViva))
						.build();

				Response responseSet = clientSet.newCall(requestSet).execute();
				LOGGER.info("Respuesta PUT " + key + ": " + responseSet.message());
			}

			return true;
		} catch (IOException e) {
			LOGGER.error("Error en file " + key );			
			e.printStackTrace();
			return false;
		}
	}
}