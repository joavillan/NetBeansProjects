package momatools.gui.tabs;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.swing.ComboBoxModel;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListDataListener;

import org.apache.log4j.Logger;

import gnf.sender.init.Entornos;
import gnf.sender.init.PlantillasCreacion;
import gnf.sender.init.SenderHelper;
import momatools.gui.main.FileUtils;
import momatools.gui.main.GuiUtils;

/**
 * Clase de la GUI que genera las notificaciones de zeus
 * 
 * @author l.lorenzoriesco
 *
 */
public class TabSimulacionOrdenes extends TabParents {

	/**
	 * 
	 */

	private static final Logger LOGGER = Logger.getLogger(TabSimulacionOrdenes.class);
	private static final long serialVersionUID = 1L;
	protected static final String RUTA_DEFECTO = "C:\\GNF\\";
	public static final String CREACION = "Creación";
	public static final String ACTUALIZACION = "Modificación";
	public static final String ANULACION = "Anulación";
	public static final String ACK = "ACK";
	public static final String NACK = "NACK";
	private static final String[] ORDER_STRINGS = { CREACION, ACTUALIZACION, ANULACION, ACK, NACK };
	private static final String[] SECTOR_STRINGS = { "GAS", "OOEE" };
	private static final Entornos[] ENVIRONMENTSGAS = { Entornos.DESARROLLO,  Entornos.TEST, Entornos.INTEGRACION, Entornos.PRODUCCION };
	private static final Entornos[] ENVIRONMENTSOOEE = { Entornos.DESARROLLOOOEE,  Entornos.TESTOOEE, Entornos.INTEGRACIONOOEE, Entornos.PRODUCCIONOOEE };
	private static final PlantillasCreacion[] PLANTILLAS_CREACION_GAS = { PlantillasCreacion.IRC,PlantillasCreacion.IRIAT,PlantillasCreacion.IRIT,PlantillasCreacion.IRIS,PlantillasCreacion.IRIAS};
	private static final PlantillasCreacion[] PLANTILLAS_CREACION_OOEE = { PlantillasCreacion.ALTA_DE_SUMINISTRO,PlantillasCreacion.BAJA_DE_SUMINISTRO,
			PlantillasCreacion.CONEXION_DE_EVENTUAL,PlantillasCreacion.CONEXION_DE_SUMINISTRO,PlantillasCreacion.CONEXION_POR_CONTRATACION,
			PlantillasCreacion.CORTE_CON_FIN_OPERACIÓN,PlantillasCreacion.CORTE_DE_EVENTUAL,PlantillasCreacion.CORTE_DE_SUMINISTRO,PlantillasCreacion.IRREGULARIDAD,
			PlantillasCreacion.PERMUTA,PlantillasCreacion.RETIRADA_DE_ACOMETIDA,PlantillasCreacion.RETIRADA_DE_SUMINISTRO,PlantillasCreacion.REVISION_DE_ACOMETIDA,
			PlantillasCreacion.REVISION_DE_EQUIPOS,PlantillasCreacion.REVISION_DE_SUMINISTRO,PlantillasCreacion.SEGUIMIENTO_Y_REFORMA,PlantillasCreacion.SUSTITUCION_DE_EQUIPOS,
			PlantillasCreacion.TOMA_DE_LECTURA,PlantillasCreacion.VERIFICACION};
	private static final String PLANTILLAS = "templates";
	private static final String CANCEL = "cancel";
	private static final String MODIFY = "modification";
	private static final String NOTIFZEUS = "ackNack";
	
	protected static final String RUTA_ANULACION = PLANTILLAS + "/" + CANCEL + "/ejemploAnulacion.xml";
	protected static final String RUTA_MODIFICACION = PLANTILLAS + "/" + MODIFY + "/ejemploModificacion.xml";
	protected static final String RUTA_ACK = PLANTILLAS + "/" + NOTIFZEUS + "/ACKSIMUL.xml";
	protected static final String RUTA_NACK = PLANTILLAS + "/" + NOTIFZEUS + "/NACKSIMUL.xml";

	private String lastDirectory;

