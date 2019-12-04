package momatools.gui.tabs;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Properties;
import java.util.StringTokenizer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import org.apache.poi.openxml4j.util.ZipSecureFile;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import gnf.sender.init.Entornos;
import gnf.sender.init.PropertiesToLoad;
import momatools.data.Database;
import momatools.gui.main.FileUtils;
import momatools.gui.main.GuiUtils;
import regularizacion.persistence.entity.BackendErrorOrder;
import regularizacion.persistence.entity.KOCreacion;
import regularizacion.persistence.entity.PdteBackend;

/**
 * Tab para automatizar el proceso del cuadre moma zeus
 * 
 * @author f.guillen.caro
 */
public class TabCuadreMomaZeus extends TabParents implements Runnable {
	/**
	 * Serial default.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Constante que define el nombre por defecto del excel generado.
	 */
	private static final String NOMBREEXCELCUADRE = "PS-MoMa_SeguimientoErrorBackend.xlsx";
	/**
	 * Constante con los entornos disponibles.
	 */
	private static final Entornos[] ENVIRONMENTS = { Entornos.PRODUCCION, Entornos.DESARROLLO };
	/**
	 * Campo de texto donde se almacenara la ruta de destino del excel.
	 */
	private static final JTextField jtfDestino = new JTextField("");
	/**
	 * Campo de texto donde se almacenaran las ordenes a excluir.
	 */
	private static final JTextField jtfExcluidos = new JTextField("");
	/**
	 * Boton cuya accion generara los ficheros surgidos del cuadre.
	 */
	private static final JButton botonGenerar = new JButton("Generar");
	/**
	 * Boton cuya accion sera elegir el directorio donde guardaremos los
	 * ficheros.
	 */
	private static final JButton botonBuscarFich = new JButton("Buscar...");
	/**
	 * Boton cuya accion borrara el contenido del area de texto.
	 */
	private static final JButton botonLimpiar = new JButton("Limpiar");
	/**
	 * Desplegable para seleccionar el entorno sobre el que se lanzaran las
	 * queries.
	 */
	private static final JComboBox<Entornos> envCombo = new JComboBox<Entornos>(ENVIRONMENTS);
	/**
	 * Barra de progreso.
	 */
	private static final JProgressBar barraProgreso = new JProgressBar(0, 1000);
	/**
	 * Propiedades, la primera de solo lectura y sobre la segunda se escribirá.
	 */
	private Properties propsConfig;
	private Properties propsLastConfig;
	/**
	 * Etiquetas.
	 */
	private static final JLabel jlBuscar = new JLabel("En la ruta:");
	private static final JLabel jlExcluidos = new JLabel("[Opcional]Excluir ordenes(Ej:234-235):");
	private static final JLabel jlEnv = new JLabel("Elige el entorno:");
	private static final JLabel jlPorcentaje = new JLabel("0%");
	private static final JLabel jlCargando = new JLabel("Cargando-->");
	/**
	 * Hilo de la clase
	 */
	private Thread hilo;
	/**
	 * Booleano que determinará la ejecución del hilo.
	 */
	private boolean parar;

	/**
	 * Constructor de la clase
	 * 
	 * @param layout
	 * @param resultados
	 */
	public TabCuadreMomaZeus(JTextArea resultados, Properties propsConfig, Properties propsLastConfig) {
		super(new GridBagLayout(), resultados);
		this.propsConfig = propsConfig;
		this.propsLastConfig = propsLastConfig;
		initComponents();
	}
	
