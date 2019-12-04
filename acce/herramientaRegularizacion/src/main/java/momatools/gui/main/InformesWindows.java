package momatools.gui.main;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Properties;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.apache.log4j.Logger;

import gnf.sender.init.PropertiesToLoad;
import momatools.gui.tabs.TabConsultasTablas;
import momatools.gui.tabs.TabCuadreMomaZeus;
import momatools.gui.tabs.TabExtraccionTickets;
import momatools.gui.tabs.TabFirmaValidada;
import momatools.gui.tabs.TabGeneracionIDX;
import momatools.gui.tabs.TabInformes;
import momatools.gui.tabs.TabRegularizacionEstado;
import momatools.gui.tabs.TabRestauraInfo;
import momatools.gui.tabs.TabSeguimientoF1s;
import momatools.gui.tabs.TabSimulacionOrdenes;

public class InformesWindows extends JFrame {
	private static final Logger LOGGER = Logger.getLogger(InformesWindows.class);
	private static final long serialVersionUID = 1L;
	private static final ArrayList<String> resultTabs = new ArrayList<String>();
	private JTabbedPane tabFunciones;
	private JTextArea resultados;
	private TabSimulacionOrdenes tabSimulacionOrdenes;
	private TabGeneracionIDX tabGeneracionIDX;
	private TabFirmaValidada tabFirmaValidada;
	private TabRegularizacionEstado regularizacionEstado;
	private TabRestauraInfo restauraInfo;
	private TabCuadreMomaZeus tabCuadreMomaZeus;
	private TabConsultasTablas tabConsultas;
	private TabSeguimientoF1s tabSeguimientoF1s;
	private TabInformes informes;
	private File lastConfig;// archivo con la ultima configuracion
	// propiedades generales y por defecto
	private Properties propsConfig = new Properties();
	// propiedades del ultimo lanzamiento y que se guardaran cada vez
	private Properties propsLastConfig = new Properties();
	private int prevTabindex = -2;
	private static String clave = "";

	/**
	 * Crea la ventana, inicializa todo y la visualiza
	 */
	public InformesWindows() {
		super("");
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		initComponents();
	}

	// Valores por defecto de los campos
	private void prePopulateFields() {
		// usa el archivo escrito en una ejecucion previa para establecer los
		// valores iniciales
		try {
			
			if (propsLastConfig.getProperty(FieldConstants.TAB_INDEX) != null) {
				int tabIndex = Integer.parseInt(propsLastConfig.getProperty(FieldConstants.TAB_INDEX));
				tabFunciones.setSelectedIndex(tabIndex);
			}

			resultados.setText("En esta zona se vera el resultado de la tarea que se ejecute");

			this.addWindowListener(new WindowAdapter() {

				@Override
				public void windowClosing(WindowEvent e) {
					formWindowClosing(e);
				}
			});
		} catch (Exception arg3) {
			LOGGER.error("prePopulateFields " + arg3.getMessage());
		}

	}

	private void loadLastConfigFromDefault() {
		propsLastConfig = new Properties();
		propsLastConfig.setProperty("last.tabindex", propsConfig.getProperty("last.tabindex"));
		propsLastConfig.setProperty("kocreacion.lastdate", propsConfig.getProperty("kocreacion.lastdate"));
		propsLastConfig.setProperty("cuadre.kocreacion.excluidos", propsConfig.getProperty("cuadre.kocreacion.excluidos"));
		propsLastConfig.setProperty("restaura.rutaexcel", propsConfig.getProperty("restaura.rutaexcel"));
		propsLastConfig.setProperty("regulariza.rutaexcel", propsConfig.getProperty("regulariza.rutaexcel"));
	}