	private final JCheckBox checkProd = new JCheckBox("Si, producción");
	private final JComboBox<String> ordersCombo = new JComboBox<String>(ORDER_STRINGS);
	private JComboBox<PlantillasCreacion> ordersTipoGAS = new JComboBox<PlantillasCreacion>(PLANTILLAS_CREACION_GAS);
	private JComboBox<PlantillasCreacion> ordersTipoOOEE = new JComboBox<PlantillasCreacion>(PLANTILLAS_CREACION_OOEE);
	private final JComboBox<Entornos> envComboGAS = new JComboBox<Entornos>(ENVIRONMENTSGAS);
	private final JComboBox<Entornos> envComboOOEE = new JComboBox<Entornos>(ENVIRONMENTSOOEE);
	private final JComboBox<String> envSector = new JComboBox<String>(SECTOR_STRINGS);
	// Text para informar la ruta donde estan los ficheros de plantilla
	private final JTextField rutaFicheros = new JTextField("");
	private final JButton botonEnviar = new JButton("Generar");
	// Text para informar el numero de orden
	// puede ser un numero con cuantas ordenes quiero operar, dos numeros
	// separados con guion (desde, hasta) y numeros separados con coma
	private final JTextField numeroOrden = new JTextField("");

	public TabSimulacionOrdenes(JTextArea resultados) {
		super(new GridBagLayout(), resultados);
		initComponents();
		prePopulateFields();
	}