	/**
	 * Metodo que inicia los valores de los atributos de la clase.
	 */
	@Override
	public void initComponents() {
		hilo = null;
		parar = true;
		barraProgreso.setValue(0);
		resultados.setEditable(false);
		botonGenerar.setEnabled(false);
		barraProgreso.setToolTipText("Barra donde se muestra el progreso del proceso");
		envCombo.setToolTipText("Entorno contra el que se lanzará el cuadre");
		jtfExcluidos.setToolTipText("Órdenes a excluir del cuadre");
		botonBuscarFich.setToolTipText("Pulsa para seleccionar una ruta donde guardar el excel");
		botonLimpiar.setToolTipText("Pulsa para limpiar texto, barra y ruta");
		botonGenerar.setToolTipText("Pulsa para generar el excel");
//		envCombo.setEnabled(false);
		oyentes();
		posicionamiento();
//		ArrayList<BackendErrorOrder> ordenes = null;
//		try {
//			ordenes = Database.ejecutaQueryExtrac(propsConfig, propsLastConfig);
//		} catch (Exception e2) {
//			// TODO Auto-generated catch block
//			e2.printStackTrace();
//		}
//		Database.savePropertie(new File(System.getProperty("user.dir"), PropertiesToLoad.LAST_CONFIG.toString()));
//		XSSFWorkbook excelWO = null;
//		FileOutputStream fileOut = null;
//		try {
//			fileOut = new FileOutputStream("C:\\Users\\f.a.guillen.caro\\Desktop\\probando2.xlsx");
//		} catch (FileNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		try {
//			excelWO = new XSSFWorkbook(this.getClass().getClassLoader().getResourceAsStream("test.xlsx"));
//			informarEstadosextraccion(excelWO, ordenes, ordenes.size());
//			
//			excelWO.write(fileOut);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
	}