	private void initComponents() {
		loadConfigs();
		resultados = new JTextArea(5, 5);
		resultados.setLineWrap(false);
		resultados.setWrapStyleWord(true);
		JScrollPane areaScrollPane = new JScrollPane(resultados);
		areaScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		areaScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		areaScrollPane.setPreferredSize(new Dimension(700, 250));
		areaScrollPane.setBorder(BorderFactory
				.createCompoundBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Resultados"),
						BorderFactory.createEmptyBorder(5, 5, 5, 5)), areaScrollPane.getBorder()));
		// Parte con los tabs de cada una de las funcionalidades
		tabFunciones = new JTabbedPane();
		informes = new TabInformes(resultados);
		tabGeneracionIDX = new TabGeneracionIDX(resultados);
		tabFirmaValidada = new TabFirmaValidada(resultados);
		regularizacionEstado = new TabRegularizacionEstado(resultados, propsLastConfig);
		restauraInfo = new TabRestauraInfo(resultados,propsLastConfig);
		tabCuadreMomaZeus = new TabCuadreMomaZeus(resultados, propsConfig, propsLastConfig);
		tabSimulacionOrdenes = new TabSimulacionOrdenes(resultados);
		tabConsultas = new TabConsultasTablas(resultados, propsConfig,propsLastConfig);
		//*
		tabSeguimientoF1s = new TabSeguimientoF1s(resultados);
		//*
		tabFunciones.addTab("Informes windows", null, informes, "Informes MOMA");
		tabFunciones.addTab("Regularización estado", null, regularizacionEstado, "Regularización de estados en MOMAPI");
		// tabFunciones.addTab("Generar xml notificacion zeus", null,
		// notificacionesZeus, "Generar xml notificacion zeus");
		tabFunciones.addTab("Generar IDX de fotos y firma", null, tabGeneracionIDX, "Generar IDX para foto y firma");
		tabFunciones.addTab("Generar Firma validada", null, tabFirmaValidada, "Generar Firma validada");
		tabFunciones.addTab("Simulación órdenes", null, tabSimulacionOrdenes,
				"Creacion modificacion y anulacion de ordenes");
		tabFunciones.addTab("Restaura Información", null, restauraInfo, "Restaura Información");
		tabFunciones.addTab("Cuadre Moma Zeus", null, tabCuadreMomaZeus, "Cuadre");
		tabFunciones.addTab("Consulta Tablas", null, tabConsultas, "Consultas");
		//*
		tabFunciones.addTab("Extraccion tickets", null, tabSeguimientoF1s, "Seguimiento F1");
		//*
		
		for (int i = 0; i < tabFunciones.getTabCount(); i++) {
			resultTabs.add("En esta zona se vera el resultado de la tarea que se ejecute");
		}
		tabFunciones.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {

				if (prevTabindex != -2) {
					resultTabs.set(prevTabindex, resultados.getText());
				}
				int tabIndex = tabFunciones.getSelectedIndex();
				if (tabIndex != -1) {
					setTitle(tabFunciones.getTitleAt(tabIndex));
					resultados.setText(resultTabs.get(tabIndex));

				} else {
					setTitle("");
				}
				// tabindex es un indice que empieza en 0
				prevTabindex = tabIndex;
			}
		});

		// Ponemos arriba la parte especifica con los diferentes tabs, y abajo
		// la parte general que muestra los resultados
		Container contentPane = getContentPane();

		contentPane.add(tabFunciones, BorderLayout.CENTER);
		contentPane.add(areaScrollPane, BorderLayout.PAGE_END);

	}

	/**
	 * carga los archivos de configuracion 
	 */
	private void loadConfigs() {
		InputStream input = null;
		try {
			input = this.getClass().getClassLoader().getResourceAsStream(PropertiesToLoad.DEFAULT.toString());
			propsConfig.load(new InputStreamReader(input,"UTF-8"));
			System.out.println("cargando");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (input != null)
				try {
					input.close();
				} catch (IOException e) {
					LOGGER.error("error cierre " ,e);
				}
		}
		try {
			lastConfig = new File(System.getProperty("user.dir"), PropertiesToLoad.LAST_CONFIG.toString());
			// creamos properties desde default y guardamos
			if (!lastConfig.exists()) {
				loadLastConfigFromDefault();
				saveFields();
			} else {// cargamos de file
				try {
					input = new FileInputStream(lastConfig);
					propsLastConfig.load(new InputStreamReader(input, Charset.forName("UTF-8")));
				} catch (Exception e) {
					LOGGER.error("carga " + e.getMessage());
				} finally {
					if (input != null)
						input.close();
				}
			}
			
		} catch (Exception e) {
			LOGGER.error("Error obteniendo fichero lastConfig", e);
		}
		
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				InformesWindows frame = new InformesWindows();

				// Se pone la ventana al tamano justo
				frame.pack();

				// Centramos la ventana en la pantalla
				frame.setLocationRelativeTo(null);

				// Se cierra el programa cuando se cierra la ventana
				frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

				// No se puede cambiar el tamano de la ventana
				frame.setResizable(true);

				frame.prePopulateFields();

				// Se hace visible la ventana
				frame.setVisible(true);
			}
		}

		);

	}

	private void formWindowClosing(WindowEvent evt) {
		int choice = JOptionPane.showOptionDialog((Component) null, "You really want to quit?", "Quit?",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, (Icon) null, (Object[]) null, (Object) null);

		if (choice == JOptionPane.YES_OPTION) {
			this.saveFields();

			System.exit(1);
		}
	}

	/**
	 * Guarda los datos actuales en un properties especifico del usuario
	 */
	private void saveFields() {
		try {
			FileOutputStream outPropFile = new FileOutputStream(lastConfig);
			propsLastConfig.setProperty(FieldConstants.TAB_INDEX, Integer.toString(tabFunciones.getSelectedIndex()));
			propsLastConfig.store(outPropFile, "");
			outPropFile.close();
		} catch (Exception arg3) {

			LOGGER.error("saveFields " + arg3.getMessage());
		}
	}
}