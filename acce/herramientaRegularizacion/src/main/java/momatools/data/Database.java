package momatools.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import gnf.sender.init.Entornos;
import regularizacion.persistence.entity.BackendErrorOrder;
import regularizacion.persistence.entity.KOCreacion;
import regularizacion.persistence.entity.OrdenTrackActivity;
import regularizacion.persistence.entity.OrdenTrackOrder;
import regularizacion.persistence.entity.PdteBackend;

public class Database {
	private static final Logger LOGGER = Logger.getLogger(Database.class);
	/** Bundle con la informacion de la configuracion */
	private static ResourceBundle resourceConf = ResourceBundle.getBundle("ConfiguracionInformes");
	private static Properties propsConfig;
	private static Properties propsLastConfig;
	private static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	private static String linea = "'3781505'";
	public static final String DB_KPI = "MOMAWEBP";
	public static final String DB_MOMAWEB = "MOMAKPIP";
	/**
	 * Variable que almacena el entorno donde se ejecutara el cuadre.
	 */
	private static Entornos entorno = Entornos.PRODUCCION;

	static {
		try {
			Class.forName(DRIVER_NAME).newInstance();
			System.out.println("*** Driver cargado");
		} catch (Exception e) {
			System.out.println("*** Error : " + e.toString());
		}
	}

	public static Connection getConexion(String nombreProperties) throws SQLException {
		String url;
		String usuario;
		String clave;
		if ("cuadre".equals(nombreProperties)) {
			if (entorno.equals(Entornos.PRODUCCION)) {
				url = propsConfig.getProperty("config.dbProd.url").replace("\\", "");
				usuario = propsConfig.getProperty("config.dbProd.username").replace("\\", "");
				clave = propsConfig.getProperty("config.dbProd.password").replace("\\", "");
			} else {
				url = propsConfig.getProperty("config.dbDes.url").replace("\\", "");
				usuario = propsConfig.getProperty("config.dbDes.username").replace("\\", "");
				clave = propsConfig.getProperty("config.dbDes.password").replace("\\", "");
			}
		} else {
			url = resourceConf.getString("config.db.url");
			usuario = resourceConf.getString("config.db.username");
			clave = resourceConf.getString("config.db.password");
		}
		return DriverManager.getConnection(url, usuario, clave);
	}

	public static Connection getConexionMomaWeb(String nombreProperties) throws SQLException {
		String url;
		String usuario;
		String clave;

		if ("cuadre".equals(nombreProperties)) {
			if (entorno.equals(Entornos.PRODUCCION)) {
				url = propsConfig.getProperty("config.dbProd.momaweb.url").replace("\\", "");
				usuario = propsConfig.getProperty("config.dbProd.momaweb.username").replace("\\", "");
				clave = propsConfig.getProperty("config.dbProd.momaweb.password").replace("\\", "");
			} else {
				url = propsConfig.getProperty("config.dbDes.momaweb.url").replace("\\", "");
				usuario = propsConfig.getProperty("config.dbDes.momaweb.username").replace("\\", "");
				clave = propsConfig.getProperty("config.dbDes.momaweb.password").replace("\\", "");
			}
		} else {
			url = resourceConf.getString("config.db.momaweb.url");
			usuario = resourceConf.getString("config.db.momaweb.username");
			clave = resourceConf.getString("config.db.momaweb.password");
		}
		return DriverManager.getConnection(url, usuario, clave);
	}

	/**
	 * Metodo que lanza las querys de KPIs para el numero de dias dado
	 * 
	 * @param dias
	 * @return
	 * @throws Exception
	 */
	public static String ejecutaQueryKPI(String dias) throws Exception {
		ResultSet resultado = null;
		String consulta = "";
		Statement sentencia = null;
		try {
			sentencia = getConexion("").createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			// Ejecutamos la sentencia de alter
			String sql = resourceConf.getString("carga.kpi.1");
			System.out.println("Alter: " + sql);
			sentencia.executeUpdate(sql);

			// Ejecutamos la sentencia de select
			sql = resourceConf.getString("carga.kpi.2");
			sql = sql.replace("{dias}", dias);
			System.out.println("Select: " + sql);
			resultado = sentencia.executeQuery(sql);

			if (resultado != null) {
				while (resultado.next()) {
					consulta += normalizaCadena(resultado.getString("FECHA"), 25)
							+ normalizaCadena(resultado.getString("PAQUETE"), 40)
							+ normalizaCadena(resultado.getString("ESTADO"), 5) + resultado.getString("ERROR_MESSAGE")
							+ "\n";
				}
			}
		} finally {
			resultado.close();
			sentencia.close();
		}
		return consulta;
	}