	/**
	 * Metodo donde se añade accion a los componentes de nuestro tab.
	 */
	public void oyentes() {

		botonGenerar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String resp = "";
				File dir = new File(jtfDestino.getText());
				if (dir.exists()) {
					
					if (envCombo.getSelectedItem().equals(Entornos.PRODUCCION)) {
						int confirm = 0;
						confirm = JOptionPane.showConfirmDialog(null,
								"Parte del proceso se realizará sobre producción, ¿desea continuar?", "ATENCIÓN",
								JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
						if (confirm == 0) {
							resp = compruebaExcluidos();
							if (resp.equals("")) {
								EventQueue.invokeLater(new Runnable() {
									
									@Override
									public void run() {
										botonGenerar.setEnabled(false);
										botonLimpiar.setEnabled(false);
										botonBuscarFich.setEnabled(false);
										jtfDestino.setEnabled(false);
										jtfExcluidos.setEnabled(false);
									}
								});
								iniciar();
							} else{
								JOptionPane.showMessageDialog(null, resp, "Error", JOptionPane.INFORMATION_MESSAGE);
							}
						}
					} else {
						resp = compruebaExcluidos();
						if (resp.equals("")) {
							EventQueue.invokeLater(new Runnable() {
								
								@Override
								public void run() {
									botonGenerar.setEnabled(false);
									botonLimpiar.setEnabled(false);
									botonBuscarFich.setEnabled(false);
									jtfDestino.setEnabled(false);
									jtfExcluidos.setEnabled(false);
								}
							});
							iniciar();
						} else{
							JOptionPane.showMessageDialog(null, resp, "Error", JOptionPane.INFORMATION_MESSAGE);
						}					
					}
					
				} else
					JOptionPane.showMessageDialog(null, "No existe el directorio indicado.", "Error",
							JOptionPane.INFORMATION_MESSAGE);
			}
		});
		botonBuscarFich.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FileUtils.selectFolder(jtfDestino, "");
			}
		});
		jtfDestino.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void removeUpdate(DocumentEvent e) {
				if (jtfDestino.getText().equals(""))
					botonGenerar.setEnabled(false);
			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				botonGenerar.setEnabled(true);
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
			}
		});
		botonLimpiar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int confirm = JOptionPane.showConfirmDialog(null, "Se borrarán todos los datos rellenados, ¿desea continuar?",
						"ATENCIÓN", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if (confirm == 0) {
					resultados.setText("En esta zona se vera el resultado de la tarea que se ejecute");
					barraProgreso.setValue(0);
					jlCargando.setText("Cargando-->");
					jlPorcentaje.setText("0%");
					jtfDestino.setText("");
				}

			}
		});
	}

	/**
	 * Metodo donde se posiciona los componentes de nuestro tab.
	 */
	public void posicionamiento() {
		add(jlBuscar, GuiUtils.posicionarElemento(10, 1, 0, 2, 1, 1, GridBagConstraints.NONE, GridBagConstraints.WEST));
		add(jtfDestino, GuiUtils.posicionarElemento(300, 1, 1, 2, 1, 1, GridBagConstraints.HORIZONTAL,
				GridBagConstraints.WEST));
		add(jlExcluidos, GuiUtils.posicionarElemento(100, 1, 0, 3, 1, 1, GridBagConstraints.HORIZONTAL,
				GridBagConstraints.EAST));
		add(jtfExcluidos, GuiUtils.posicionarElemento(100, 1, 1, 3, 1, 1, GridBagConstraints.HORIZONTAL,
				GridBagConstraints.WEST));
		add(botonBuscarFich,
				GuiUtils.posicionarElemento(10, 1, 2, 2, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.EAST));
		add(jlEnv,
				GuiUtils.posicionarElemento(10, 1, 0, 4, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.EAST));
		add(envCombo,
				GuiUtils.posicionarElemento(10, 0, 1, 4, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.EAST));
		add(jlPorcentaje,
				GuiUtils.posicionarElemento(50, 20, 0, 6, 2, 1, GridBagConstraints.NONE, GridBagConstraints.WEST,new Insets(0, 70, 0, 0)));
		add(barraProgreso,
				GuiUtils.posicionarElemento(5, 20, 0, 6, 2, 1, GridBagConstraints.NONE, GridBagConstraints.WEST));
		add(jlCargando,
				GuiUtils.posicionarElemento(5, 20, 0, 7, 2, 1, GridBagConstraints.NONE, GridBagConstraints.WEST));
		add(botonGenerar,
				GuiUtils.posicionarElemento(5, 1, 1, 6, 2, 1, GridBagConstraints.NONE, GridBagConstraints.WEST));
		add(botonLimpiar,
				GuiUtils.posicionarElemento(5, 1, 2, 6, 2, 1, GridBagConstraints.NONE, GridBagConstraints.WEST));
	}

	/**
	 * Metodo donde se llama a los metodos que ejecutan las queries para el
	 * cuadre y hace llamada al metodo que genera el excel.
	 * 
	 * @return String
	 */
	public void excelCuadre() {
		ArrayList<BackendErrorOrder> ordenesBackend = null;
		ArrayList<KOCreacion> ordenesKO = null;
		ArrayList<PdteBackend> ordenesPdte = null;
		String resp = "";
		String excluidos = jtfExcluidos.getText();
		if (!excluidos.equals("")) {
			StringTokenizer str = new StringTokenizer(excluidos, " ,-");
			String aux = "";
			while (str.hasMoreTokens()) {
				aux += "'" + str.nextToken() + "',";
			}
			aux = aux.substring(0, aux.length() - 1);
		}
		try {
			ordenesBackend = Database.ejecutaQueryErrores(resultados, (Entornos) envCombo.getSelectedItem(),
					barraProgreso, jlPorcentaje, jlCargando, propsConfig, propsLastConfig);
			ordenesKO = Database.ejecutaQueryKOCreacion(resultados, excluidos, barraProgreso, jlPorcentaje, jlCargando);
			ordenesPdte = Database.ejecutaQueryPdteBackend(resultados, barraProgreso, jlPorcentaje, jlCargando);
			Database.savePropertie(new File(System.getProperty("user.dir"), PropertiesToLoad.LAST_CONFIG.toString()));
			
		} catch (Exception e) {
			resp = "Error de conexión. Comprueba tu conexión a la vpn.";
			e.printStackTrace();
		}
		if (!resp.equals(""))
			JOptionPane.showMessageDialog(null, resp, "ATENCIÓN", JOptionPane.INFORMATION_MESSAGE);
		generarInforme(ordenesBackend, ordenesKO,ordenesPdte);

	}

	/**
	 * Método que genera un excel a partir de una plantilla.
	 * 
	 * @param ordenesBackend
	 */
	public void generarInforme(ArrayList<BackendErrorOrder> ordenesBackend, ArrayList<KOCreacion> ordenesKO, ArrayList<PdteBackend> ordenesPdte) {
		System.out.println("Generar informe");
		XSSFWorkbook excelWO = null;
		FileOutputStream fileOut = null;
		Calendar c = new GregorianCalendar();
		try {
			// Abrir la plantilla excel e informar las distintas pestañas
			ZipSecureFile.setMinInflateRatio(0.00001);
			if(String.valueOf(c.get(Calendar.MONTH)+1).length()<2){
				if(String.valueOf(c.get(Calendar.DAY_OF_MONTH)).length()<2){
					fileOut = new FileOutputStream(jtfDestino.getText() + "\\" + c.get(Calendar.YEAR) + "0"
							+ (c.get(Calendar.MONTH) + 1) + "0" + c.get(Calendar.DAY_OF_MONTH) + "_" + NOMBREEXCELCUADRE);
				}else{
					fileOut = new FileOutputStream(jtfDestino.getText() + "\\" + c.get(Calendar.YEAR) + "0"
							+ (c.get(Calendar.MONTH) + 1) + c.get(Calendar.DAY_OF_MONTH) + "_" + NOMBREEXCELCUADRE);
				}

			}else{
				if(String.valueOf(c.get(Calendar.DAY_OF_MONTH)).length()<2){
					fileOut = new FileOutputStream(jtfDestino.getText() + "\\" + c.get(Calendar.YEAR)
							+ (c.get(Calendar.MONTH) + 1) + "0" + c.get(Calendar.DAY_OF_MONTH) + "_" + NOMBREEXCELCUADRE);
				}else{
					fileOut = new FileOutputStream(jtfDestino.getText() + "\\" + c.get(Calendar.YEAR)
							+ (c.get(Calendar.MONTH) + 1) + c.get(Calendar.DAY_OF_MONTH) + "_" + NOMBREEXCELCUADRE);
				}
			}
			excelWO = new XSSFWorkbook(this.getClass().getClassLoader().getResourceAsStream("plantillaCuadre.xlsx"));
			informarPestaniaBackend(excelWO, ordenesBackend, 4, 6, ordenesBackend.size());
			informarPestaniaKO(excelWO, ordenesKO, 4, 3, ordenesKO.size());
			informarPestaniaPdteBackend(excelWO, ordenesPdte, 3, ordenesPdte.size());
			
			excelWO.write(fileOut);
			JOptionPane.showMessageDialog(null, "Se ha generado su excel correctamente.", "Correcto",
					JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al generar plantilla", "ATENCIÓN", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		} finally {
			try {
				fileOut.close();
				excelWO.close();
			} catch (IOException e) {
			}
		}
	}

	/**
	 * Método que informa y rellena la pestaña Error Backend.
	 * 
	 * @param excelWO
	 * @param ordenes
	 * @param pestania
	 * @param desdeFila
	 * @param maxColumnas
	 * @param maxFilas
	 */
	private void informarPestaniaBackend(XSSFWorkbook excelWO, ArrayList<BackendErrorOrder> ordenes, int desdeColumna,
			int maxColumnas, int maxFilas) {
		// Abrimos la plantilla del informe piloto
		XSSFSheet sheet = excelWO.getSheet("Error Backend");
		XSSFRow row;
		XSSFCell cell;
		int numFila = 0;
		int longitud = 11;
		Iterator<BackendErrorOrder> registros = ordenes.iterator();
		double count = ordenes.size();
		int contador = 0;
		double count2 = 0;
		double auxcont = 0;
		barraProgreso.setValue(0);
		jlPorcentaje.setText("0%");
		jlCargando.setText("Cargando--> Excel / Pestaña Error Backend/ Fila 1 / Columna ID_WORK_ORDER");
		count2 = 100/count;
		count = 1000/count;	
		while (registros.hasNext() || numFila < maxFilas) {
			contador++;
			if (numFila != 0) {
				BackendErrorOrder orden = registros.next();
				row = sheet.createRow(numFila);
				// Informamos las celdas con los valores obtenidos
				for (int f = 0; f < longitud; f++) {
					if (f > desdeColumna) {
						cell = row.createCell(f);
						switch (f) {
						case 5:
							cell.setCellValue(orden.getIdentificador());
							jlCargando.setText("Cargando--> Excel / Pestaña Error Backend/ Fila "+contador+" / Columna ID_WORK_ORDER");

							break;
						case 6:
							cell.setCellValue(orden.getOperacion_code());
							jlCargando.setText("Cargando--> Excel / Pestaña Error Backend/ Fila "+contador+" / Columna OPERATION_CODE");
							break;
						case 7:
							cell.setCellValue(orden.getProcess_status());
							jlCargando.setText("Cargando--> Excel / Pestaña Error Backend/ Fila "+contador+" / Columna PROCESS_STATUS");
							break;
						case 8:
							cell.setCellValue(orden.getCod_team());
							jlCargando.setText("Cargando--> Excel / Pestaña Error Backend/ Fila "+contador+" / COD_TEAM");
							break;
						case 9:
							cell.setCellValue(orden.getUpdate_date());
							jlCargando.setText("Cargando--> Excel / Pestaña Error Backend/ Fila "+contador+" / Columna UPDATE_DATE");
							break;
						case 10:
							cell.setCellValue(orden.getMensaje_error_integracion());
							jlCargando.setText("Cargando--> Excel / Pestaña Error Backend/ Fila "+contador+" / Columna MENSAJE_ERROR_INTEGRACION");
							break;
						}
					}

				}
			}
			auxcont += count2;
			barraProgreso.setValue((int) (barraProgreso.getValue()+count));
			jlPorcentaje.setText((int)auxcont+"%");
			numFila++;
		}
		barraProgreso.setValue(1000);
		jlPorcentaje.setText(100+"%");
	}

	
	/**
	 * Método que informa y rellena la pestaña Error Backend.
	 * 
	 * @param excelWO
	 * @param ordenes
	 * @param pestania
	 * @param desdeFila
	 * @param maxColumnas
	 * @param maxFilas
	 */
	private void informarPestaniaPdteBackend(XSSFWorkbook excelWO, ArrayList<PdteBackend> ordenes,
			int maxColumnas, int maxFilas) {
		// Abrimos la plantilla del informe piloto
		XSSFSheet sheet = excelWO.getSheet("Pdte BackEnd");
		PdteBackend orden = null;
		XSSFRow row;
		XSSFCell cell;
		int numFila = 0;
		int longitud = 3;
		Iterator<PdteBackend> registros = ordenes.iterator();
		double count = ordenes.size();
		int contador = 0;
		double count2 = 0;
		double auxcont = 0;
		barraProgreso.setValue(0);
		jlPorcentaje.setText("0%");
		jlCargando.setText("Cargando--> Excel / Pestaña Pdte BackEnd/ Fila 1 / Columna CÓDIGO OPERACIÓN");
		count2 = 100/count;
		count = 1000/count;	
		while (registros.hasNext() || numFila < maxFilas) {
			contador++;
			if (numFila != 0) {
				orden = registros.next();
				row = sheet.createRow(numFila);
				// Informamos las celdas con los valores obtenidos
				for (int f = 0; f < longitud; f++) {
						cell = row.createCell(f);
						switch (f) {
						case 0:
							cell.setCellValue("Revisar");
							jlCargando.setText("Cargando--> Excel / Pestaña Pdte BackEnd/ Fila "+contador+" / Columna ACCIÓN ZEUS");
							break;
						case 1:
							cell.setCellValue(orden.getCodigo_operacion());
							jlCargando.setText("Cargando--> Excel / Pestaña Pdte BackEnd/ Fila "+contador+" / Columna CÓDIGO OPERACIÓN");
							break;
						case 2:
							cell.setCellValue(orden.getFecha_error());
							jlCargando.setText("Cargando--> Excel / Pestaña Pdte BackEnd/ Fila "+contador+" / Columna ÚLTIMA MODIFICACIÓN");
							break;
					
						}
				}
			}
			auxcont += count2;
			barraProgreso.setValue((int) (barraProgreso.getValue()+count));
			jlPorcentaje.setText((int)auxcont+"%");
			numFila++;
		}
		barraProgreso.setValue(1000);
		jlPorcentaje.setText(100+"%");
	}
	
	/**
	 * Metodo que informa y rellena la pestaña de KO Creacion.
	 * 
	 * @param excelWO
	 * @param ordenes
	 * @param desdeFila
	 * @param maxColumnas
	 * @param maxFilas
	 */
	private void informarPestaniaKO(XSSFWorkbook excelWO, ArrayList<KOCreacion> ordenes, int desdeColumna,
			int maxColumnas, int maxFilas) {
		// Abrimos la plantilla del informe piloto
		XSSFSheet sheet = excelWO.getSheet("KO Creacion");
		XSSFRow row;
		XSSFCell cell;
		int numFila = 0;
		int longitud = 10;
		int i = 0;
		double count = ordenes.size();
		int contador = 0;
		double count2 = 0;
		double auxcont = 0;
		barraProgreso.setValue(0);
		jlPorcentaje.setText("0%");
		jlCargando.setText("Cargando--> Excel / Pestaña Error Creación/ Fila 1 / Columna responsable");
		count2 = 100/count;
		count = 1000/count;	
		while (i < ordenes.size() || numFila < maxFilas) {
			contador++;
			if (numFila != 0) {
				KOCreacion orden = ordenes.get(i);
				i++;
				row = sheet.createRow(numFila);
				// Informamos las celdas con los valores obtenidos
				for (int f = 0; f < longitud; f++) {
					cell = row.createCell(f);
					switch (f) {
					case 0:
						cell.setCellValue(orden.getResponsable());
						jlCargando.setText("Cargando--> Excel / Pestaña Error Creación/ Fila "+contador+" / Columna Responsable");
						break;
					case 1:
						cell.setCellValue(orden.getAccionMoma());
						jlCargando.setText("Cargando--> Excel / Pestaña Error Creación/ Fila "+contador+" / Columna Acción Moma");
						break;
					case 2:
						cell.setCellValue(orden.getAccionNegocio());
						jlCargando.setText("Cargando--> Excel / Pestaña Error Creación/ Fila "+contador+" / Columna Acción Negocio");
						break;
					case 3:
						cell.setCellValue(orden.getAccionZeus());
						jlCargando.setText("Cargando--> Excel / Pestaña Error Creación/ Fila "+contador+" / Columna Acción Zeus");
						break;
					case 4:
						cell.setCellValue(orden.getEstadoOperacionZeus());
						jlCargando.setText("Cargando--> Excel / Pestaña Error Creación/ Fila "+contador+" / Columna Estado operación Zeus");
						break;
					case 5:
						cell.setCellValue(orden.getCodigo_operacion());
						jlCargando.setText("Cargando--> Excel / Pestaña Error Creación/ Fila "+contador+" / Columna Código_Operación");
						break;
					case 8:
						cell.setCellValue(orden.getFecha_error());
						jlCargando.setText("Cargando--> Excel / Pestaña Error Creación/ Fila "+contador+" / Columna Fecha_Error");
						break;
					case 9:
						cell.setCellValue(orden.getError());
						jlCargando.setText("Cargando--> Excel / Pestaña Error Creación/ Fila "+contador+" / Columna Mensaje_Error");
						break;
					}
				}
			}
			auxcont += count2;
			barraProgreso.setValue((int) (barraProgreso.getValue()+count));
			jlPorcentaje.setText((int)auxcont+"%");
			numFila++;
		}
		barraProgreso.setValue(1000);
		jlPorcentaje.setText(100+"%");
	}
	
	private void informarEstadosextraccion(XSSFWorkbook excelWO, ArrayList<BackendErrorOrder> ordenes, int maxFilas) {
		// Abrimos la plantilla del informe piloto
		XSSFSheet sheet = excelWO.getSheet("Sheet1");
		BackendErrorOrder orden = null;
		XSSFRow row;
		XSSFCell cell;
		int numFila = 0;
		int longitud = 3;
		Iterator<BackendErrorOrder> registros = ordenes.iterator();
		double count = ordenes.size();
		int contador = 0;
		double count2 = 0;
		double auxcont = 0;
		barraProgreso.setValue(0);
		jlPorcentaje.setText("0%");
		jlCargando.setText("Cargando--> Excel / Pestaña Pdte BackEnd/ Fila 1 / Columna CÓDIGO OPERACIÓN");
		count2 = 100/count;
		count = 1000/count;	
		while (registros.hasNext() || numFila < maxFilas) {
			contador++;
			if (numFila != 0) {
				orden = registros.next();
				row = sheet.createRow(numFila);
				// Informamos las celdas con los valores obtenidos
				for (int f = 0; f < longitud; f++) {
						cell = row.createCell(f);
						switch (f) {
						case 0:
							System.out.println(orden.getIdentificador());
							cell.setCellValue(orden.getIdentificador());
							jlCargando.setText("Cargando--> Excel / Pestaña Pdte BackEnd/ Fila "+contador+" / Columna ORDEN");
							break;
						case 1:
							cell.setCellValue(orden.getProcess_status());
							jlCargando.setText("Cargando--> Excel / Pestaña Pdte BackEnd/ Fila "+contador+" / Columna ESTADO");
							break;
						case 2:
							cell.setCellValue(orden.getUpdate_date());
							jlCargando.setText("Cargando--> Excel / Pestaña Pdte BackEnd/ Fila "+contador+" / Columna ÚLTIMA MODIFICACIÓN");
							break;
					
						}
				}
			}
			auxcont += count2;
			barraProgreso.setValue((int) (barraProgreso.getValue()+count));
			jlPorcentaje.setText((int)auxcont+"%");
			numFila++;
		}
		barraProgreso.setValue(1000);
		jlPorcentaje.setText(100+"%");
	}

	/**
	 * Metodo que comprueba que los datos introducidos en el campo de excluidos
	 * cumplan los requisitos.
	 * 
	 * @return String
	 */
	public String compruebaExcluidos() {
		String resp = "";
		int numOrdenes = 0;
		int numComas = 0;
		String excluido = jtfExcluidos.getText();
		StringTokenizer str = new StringTokenizer(excluido, " ,-");

		numOrdenes = str.countTokens();
		String ordenes = " ";
		for (int i = 0; i < numOrdenes; i++) {
			ordenes += str.nextToken();
		}
		str = new StringTokenizer(excluido, ordenes);
		while (str.hasMoreTokens()) {
			str.nextToken();
			numComas++;
		}
		if (numComas != numOrdenes - 1 || excluido.trim().charAt(0) == ',') {
			if (!excluido.equals(""))
				resp += "Por favor revise bien las comas.";
		}
		for (int i = 0; i < excluido.length(); i++) {
			if (Character.isLetter(excluido.charAt(i))) {
				resp += "El campo excluidos contiene letras.";
				break;
			}
			if (excluido.charAt(i) < 48 || excluido.charAt(i) > 57) {
				if (excluido.charAt(i) != ',' && excluido.charAt(i) != '-') {
					resp += "Debes separar las órdenes por comas o guiones.";
					break;
				}
			}
		}
		return resp;
	}

	/**
	 * Método donde se lleva a cabo la ejecución del hilo.
	 */
	@Override
	public void run() {
		if (!parar) {
			excelCuadre();
			parar();
		}
	}

	/**
	 * Método que inicia la ejecución del hilo.
	 */
	public synchronized void iniciar() {
		parar = false;
		hilo = new Thread(this);
		hilo.start();
	}

	/**
	 * Método que para la ejecución del hilo.
	 */
	public synchronized void parar() {
		parar = true;
		botonGenerar.setEnabled(true);
		botonLimpiar.setEnabled(true);
		botonBuscarFich.setEnabled(true);
		jtfDestino.setEnabled(true);
		jtfExcluidos.setEnabled(true);
	}
}