	private String downloadFile(File file) {
		FileOutputStream fos = null;
		FileInputStream fis = null;
		try {
			JFileChooser ex = new JFileChooser("");
			ex.setFileSelectionMode(0);
			ex.setSelectedFile(file);

			if (this.lastDirectory != null && (new File(this.lastDirectory)).isDirectory()) {
				ex.setCurrentDirectory(new File(this.lastDirectory));
			} else {
				ex.setCurrentDirectory(new File(System.getProperty("user.home")));
			}
			int returnVal = ex.showSaveDialog((Component) null);
			if (returnVal != 0) {
				return null;
			}
			File selectedFile = ex.getSelectedFile();

			int pos;
			if (selectedFile.exists()) {
				pos = JOptionPane.showOptionDialog((Component) null, "El archivo existe." + "¿Quieres sobreescribir?",
						"Overwrite file?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, (Icon) null,
						(Object[]) null, (Object) null);

				if (pos == JOptionPane.NO_OPTION) {
					return null;
				}
				selectedFile.delete();
			}
			byte[] b = new byte[1024];
			fis = new FileInputStream(file);
			fos = new FileOutputStream(ex.getSelectedFile());
			while ((pos = fis.read(b)) != -1) {
				fos.write(b, 0, pos);
			}
			fos.flush();
			fos.close();
			fos = null;

			this.lastDirectory = ex.getSelectedFile().getParent();
			return selectedFile.getAbsolutePath();

		} catch (Exception arg17) {
			LOGGER.error("Error download file " + arg17);
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
				if (fis != null) {
					fis.close();
				}
			} catch (IOException arg16) {
				LOGGER.error("Error download file " + arg16);
			}

		}
		return null;
	}

	/**
	 * Creo cada uno de los campos
	 */
	
	@Override
	protected void initComponents() {
		super.initComponents();
		final JLabel etiquetaSector = new JLabel("Sector:");
		final JLabel etiquetaLlamada = new JLabel("Llamada de:");
		final JLabel etiquetaEntorno = new JLabel("En el entorno de:");
		final JLabel etiquetaTipo = new JLabel("De tipo:");

		final JLabel etiquetaOrden = new JLabel(
				"Números de orden(varios separados por comas, o con guiones para indicar rango):");
		final JLabel etiquetaRuta = new JLabel("Ruta de plantilla");

		// Boton para explorar en busca del fichero xml
		JButton btnExplorar = new JButton("Buscar...");
		btnExplorar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FileUtils.selectFile(rutaFicheros, RUTA_DEFECTO, "xml");
			}
		});
		JButton btnDescargar = new JButton("Descargar Copia");
		btnDescargar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				descargaCopia();

			}
		});

		// Boton generar

		botonEnviar.setBounds(10, 10, 10, 10);
		
		add(etiquetaSector, GuiUtils.posicionarElemento(10, 1, 0, 0, 1, 1, GridBagConstraints.NONE, GridBagConstraints.WEST));
		add(envSector, GuiUtils.posicionarElemento(20, 1, 1, 0, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.WEST));
		add(etiquetaLlamada, GuiUtils.posicionarElemento(10, 1, 0, 1, 1, 1, GridBagConstraints.NONE, GridBagConstraints.WEST));
		add(ordersCombo, GuiUtils.posicionarElemento(20, 1, 1, 1, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.WEST));
		add(etiquetaTipo, GuiUtils.posicionarElemento(10, 1, 2, 1, 1, 1, GridBagConstraints.NONE, GridBagConstraints.WEST));
		add(ordersTipoGAS, GuiUtils.posicionarElemento(20, 1, 3, 1, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.WEST));
		add(ordersTipoOOEE, GuiUtils.posicionarElemento(20, 1, 3, 1, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.WEST));
		add(etiquetaEntorno, GuiUtils.posicionarElemento(10, 1, 0, 2, 1, 1, GridBagConstraints.NONE, GridBagConstraints.WEST));
		add(envComboGAS, GuiUtils.posicionarElemento(20, 1, 1, 2, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.WEST));
		add(envComboOOEE, GuiUtils.posicionarElemento(20, 1, 1, 2, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.WEST));
		add(checkProd, GuiUtils.posicionarElemento(30, 1, 2, 1, 2, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.WEST));
		
		ordersTipoGAS.addComponentListener(new ComponentAdapter() {
			
			@Override
			public void componentShown(ComponentEvent e) {
				etiquetaTipo.setVisible(true);
			}
		
			@Override
			public void componentHidden(ComponentEvent e) {
				if(!ordersCombo.getSelectedItem().equals(CREACION)){
					etiquetaTipo.setVisible(false);
				}
				
			}
		});
		
		ordersTipoOOEE.addComponentListener(new ComponentAdapter() {
			
			@Override
			public void componentShown(ComponentEvent e) {
				etiquetaTipo.setVisible(true);
			}
		
			@Override
			public void componentHidden(ComponentEvent e) {
				if(!ordersCombo.getSelectedItem().equals(CREACION)){
					etiquetaTipo.setVisible(false);
				}
			}
		});
		

		add(etiquetaRuta, GuiUtils.posicionarElemento(10, 1, 0, 3, 1, 1, GridBagConstraints.NONE, GridBagConstraints.WEST));
		add(rutaFicheros,
				GuiUtils.posicionarElemento(10, 1, 1, 3, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.WEST));
		add(btnExplorar, GuiUtils.posicionarElemento(10, 1, 2, 3, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.EAST));
		add(btnDescargar,
				GuiUtils.posicionarElemento(10, 1, 3, 3, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.EAST));

		add(etiquetaOrden,
				GuiUtils.posicionarElemento(10, 1, 0, 4, 2, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.WEST));
		add(numeroOrden,
				GuiUtils.posicionarElemento(10, 1, 2, 4, 5, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.EAST));

		add(botonEnviar, GuiUtils.posicionarElemento(10, 1, 0, 5, 5, 1, GridBagConstraints.NONE, GridBagConstraints.CENTER));

	}

	private void descargaCopia() {

		/**
		 * Descargo a una carpeta temporal una copia de uno de los archivos de
		 * plantilla
		 * 
		 * @param filename
		 *            el archivo que se copiara
		 */

		FileOutputStream fos = null;
		String fileString = rutaFicheros.getText();
		FileInputStream fileorigen = null;

		try {
			if (!fileString.isEmpty()) {
				File toRead = new File(fileString);
				if (toRead.canRead()) {
					fileorigen = new FileInputStream(fileString);
					File fileDest = new File(System.getProperty("java.io.tmpdir"), toRead.getName());
					if (fileDest.exists()) {
						fileDest.delete();
					}
					fos = new FileOutputStream(fileDest);

					byte[] b = new byte[1024];
					int pos;
					while ((pos = fileorigen.read(b)) != -1) {
						fos.write(b, 0, pos);
					}
					fos.flush();
					fos.close();
					fos = null;

					String nuevaRuta = downloadFile(fileDest);
					if (nuevaRuta != null) {
						rutaFicheros.setText(nuevaRuta);
					}
				} else {
					LOGGER.error("Archivo incorrecto");
				}

			} else {
				LOGGER.error("No hay archivo a descargar: ");

			}

		} catch (Exception arg14) {
			LOGGER.error("Error descargando archivo: " + arg14);
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
				if (fileorigen != null) {
					fileorigen.close();
				}

			} catch (IOException arg13) {
				LOGGER.error("Error descargando archivo: " + arg13);
			}
		}

	}

	// private boolean plantillaConfigDefecto() {// indica si estamos en la
	// // configuracion por defecto
	// return rutaFicheros.getText().isEmpty() ||
	// rutaFicheros.getText().contains(PLANTILLAS);
	// }

	private List<String> obtieneListaOrdenes() throws NumberFormatException {
		List<String> ordenes = new ArrayList<String>();
		String toParse = numeroOrden.getText().trim();
		if (toParse.isEmpty()) {
			return ordenes;
		}
		String[] array = toParse.split(",");
		for (String item : array) {
			if (item.contains("-")) {
				// En este caso son dos numeros separados por guion
				long inicio = Long.parseLong(item.substring(0, item.indexOf("-")).trim());
				long fin = Long.parseLong(item.substring(item.indexOf("-") + 1).trim());
				for (long cont = inicio; cont < fin; cont++) {
					ordenes.add(Long.toString(cont));
				}
				ordenes.add(Long.toString(fin));
			} else {
				ordenes.add(item);
			}
		}
		return ordenes;

	}

	/**
	 * Cargo aquellos componentes que deban tener un valor por defecto
	 */
	
	@Override
	protected void prePopulateFields() {
		// Acciones del boton de envio
		botonEnviar.addActionListener(new ActionListener() {

			
			@Override
			public void actionPerformed(ActionEvent e) {
				Entornos entornoSel = null;
				if(envSector.getSelectedItem().equals("GAS")){
					entornoSel = (Entornos) envComboGAS.getSelectedItem();
				}else{
					entornoSel = (Entornos) envComboOOEE.getSelectedItem();
				}
				
				String tipoLlamada = (String) ordersCombo.getSelectedItem();
				PlantillasCreacion tipo = null;
				if(envSector.getSelectedItem().equals("GAS"))
					tipo = (PlantillasCreacion) ordersTipoGAS.getSelectedItem();
				else
					tipo = (PlantillasCreacion) ordersTipoOOEE.getSelectedItem();
				
				Random rand = new Random();
//				Map<String, String> cambios = null;
				Map<String, String> cambios = new HashMap<String, String>();
				if(tipoLlamada.equals(CREACION) && tipo!=null && tipo.isTransformacion()){
					cambios.put("APARATOS_TRANSF", "1");
				}
				if (entornoSel == Entornos.PRODUCCION && !checkProd.isSelected()) {
					JOptionPane.showMessageDialog(null, "Marque el check para produccion");
					return;
				}
				List<String> listaOrdenes;
				try {
					listaOrdenes = obtieneListaOrdenes();
				} catch (NumberFormatException exc) {
					JOptionPane.showMessageDialog(null, "Revisa el campo de ordenes");
					return;
				}

				
				SenderHelper helper = new SenderHelper(entornoSel);
				if (listaOrdenes.isEmpty()) {
					boolean correcto = helper.send(rutaFicheros.getText(), cambios,tipoLlamada);
					resultados.append("\n Enviado XML al entorno " + entornoSel + " : resultado " + correcto);
				} else {					
					System.out.println("Dentro wey");
					for (String numOrden : listaOrdenes) {
						cambios.put("NUM_ORDER", numOrden);
						System.out.println(numOrden);
						if(tipoLlamada.equals(CREACION)||tipoLlamada.equals(ACTUALIZACION)){
							cambios.put("PDS_NUM", String.valueOf(rand.nextInt(10000)));
							cambios.put("PDS_PORTAL", String.valueOf(rand.nextInt(10000)));
						}
						System.out.println(rutaFicheros.getText());
						
						boolean correcto = helper.send(rutaFicheros.getText(), cambios,tipoLlamada);
						resultados.append(
								"\n Enviado XML al entorno " + entornoSel + " referente a la orden " + numOrden + " con resultado " + correcto);
					}
				}

				helper.close();

			}

		});

		ordersCombo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String order = (String) ordersCombo.getSelectedItem();
				URL direccion = null;
				if (order.equals(CREACION)) {
					// mostramos el combo de tipo
					if(envSector.getSelectedItem().equals("GAS")){
						ordersTipoGAS.setVisible(true);
					}else{
						ordersTipoOOEE.setVisible(true);
					}
						
					refreshBytypes();
				} else if (order.equals(ANULACION)) {
					ordersTipoGAS.setVisible(false);
					ordersTipoOOEE.setVisible(false);
					direccion = this.getClass().getClassLoader().getResource(RUTA_ANULACION);
				} else if (order.equals(ACTUALIZACION)) {
					ordersTipoGAS.setVisible(false);
					ordersTipoOOEE.setVisible(false);
					direccion = this.getClass().getClassLoader().getResource(RUTA_MODIFICACION);
				} else if (order.equals(ACK)) {
					ordersTipoGAS.setVisible(false);
					ordersTipoOOEE.setVisible(false);
					direccion = this.getClass().getClassLoader().getResource(RUTA_ACK);
				} else if (order.equals(NACK)) {
					ordersTipoGAS.setVisible(false);
					ordersTipoOOEE.setVisible(false);
					direccion = this.getClass().getClassLoader().getResource(RUTA_NACK);
				}

				if (direccion != null && direccion.getPath() != null) {
					// if (plantillaConfigDefecto()) {
					rutaFicheros.setText(direccion.getPath());
					// }
				}

			}

		});

		ordersCombo.setSelectedIndex(0);

		ordersTipoGAS.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				refreshBytypes();
			}
		});
		ordersTipoGAS.setSelectedIndex(0);
		
		ordersTipoOOEE.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				refreshBytypes();
			}
		});
		ordersTipoOOEE.setSelectedIndex(0);
		
		envSector.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(envSector.getSelectedItem().equals("GAS")){
					if(ordersCombo.getSelectedItem().equals(CREACION)){
						ordersTipoGAS.setVisible(true);
						refreshBytypes();
					}						
					ordersTipoOOEE.setVisible(false);
					envComboGAS.setVisible(true);
					envComboOOEE.setVisible(false);
				}else{									
					if(ordersCombo.getSelectedItem().equals(CREACION)){
						ordersTipoOOEE.setVisible(true);
						refreshBytypes();
					}
					ordersTipoGAS.setVisible(false);
					envComboGAS.setVisible(false);
					envComboOOEE.setVisible(true);
				}
				
			}
		});

		envComboGAS.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Entornos env = (Entornos) envComboGAS.getSelectedItem();
				if (env.equals(Entornos.PRODUCCION)) {
					checkProd.setVisible(true);
				} else {
					checkProd.setVisible(false);
					checkProd.setSelected(false);
				}
			}
		});
		envComboGAS.setSelectedIndex(0);
		
		envComboOOEE.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Entornos env = (Entornos) envComboOOEE.getSelectedItem();
				if (env.equals(Entornos.PRODUCCIONOOEE)) {
					checkProd.setVisible(true);
				} else {
					checkProd.setVisible(false);
					checkProd.setSelected(false);
				}
			}
		});
		envComboOOEE.setSelectedIndex(0);

	}

	private void refreshBytypes() {
		PlantillasCreacion tipo = null;
		if(envSector.getSelectedItem().equals("GAS")){
			tipo = (PlantillasCreacion) ordersTipoGAS.getSelectedItem();
		}else{
			tipo = (PlantillasCreacion) ordersTipoOOEE.getSelectedItem();
		}
		
		URL direccion = this.getClass().getClassLoader().getResource(tipo.getRutaPlantilla());
		if (direccion != null && direccion.getPath() != null) {
			// if (plantillaConfigDefecto()) {
			rutaFicheros.setText(direccion.getPath());
			// }
		}
	}

}