	/**
	 * Metodo que lanza la query para obtener errores backend.
	 * 
	 * @param textarea
	 * @return erroresBackend
	 * @throws Exception
	 * @author f.guillen.caro TODO sacar la parte de la carga primero de los
	 *         properties
	 */
	public static ArrayList<BackendErrorOrder> ejecutaQueryErrores(JTextArea textarea, Entornos env,
			JProgressBar barraProgreso, JLabel porcentaje, JLabel cargando, Properties pConfig, Properties pLastConfig)
					throws Exception {
		entorno = env;
		propsConfig = pConfig;
		propsLastConfig = pLastConfig;
		double count = 0;
		int contador = 0;
		double count2 = 0;
		double aux = 0;
		Connection conexion = getConexion("cuadre");
		ArrayList<BackendErrorOrder> erroresBackend = new ArrayList<BackendErrorOrder>();
		BackendErrorOrder orden = null;
		ResultSet resultado = null;
		String consulta = "";
		String sql = "";
		String obtieneFiltro = propsConfig.getProperty("cuadre.filtros.errorbackend");
		List<String> filtro = Arrays.asList(obtieneFiltro.split(";"));
		Statement sentencia = null;
		barraProgreso.setValue(0);
		porcentaje.setText("0%");
		cargando.setText("Cargando--> Tabla MKPI_TL_MOMACON_ACTIVITY/ Fila 1");
		try {
			try {
				sentencia = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
				// Ejecutamos la sentencia de select

				if (entorno.getNombreCombo().equals(Entornos.PRODUCCION.getNombreCombo()))
					sql = propsConfig.getProperty("query.cuadreP");
				else
					sql = propsConfig.getProperty("query.cuadreD");
				sql = sql.replace("\\", "");
				System.out.println("Select: " + sql);
				resultado = sentencia.executeQuery(sql);
				if (resultado != null) {
					resultado.last();
					count = resultado.getRow();
					count2 = 50 / count;
					count = 500 / count;
					resultado.first();
					textarea.setText("####################\r\n### Errores Backend ###\r\n####################\r\n");
					while (resultado.next()) {
						contador++;
						orden = new BackendErrorOrder(resultado.getString("ID_WORK_ORDER"),
								resultado.getString("OPERACION_CODE"), resultado.getString("PROCESS_STATUS"),
								resultado.getString("COD_TEAM"), resultado.getString("UPDATE_DATE"),
								resultado.getString("MENSAJE_ERROR_INTEGRACION"));
						if (!resultado.getString("ID_WORK_ORDER").equals("901124641000012")) {
							if (orden.getMensaje_error_integracion() != null) {
								if (compruebaFiltro(filtro, orden)) {
									erroresBackend.add(orden);
									textarea.append(normalizaCadena(resultado.getString("ID_WORK_ORDER"), 30)
											+ normalizaCadena(resultado.getString("OPERACION_CODE"), 30)
											+ normalizaCadena(resultado.getString("PROCESS_STATUS"), 30)
											+ normalizaCadena(resultado.getString("COD_TEAM"), 30)
											+ normalizaCadena(resultado.getString("UPDATE_DATE"), 30)
											+ resultado.getString("MENSAJE_ERROR_INTEGRACION").replace("\n", "")
											+ "\n");

									consulta += normalizaCadena(resultado.getString("ID_WORK_ORDER"), 30)
											+ normalizaCadena(resultado.getString("OPERACION_CODE"), 30)
											+ normalizaCadena(resultado.getString("PROCESS_STATUS"), 30)
											+ normalizaCadena(resultado.getString("COD_TEAM"), 30)
											+ normalizaCadena(resultado.getString("UPDATE_DATE"), 30)
											+ resultado.getString("MENSAJE_ERROR_INTEGRACION").replace("\n", "") + "\n";
								}
							}

						}
						aux += count2;
						barraProgreso.setValue((int) (barraProgreso.getValue() + count));
						porcentaje.setText((int) aux + "%");
						cargando.setText("Cargando--> Tabla MKPI_TL_MOMACON_ACTIVITY/ Fila " + contador);
					}

				}

				if (consulta.isEmpty()) {
					cargando.setText("ATENCION--> No hay órdenes con error backend. ");
					LOGGER.warn("ATENCION--> No hay órdenes con error backend. ");
				}
				consulta = "";

			} finally {
				porcentaje.setText(50 + "%");
				barraProgreso.setValue(500);
				if (resultado != null) {
					resultado.close();
				}
				if (sentencia != null) {
					sentencia.close();
				}
				count = 0;
				count2 = 0;
			}

			try {
				sentencia = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
				// Ejecutamos la sentencia de select
				if (entorno.getNombreCombo().equals(Entornos.PRODUCCION.getNombreCombo()))
					sql = propsConfig.getProperty("query.cuadre2P");
				else
					sql = propsConfig.getProperty("query.cuadre2D");
				System.out.println("Select: " + sql);
				resultado = sentencia.executeQuery(sql);
				if (resultado != null) {
					resultado.last();
					count = resultado.getRow();
					count2 = 50 / count;
					count = 500 / count;
					resultado.first();
					textarea.append(
							"##############################\r\n### Errores Desconocidos ZEUS ###\r\n##############################\r\n");
					while (resultado.next()) {
						contador++;
						orden = new BackendErrorOrder(resultado.getString("ID_WORK_ORDER"),
								resultado.getString("OPERACION_CODE"), resultado.getString("PROCESS_STATUS"),
								resultado.getString("COD_TEAM"), resultado.getString("UPDATE_DATE"),
								resultado.getString("MENSAJE_ERROR_INTEGRACION"));
						if (orden.getMensaje_error_integracion() != null) {
							if (!orden.getMensaje_error_integracion().toUpperCase()
									.contains(new String("7 Campo <rResultadoId> no informado").toUpperCase())
									&& !orden.getMensaje_error_integracion().toUpperCase()
											.contains(new String("7 La temporabilidad es obligatoria informarla")
													.toUpperCase())) {
								erroresBackend.add(orden);
								textarea.append(normalizaCadena(resultado.getString("ID_WORK_ORDER"), 30)
										+ normalizaCadena(resultado.getString("OPERACION_CODE"), 30)
										+ normalizaCadena(resultado.getString("PROCESS_STATUS"), 30)
										+ normalizaCadena(resultado.getString("COD_TEAM"), 30)
										+ normalizaCadena(resultado.getString("UPDATE_DATE"), 30)
										+ resultado.getString("MENSAJE_ERROR_INTEGRACION").replace("\n", "") + "\n");

								consulta += normalizaCadena(resultado.getString("ID_WORK_ORDER"), 30)
										+ normalizaCadena(resultado.getString("OPERACION_CODE"), 30)
										+ normalizaCadena(resultado.getString("PROCESS_STATUS"), 30)
										+ normalizaCadena(resultado.getString("COD_TEAM"), 30)
										+ normalizaCadena(resultado.getString("UPDATE_DATE"), 30)
										+ resultado.getString("MENSAJE_ERROR_INTEGRACION").replace("\n", "") + "\n";
							}
						}
						aux += count2;
						barraProgreso.setValue((int) (barraProgreso.getValue() + count));
						porcentaje.setText((int) aux + "%");
						cargando.setText("Cargando--> Tabla MKPI_TL_MOMACON_ACTIVITY/ Fila " + contador);
					}

				}
				if (consulta.isEmpty()) {
					cargando.setText("ATENCION--> No hay órdenes con error desconocido zeus.");
					LOGGER.warn("ATENCION--> No hay órdenes con error desconocido zeus.");
				}
				consulta = "";
			} finally {
				porcentaje.setText(100 + "%");
				barraProgreso.setValue(1000);
				if (resultado != null) {
					resultado.close();
				}
				if (sentencia != null) {
					sentencia.close();
				}
			}
		} finally {
			conexion.close();
		}
		return erroresBackend;
	}

	/**
	 * Metodo que ejecuta las query de KO creacion.
	 * 
	 * @param textarea
	 * @param excluidos
	 * @return kosCreacion
	 * @throws Exception
	 * @author f.guillen.caro
	 */
	public static ArrayList<KOCreacion> ejecutaQueryKOCreacion(JTextArea textarea, String excluidos,
			JProgressBar barraProgreso, JLabel porcentaje, JLabel cargando) throws Exception {
		Connection conexion = getConexionMomaWeb("cuadre");
		Set<String> idordenes = new TreeSet<String>();
		ArrayList<KOCreacion> kosCreacion = new ArrayList<KOCreacion>();
		barraProgreso.setValue(0);
		String ordenesFallidas = "";
		String aux = "";
		ResultSet resultado = null;
		String consulta = "";
		Statement sentencia = null;
		String sql = "";
		String lastdate = "";
		double count = 0;
		int contador = 0;
		double count2 = 0;
		double auxcont = 0;
		barraProgreso.setValue(0);
		porcentaje.setText("0%");
		cargando.setText("Cargando--> Tabla MOMA_TRACE_LOG/ Fila 1");
		try {
			try {
				sentencia = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

				if (excluidos.equals("")) {
					if (propsLastConfig.getProperty("cuadre.kocreacion.excluidos").equals("")) {
						sql = propsConfig.getProperty("query.kocreacion1.2");
					} else {
						sql = propsConfig.getProperty("query.kocreacion1");
						sql = sql.replace("{EXCLUIDOS}", propsLastConfig.getProperty("cuadre.kocreacion.excluidos"));
						excluidos = propsLastConfig.getProperty("cuadre.kocreacion.excluidos");
					}
				} else {
					excluidos = excluidos.replace("-", ",");
					StringTokenizer str = new StringTokenizer(excluidos, ",");
					while (str.hasMoreTokens()) {
						String token = str.nextToken();
						if (str.hasMoreTokens())
							aux += "'" + token + "',";
						else
							aux += "'" + token + "'";
					}
					if (propsLastConfig.getProperty("cuadre.kocreacion.excluidos").equals("")) {
						sql = propsConfig.getProperty("query.kocreacion1");
						sql = sql.replace("{EXCLUIDOS}", aux);
						propsLastConfig.setProperty("cuadre.kocreacion.excluidos", aux);

					} else {
						sql = propsConfig.getProperty("query.kocreacion1");
						excluidos = propsLastConfig.getProperty("cuadre.kocreacion.excluidos") + "," + aux;
						propsLastConfig.setProperty("cuadre.kocreacion.excluidos", excluidos);
						sql = sql.replace("{EXCLUIDOS}", aux);
					}
				}
				lastdate = propsLastConfig.getProperty("kocreacion.lastdate");
				lastdate = lastdate.replace("\\", "");
				sql = sql.replace("{LASTDATE}", lastdate);
				sql = sql.replace("\\", "");
				System.out.println("Select: " + sql);
				resultado = sentencia.executeQuery(sql);
				if (resultado != null) {
					resultado.last();
					count = resultado.getRow();
					count2 = 30 / count;
					count = 300 / count;
					resultado.first();
					while (resultado.next()) {
						contador++;
						if (resultado.isLast())
							ordenesFallidas += "'" + resultado.getString("WORK_ORDER") + "'";
						else
							ordenesFallidas += "'" + resultado.getString("WORK_ORDER") + "',";
						auxcont += count2;
						barraProgreso.setValue((int) (barraProgreso.getValue() + count));
						porcentaje.setText((int) auxcont + "%");
						cargando.setText("Cargando--> Tabla MOMA_TRACE_LOG/ Fila " + contador);
					}
				}
			} finally {
				porcentaje.setText(30 + "%");
				barraProgreso.setValue(300);
				aux = "";
				if (resultado != null) {
					resultado.close();
				}
				if (sentencia != null) {
					sentencia.close();
				}
				count = 0;
				count2 = 0;
				contador = 0;
			}
			if (!ordenesFallidas.isEmpty()) {
				auxcont = 30;
				StringTokenizer str = new StringTokenizer(ordenesFallidas, ",");
				if (str.countTokens() > 900) {
					JOptionPane.showMessageDialog(null,
							"La fecha es demasiado antigua, si no la ha introducido usted, revise el properties.",
							"Error", JOptionPane.ERROR_MESSAGE);
				} else {
					try {
						SimpleDateFormat entrada = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						SimpleDateFormat salida = new SimpleDateFormat("dd-MM-yy HH:mm:ss");
						sentencia = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
								ResultSet.CONCUR_READ_ONLY);
						sql = propsConfig.getProperty("query.kocreacion2");
						sql = sql.replace("{ORDENES}", ordenesFallidas);
						sql = sql.replace("\\", "");
						System.out.println("Select: " + sql);
						resultado = sentencia.executeQuery(sql);
						textarea.append("\r\n#################\r\n### KO Creacion ###\r\n#################\r\n");
						if (resultado != null) {
							resultado.last();
							count = resultado.getRow();
							count2 = 40 / count;
							count = 400 / count;
							resultado.first();
							while (resultado.next()) {
								if (!idordenes.contains(resultado.getString("WORK_ORDER"))) {
									idordenes.add(resultado.getString("WORK_ORDER"));
									kosCreacion.add(
											new KOCreacion(resultado.getString("WORK_ORDER"), resultado.getString(3),
													resultado.getString("DESCRIPTION"), "", "", "", "", ""));
									textarea.append(normalizaCadena(resultado.getString("WORK_ORDER"), 20)
											+ normalizaCadena(resultado.getString(3), 20)
											+ normalizaCadena(resultado.getString("DESCRIPTION"), 40) + "\n");

									consulta += normalizaCadena(resultado.getString("WORK_ORDER"), 20)
											+ normalizaCadena(resultado.getString(3), 20)
											+ normalizaCadena(resultado.getString("DESCRIPTION"), 40) + "\n";
									if (resultado.getString(3).contains(".")) {
										lastdate = resultado.getString(3).substring(0,
												resultado.getString(3).indexOf("."));
									} else {
										lastdate = resultado.getString(3);
									}
									Date fec = entrada.parse(lastdate);
									lastdate = salida.format(fec);
								}
								auxcont += count2;
								barraProgreso.setValue((int) (barraProgreso.getValue() + count));
								porcentaje.setText((int) auxcont + "%");
								cargando.setText("Cargando--> Tabla MOMA_TRACE_LOG/ Fila " + contador);
								contador++;
							}
						}
						propsLastConfig.setProperty("kocreacion.lastdate", lastdate);
						if (consulta.isEmpty()) {
							JOptionPane.showMessageDialog(null, "No hay órdenes con fallos de creación.", "Atención",
									JOptionPane.INFORMATION_MESSAGE);
						}
					} finally {
						if (resultado != null) {
							resultado.close();
						}
						if (sentencia != null) {
							sentencia.close();
						}
					}
					kosCreacion = filtroKOCreacion(kosCreacion);
				}

			}
			porcentaje.setText(70 + "%");
			barraProgreso.setValue(700);
			if (!excluidos.isEmpty()) {
				auxcont = 70;
				try {
					String token = "";
					ordenesFallidas = "";
					sentencia = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
					sql = propsConfig.getProperty("query.kocreacion.cribaexcluidos").replace("{LASTDATE}", lastdate)
							.replace("{EXCLUIDOS}", excluidos).replace("\\", "");
					System.out.println("Select: " + sql);
					resultado = sentencia.executeQuery(sql);
					if (resultado != null) {
						resultado.last();
						count = resultado.getRow();
						count2 = 30 / count;
						count = 300 / count;
						resultado.first();
						while (resultado.next()) {
							if (resultado.isLast())
								ordenesFallidas += "'" + resultado.getString("WORK_ORDER") + "'";
							else
								ordenesFallidas += "'" + resultado.getString("WORK_ORDER") + "',";
						}
					}
					StringTokenizer str = new StringTokenizer(excluidos, ",");
					int numtokens = str.countTokens();
					while (str.hasMoreTokens()) {
						token = str.nextToken();
						if (!ordenesFallidas.contains(token)) {
							if (!str.hasMoreTokens()) {
								if (numtokens == 1) {
									excluidos = excluidos.replace(token, "");
								} else
									excluidos = excluidos.replace("," + token, "");
							} else
								excluidos = excluidos.replace(token + ",", "");
						}
						auxcont += count2;
						barraProgreso.setValue((int) (barraProgreso.getValue() + count));
						porcentaje.setText((int) auxcont + "%");
						cargando.setText("Cargando--> Cribado excluidos/ Fila " + contador);
					}
					propsLastConfig.setProperty("cuadre.kocreacion.excluidos", excluidos);
				} finally {
					excluidos = "";
					if (resultado != null) {
						resultado.close();
					}
					if (sentencia != null) {
						sentencia.close();
					}
				}
			}

		} finally {
			porcentaje.setText(100 + "%");
			barraProgreso.setValue(1000);
			conexion.close();
		}
		return kosCreacion;
	}

	public static ArrayList<PdteBackend> ejecutaQueryPdteBackend(JTextArea textarea, JProgressBar barraProgreso,
			JLabel porcentaje, JLabel cargando) throws Exception {
		ArrayList<PdteBackend> pdtesBackend = new ArrayList<PdteBackend>();
		ResultSet resultado = null;
		Statement sentencia = null;
		Connection conexionKPI = getConexion("cuadre");
		String sql = propsConfig.getProperty("query.pdtesBackend");
		Date fechaActual = null;
		Date lastDate = null;
		try {
			sentencia = conexionKPI.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			resultado = sentencia.executeQuery(sql);
			if (null != resultado) {
				while (resultado.next()) {
					fechaActual = resultado.getDate("SYSDATE");
					lastDate = resultado.getDate("UPDATE_DATE");
					if (lastDate.getDate() != fechaActual.getDate()) {
						pdtesBackend.add(new PdteBackend(resultado.getString("ID_WORK_ORDER"),
								resultado.getString("UPDATE_DATE")));
					}

				}
			}

		} finally {

			if (resultado != null) {
				resultado.close();
			}
			if (sentencia != null) {
				sentencia.close();
			}
		}

		return pdtesBackend;
	}

	public static ArrayList<?> ejecutaQueryConsulta(JTextArea resultados, String tabla, String orden, String actividad,Properties pConfig,Properties pLastConfig)
			throws Exception {		
		propsConfig = pConfig;
		propsLastConfig = pLastConfig;
		Connection conexion = null;
		ArrayList<OrdenTrackActivity> ordenesTrackActivity = null;
		ArrayList<OrdenTrackOrder> ordenesTrackOrder = null;
		ArrayList<KOCreacion> ordenes = null;
		String sql = "";
		int contador = 0;
		switch (tabla) {
		case "MOMACON_ACTIVITY":
			ordenes = new ArrayList<KOCreacion>();
			sql = propsConfig.getProperty("query.momacon");
			sql = sql.replace("{ORDERS}", orden);
			break;
		case "TRACK_ORDER":
			ordenesTrackOrder = new ArrayList<OrdenTrackOrder>();
			sql = propsConfig.getProperty("query.trackorder");
			sql = sql.replace("{ORDER}", orden);
			break;
		case "TRACK_ACTIVITY":
			ordenesTrackActivity = new ArrayList<OrdenTrackActivity>();
			if (!orden.equals("") && !actividad.equals("")) {
				sql = propsConfig.getProperty("query.trackactivityOA");
				sql = sql.replace("{ORDER}", orden);
				sql = sql.replace("{ACTIVITY}", actividad);
			} else if (orden.equals("")) {
				sql = propsConfig.getProperty("query.trackactivityA");
				sql = sql.replace("{ACTIVITY}", actividad);
			} else {
				sql = propsConfig.getProperty("query.trackactivityO");
				sql = sql.replace("{ORDER}", orden);
			}

			break;
		}
		ResultSet resultado = null;
		Statement sentencia = null;
		try {
			if(tabla.equals("MOMACON_ACTIVITY")){
				conexion = getConexion("cuadre");
			}
			else{
				conexion = getConexionMomaWeb("cuadre");
			}
			sentencia = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

			resultado = sentencia.executeQuery(sql);
			if (null != resultado) {
				while (resultado.next()) {
					contador++;
					switch (tabla) {
					case "MOMACON_ACTIVITY":
						resultados.append("\n+---------------------------------------------------------------------------------------------------------------------------\n");
						resultados.append("|ORDEN: "+resultado.getString("ID_WORK_ORDER")+"  ACTIVIDAD: "+resultado.getString("APPT_NUMBER")+"  ESTADO: "+resultado.getString("ASTATUS")+"  ESTADO PROCESO: "+resultado.getString("PROCESS_STATUS")+"\n");
						resultados.append("+---------------------------------------------------------------------------------------------------------------------------\n");
						break;
					case "TRACK_ORDER":
						String xml = "";
						ordenesTrackOrder.add(new OrdenTrackOrder(resultado.getString(1),
								resultado.getString(2), resultado.getString(3), resultado.getString(4),
								resultado.getString(5), resultado.getString(6), resultado.getString(7),
								resultado.getString(8), resultado.getString(9), resultado.getString(10),
								resultado.getString(11), resultado.getString(12), resultado.getString(13),
								resultado.getString(14), resultado.getString(15), resultado.getString(16),
								resultado.getString(17), resultado.getString(18), resultado.getString(19), resultado.getString(20)));
						resultados.append("\n+---------------------------------------------------------------------------------------------------------------------------\n");
						resultados.append("|ORDEN Nº "+resultado.getString(7)+"\n");
						resultados.append("+---------------------------------------------------------------------------------------------------------------------------\n");
						resultados.append("+-----------------+\n");
						resultados.append("|ID_TRACK_ORDER    | "+resultado.getString(1)+"\n");
						resultados.append("+-----------------+\n");
						resultados.append("+-----------------+\n");
						resultados.append("|CREATE_DATE    | "+resultado.getString(2)+"\n");
						resultados.append("+-----------------+\n");
						resultados.append("+-----------------+\n");
						resultados.append("|UPDATE_DATE    | "+resultado.getString(3)+"\n");
						resultados.append("+-----------------+\n");
						resultados.append("+-----------------+\n");
						resultados.append("|UPDATE_PROGRAM    | "+resultado.getString(4)+"\n");
						resultados.append("+-----------------+\n");
						resultados.append("+-----------------+\n");
						resultados.append("|UPDATE_USER    | "+resultado.getString(5)+"\n");
						resultados.append("+-----------------+\n");
						resultados.append("+-----------------+\n");
						resultados.append("|VIEWABLE    | "+resultado.getString(6)+"\n");
						resultados.append("+-----------------+\n");
						resultados.append("+-----------------+\n");
						resultados.append("|ID_WORK_ORDER    | "+resultado.getString(7)+"\n");
						resultados.append("+-----------------+\n");
						resultados.append("+-----------------+\n");
						resultados.append("|NUMBER_MAX_ANOMALY    | "+resultado.getString(8)+"\n");
						resultados.append("+-----------------+\n");
						resultados.append("+-----------------+\n");
						resultados.append("|NUMBER_MAX_FAILS    | "+resultado.getString(9)+"\n");
						resultados.append("+-----------------+\n");
						resultados.append("+-----------------+\n");
						resultados.append("|NUMBER_MAX_FAILS_ABSENT    | "+resultado.getString(10)+"\n");
						resultados.append("+-----------------+\n");
						resultados.append("+-----------------+\n");
						resultados.append("|OPTIMIST_LOCK    | "+resultado.getString(11)+"\n");
						resultados.append("+-----------------+\n");
						xml = resultado.getString(12);
						xml = xml.replace("\n", "");
						resultados.append("+-----------------+\n");
						resultados.append("|ORDER_XML    | "+xml+"\n");
						resultados.append("+-----------------+\n");
						resultados.append("+-----------------+\n");
						resultados.append("|STATUS    | "+resultado.getString(13)+"\n");
						resultados.append("+-----------------+\n");
						resultados.append("+-----------------+\n");
						resultados.append("|NUMBER_INT_BATCH    | "+resultado.getString(14)+"\n");
						resultados.append("+-----------------+\n");
						resultados.append("+-----------------+\n");
						resultados.append("|ID_ERROR    | "+resultado.getString(15)+"\n");
						resultados.append("+-----------------+\n");
						resultados.append("+-----------------+\n");
						resultados.append("|ENVELOPE_ID    | "+resultado.getString(16)+"\n");
						resultados.append("+-----------------+\n");
						resultados.append("+-----------------+\n");
						resultados.append("|SECTOR_CODE    | "+resultado.getString(17)+"\n");
						resultados.append("+-----------------+\n");
						resultados.append("+-----------------+\n");
						resultados.append("|COUNTRY_CODE    | "+resultado.getString(18)+"\n");
						resultados.append("+-----------------+\n");
						resultados.append("+-----------------+\n");
						resultados.append("|COMPANY_CODE    | "+resultado.getString(19)+"\n");
						resultados.append("+-----------------+\n");
						resultados.append("+-----------------+\n");
						resultados.append("|MOTIVO_ANULACION    | "+resultado.getString(20)+"\n");
						resultados.append("+-----------------+\n");
						
						break;
					case "TRACK_ACTIVITY":
						
						ordenesTrackActivity.add(new OrdenTrackActivity(resultado.getString(1),
								resultado.getString(2), resultado.getString(3), resultado.getString(4),
								resultado.getString(5), resultado.getString(6), resultado.getString(7),
								resultado.getString(8), resultado.getString(9), resultado.getString(10),
								resultado.getString(11), resultado.getString(12), resultado.getString(13),
								resultado.getString(14), resultado.getString(15), resultado.getString(16), resultado.getString(17)));
						resultados.append("\n+---------------------------------------------------------------------------------------------------------------------------\n");
						resultados.append("|ORDEN "+resultado.getString(10)+"  ACTIVIDAD "+resultado.getString(9)+"\n");
						resultados.append("+---------------------------------------------------------------------------------------------------------------------------\n");
						resultados.append("+-----------------+\n");
						resultados.append("|ID_TRACK_ACTIVITY| "+resultado.getString(1)+"\n");
						resultados.append("+-----------------+\n");
						resultados.append("+-----------------+\n");
						resultados.append("|CREATE_DATE      | "+resultado.getString(2)+"\n");
						resultados.append("+-----------------+\n");
						resultados.append("+-----------------+\n");
						resultados.append("|UPDATE_DATE      | "+resultado.getString(3)+"\n");
						resultados.append("+-----------------+\n");
						resultados.append("+-----------------+\n");
						resultados.append("|UPDATE_PROGRAM   | "+resultado.getString(4)+"\n");
						resultados.append("+-----------------+\n");
						resultados.append("+-----------------+\n");
						resultados.append("|UPDATE_USER      | "+resultado.getString(5)+"\n");
						resultados.append("+-----------------+\n");
						resultados.append("+-----------------+\n");
						resultados.append("|VIEWABLE         | "+resultado.getString(6)+"\n");
						resultados.append("+-----------------+\n");
						resultados.append("+-----------------+\n");
						resultados.append("|ACTIVITY_XML     | "+resultado.getString(7)+"\n");
						resultados.append("+-----------------+\n");
						resultados.append("+-----------------+\n");
						resultados.append("|DATE_EXECUTION   | "+resultado.getString(8)+"\n");
						resultados.append("+-----------------+\n");
						resultados.append("+-----------------+\n");
						resultados.append("|ID_ACTIVITY      | "+resultado.getString(9)+"\n");
						resultados.append("+-----------------+\n");
						resultados.append("+-----------------+\n");
						resultados.append("|ID_WORK_ORDER    | "+resultado.getString(10)+"\n");
						resultados.append("+-----------------+\n");
						resultados.append("+-----------------+\n");
						resultados.append("|NUMBER_ANOMALY   | "+resultado.getString(11)+"\n");
						resultados.append("+-----------------+\n");
						resultados.append("+-----------------+\n");
						resultados.append("|NUMBER_FAILS     | "+resultado.getString(12)+"\n");
						resultados.append("+-----------------+\n");
						resultados.append("+-------------------+\n");
						resultados.append("|NUMBER_FAILS_ABSENT| "+resultado.getString(13)+"\n");
						resultados.append("+-------------------+\n");
						resultados.append("+-----------------+\n");
						resultados.append("|OPTIMIST_LOCK    | "+resultado.getString(14)+"\n");
						resultados.append("+-----------------+\n");
						resultados.append("+-----------------+\n");
						resultados.append("|STATUS           | "+resultado.getString(15)+"\n");
						resultados.append("+-----------------+\n");
						resultados.append("+-----------------+\n");
						resultados.append("|ID_TRACK_ORDER   | "+resultado.getString(16)+"\n");
						resultados.append("+-----------------+\n");
						resultados.append("+-----------------+\n");
						resultados.append("|OPERATION_TYPE   | "+resultado.getString(17)+"\n");
						resultados.append("+-----------------+\n");
						break;

					default:
						break;
					}
				}
			}

		} finally {

			if (resultado != null) {
				resultado.close();
			}
			if (sentencia != null) {
				sentencia.close();
			}

		}

		if (tabla.equals("MOMACON_ACTIVITY")) {
			return ordenes;
		} else if (tabla.equals("TRACK_ORDER")) {
			return ordenesTrackOrder;
		} else {
			return ordenesTrackActivity;
		}
	}

	/**
	 * Metodo que guarda los cambios de un fichero propertie
	 * 
	 * @param props
	 * @param file
	 * @author f.guillen.caro
	 */
	public static void savePropertie(File file) {
		FileOutputStream fr = null;
		try {
			fr = new FileOutputStream(file);
			propsLastConfig.store(new OutputStreamWriter(fr, "UTF-8"), "Properties");
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Metodo que comprueba si los errores en backend son responsabilidad
	 * nuestra.
	 * 
	 * @param filtro
	 * @param orden
	 * @return correcto
	 * @author Francisco Guillén
	 */
	public static boolean compruebaFiltro(List<String> filtro, BackendErrorOrder orden) {
		boolean correcto = false;
		for (String descripcion : filtro) {
			if (orden.getMensaje_error_integracion().toUpperCase().contains(descripcion.toUpperCase())) {
				correcto = true;
				break;
			}
		}
		return correcto;
	}

	/**
	 * Metodo que a�ade a una cadena espacios al final hasta completar la
	 * longitud indicada
	 * 
	 * @param cadena
	 * @param longitud
	 * @return
	 */
	private static String normalizaCadena(String cadena, int longitud) {
		String cadenaOut = cadena;
		if (cadenaOut == null)
			cadenaOut = "";
		while (cadenaOut.length() < longitud)
			cadenaOut += " ";
		return cadenaOut;
	}

	/**
	 * Metodo que ejecuta la query dado y devuelve una matriz con los campos
	 * recuperados
	 * 
	 * @param query
	 * @param query
	 * @param campos
	 * @return
	 * @throws Exception
	 */
	public static List<String[]> ejecutaQuery(String baseDatos, String query, String[] campos) throws Exception {
		System.out.println("Query: " + query);

		ResultSet resultado = null;
		Statement sentencia = null;
		if (baseDatos.equals(DB_KPI))
			sentencia = getConexion("").createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
		else
			sentencia = getConexionMomaWeb("").createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);

		// Ejecutamos la query
		resultado = sentencia.executeQuery(query);

		// Recorremos el resultado para montar la lista de salida
		List<String[]> salida = new ArrayList<String[]>();
		if (resultado != null) {
			while (resultado.next()) {
				String[] fila = new String[campos.length];
				for (int i = 0; i < campos.length; i++) {
					fila[i] = resultado.getString(campos[i]);
				}
				salida.add(fila);
			}
		}

		sentencia.close();

		return salida;
	}

	/**
	 * Metodo que añade las acciones correspondientes a los ko en creacion en
	 * funcion al filtro recogido del propertie.
	 * 
	 * @param koscreacion
	 * @return ArrayList<KOCreacion>
	 * @throws Exception
	 */
	@SuppressWarnings("resource")
	public static ArrayList<KOCreacion> filtroKOCreacion(ArrayList<KOCreacion> koscreacion) throws Exception {
		String filtro = propsConfig.getProperty("cuadre.filtros.kocreacion").replace("\\", "");
		List<String> listaFiltro = Arrays.asList(filtro.split(";"));
		System.out.println(filtro);
		Connection conexionKPI = getConexion("cuadre");
		Connection conexionWEB = getConexionMomaWeb("cuadre");
		ArrayList<String> aux = null;
		StringTokenizer str = null;
		ResultSet resultado = null;
		Statement sentencia = null;
		String sql = "";
		String token = "";
		boolean contiene = false;
		try {
			for (KOCreacion ko : koscreacion) {
				contiene = false;
				for (String descripcion : listaFiltro) {
					str = new StringTokenizer(descripcion, "-");
					aux = new ArrayList<String>();
					while (str.hasMoreTokens()) {
						token = str.nextToken();
						aux.add(token);
					}
					if (ko.getError() != null) {
						if (ko.getError().toUpperCase().contains(aux.get(0))) {
							contiene = true;
						}
						if (ko.getError().toUpperCase().contains(aux.get(0))) {
							if (!aux.get(1).isEmpty()) {
								if (!aux.get(1).equals("NADA"))
									ko.setResponsable(aux.get(1));
							}
							if (!aux.get(2).isEmpty()) {
								if (!aux.get(2).equals("NADA")) {
									ko.setAccionMoma(aux.get(2));
								}
							}
							if (!aux.get(3).isEmpty()) {
								if (!aux.get(3).equals("NADA")) {
									if (aux.get(3).equals("BUCKET")) {
										try {
											sentencia = conexionWEB.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
													ResultSet.CONCUR_READ_ONLY);
											sql = propsConfig.getProperty("query.kocreacion.bucket");
											sql = sql.replace("{VALUE}", "'"
													+ StringUtils.substringAfter(ko.getError(), " codigoPostal:").trim()
													+ "'");
											sql = sql.replace("\\", "");
											System.out.println("Select: " + sql);
											resultado = sentencia.executeQuery(sql);
											if (!resultado.next()) {
												ko.setAccionNegocio("Dar de alta el codigo postal");
											}
										} finally {
											if (resultado != null) {
												resultado.close();
											}
											if (sentencia != null) {
												sentencia.close();
											}
										}
									} else
										ko.setAccionNegocio(aux.get(3));

								}
							}
							if (!aux.get(4).isEmpty()) {
								if (!aux.get(4).equals("NADA")) {
									switch (aux.get(4)) {
									case "VINCULADA":
										try {
											sentencia = conexionKPI.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
													ResultSet.CONCUR_READ_ONLY);
											if (entorno.equals(Entornos.PRODUCCION))
												sql = propsConfig.getProperty("query.kocreacionP.vinculadas");
											else
												sql = propsConfig.getProperty("query.kocreacionD.vinculadas");
											sql = sql.replace("{IDORDER}", "'" + StringUtils
													.substringAfter(ko.getError(), " Orden vinculada:").trim() + "'");
											sql = sql.replace("\\", "");
											System.out.println("Select: " + sql);
											resultado = sentencia.executeQuery(sql);
											if (resultado.next()) {
												if ("Iniciada".equals(resultado.getString("ASTATUS"))
														|| "No iniciada".equals(resultado.getString("ASTATUS"))) {
													ko.setAccionZeus("Relanzar creación, ya existe la orden vinculada");
												} else {
													ko.setAccionZeus(
															"orden vinculada en estado incompatible, revisar y en su caso"
																	+ " enviar la orden sin orden vinculada");
												}
											} else {
												ko.setAccionZeus(
														"Revisar orden, la vinculada no existe en nuestros sistemas");
											}
										} finally {
											if (resultado != null) {
												resultado.close();
											}
											if (sentencia != null) {
												sentencia.close();
											}
										}
										break;
									case "BUCKET":
										try {
											sentencia = conexionWEB.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
													ResultSet.CONCUR_READ_ONLY);
											sql = propsConfig.getProperty("query.kocreacion.bucket");
											sql = sql.replace("{VALUE}", "'"
													+ StringUtils.substringAfter(ko.getError(), " codigoPostal:").trim()
													+ "'");
											sql = sql.replace("\\", "");
											resultado = sentencia.executeQuery(sql);
											if (resultado.next()) {
												ko.setAccionZeus(
														"Reenviar orden, ya esta dado de alta el código postal");
											}
										} finally {
											if (resultado != null) {
												resultado.close();
											}
											if (sentencia != null) {
												sentencia.close();
											}
										}
										break;
									default:
										ko.setAccionZeus(aux.get(4));
										break;
									}
								}
							}
							if (!aux.get(5).isEmpty()) {
								if (!aux.get(5).equals("NADA"))
									ko.setEstadoOperacionZeus(aux.get(5));
							}
						}
					}
				}
				if (!contiene)
					ko.setAccionMoma("Revisar");
			}
		} finally {
			conexionKPI.close();
			conexionWEB.close();
		}
		return koscreacion;
	}

	public static ArrayList<BackendErrorOrder> ejecutaQueryExtrac(Properties pConfig, Properties pLastConfig)
			throws Exception {
		propsConfig = pConfig;
		propsLastConfig = pLastConfig;
		Connection conexion = getConexion("cuadre");

		ArrayList<BackendErrorOrder> errorestotal = llenaArrayTest();
		ResultSet resultado = null;
		String consulta = "";
		String sql = "";
		Statement sentencia = null;
		int cont = 0;
		try {
			sentencia = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			// Ejecutamos la sentencia de select

			sql = "SELECT ID_WORK_ORDER,ASTATUS,PROCESS_STATUS, UPDATE_DATE FROM MOMAKPIP.MKPI_TL_MOMACON_ACTIVITY WHERE ID_WORK_ORDER IN("
					+ linea + ") AND ASTATUS <> 'Fallida' ORDER BY ID_WORK_ORDER DESC";
			sql = sql.replace("\\", "");
			System.out.println("Select: " + sql);
			resultado = sentencia.executeQuery(sql);
			if (resultado != null) {
				while (resultado.next()) {
					cont++;
					System.out.println(cont);
					for (int i = 0; i < errorestotal.size(); i++) {
						if (errorestotal.get(i).getIdentificador().equals(resultado.getString("ID_WORK_ORDER"))) {
							errorestotal.set(i, new BackendErrorOrder(resultado.getString("ID_WORK_ORDER"), "",
									resultado.getString("PROCESS_STATUS"), "", resultado.getString("UPDATE_DATE"), ""));
						}
					}
				}

			}

		} finally {

			if (resultado != null) {
				resultado.close();
			}
			if (sentencia != null) {
				sentencia.close();
			}
		}
		return errorestotal;

	}

	public static ArrayList<BackendErrorOrder> llenaArrayTest() {
		ArrayList<BackendErrorOrder> ordenes = new ArrayList<>();
		String newline = linea.replaceAll("'", "");
		StringTokenizer strt = new StringTokenizer(newline, ",");
		while (strt.hasMoreTokens()) {
			ordenes.add(new BackendErrorOrder(strt.nextToken(), "", "No existe en MOMA", "", "", ""));
		}

		return ordenes;

	}
}