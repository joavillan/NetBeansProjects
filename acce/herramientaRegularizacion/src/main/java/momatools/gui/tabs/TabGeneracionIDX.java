package momatools.gui.tabs;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Map;
import java.util.Properties;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import activity.utilidades.FormatUtils;
import activity.utilidades.Util;
import gnf.moma.gendocument.utilidades.Constantes;
import gnf.moma.gendocument.utilidades.GeneracionIDX;
import momatools.gui.main.FileUtils;
import momatools.gui.main.GuiUtils;
/**
 * Clase de la GUI que genera las notificaciones de zeus
 * @author l.lorenzoriesco
 *
 */
public class TabGeneracionIDX extends TabParents{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static final String RUTA_DEFECTO = "C:\\GNF\\";
	

	public TabGeneracionIDX(JTextArea resultados) {
		super(new GridBagLayout(),resultados);
		initComponents();
		prePopulateFields();
	}

	/**
	 * Creo cada uno de los campos
	 */
	
	@Override
	protected void initComponents() {
		super.initComponents();
		
		final JLabel etiquetaOrden = new JLabel("Número de orden:");
		final JLabel etiquetaRuta = new JLabel("Ruta de work_order.xml:");
		
		// checkbox y cuadro de texto para informar csvdispositivo y ver si se copia a csv servidor
		final JCheckBox checkCSV = new JCheckBox("¿Es CSV Servidor?");
		final JLabel etiquetaCSV = new JLabel("CSV Dispositivo:");
		final JTextField textCSVDIspositivo = new JTextField("");
		
		// Radiobuttons para seleccionar si se genera el idx de la firma o de foto
		final JRadioButton option1 = new JRadioButton("IDX de foto");
		final JRadioButton option2 = new JRadioButton("IDX de firma");
		final JRadioButton option3 = new JRadioButton("IDX de Otro doc (PDF, DOC, etc)");
		option1.setSelected(true);
		
		// Checkbox para ver si nos conectamos a OFSC usando proxy
		final JCheckBox conProxy= new JCheckBox("Conectar con proxy");

		//Text para informar la ruta donde se dejan los ficheros
		final JTextField rutaFicheros = new JTextField("");
		
		// Boton para explorar en busca del fichero xml
		JButton btnExplorar = new JButton("Buscar...");
		btnExplorar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (option1.isSelected() || option2.isSelected())
					FileUtils.selectFolder(rutaFicheros, RUTA_DEFECTO);
				else 
					FileUtils.selectFile(rutaFicheros, RUTA_DEFECTO, "");
			}
		});


		// Text para informar el numero de orden
		final JTextField numeroOrden= new JTextField("");

		//Boton generar
		JButton boton = new JButton("Generar");
		boton.setBounds(10, 10, 10, 10);
		
		// Radiobuttons para seleccionar si se usan los datos del work_order o del getActivity (OFSC)
		final JRadioButton optionOFSC1 = new JRadioButton("Datos de work_order.xml");
		final JRadioButton optionOFSC2 = new JRadioButton("Datos de get_activity (OFSC)");
		optionOFSC1.setSelected(true);
		
		optionOFSC1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				etiquetaOrden.setText("Número de orden:");
				etiquetaRuta.setText("Ruta de work_order.xml:");
				// Hacer visible el cuadro de texto de CSV dispositivo y si se copia o no a CSV servidor
				checkCSV.setVisible(true);
				etiquetaCSV.setVisible(true);
				textCSVDIspositivo.setVisible(true);
				
			}
		});
		optionOFSC2.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				etiquetaOrden.setText("Número de actividad:");
				etiquetaRuta.setText("Ruta para los ficheros:");
				// Hacer no visible
				checkCSV.setVisible(false);
				etiquetaCSV.setVisible(false);
				textCSVDIspositivo.setVisible(false);
			}
		});

		ButtonGroup group = new ButtonGroup();
		group.add(option1);
		group.add(option2);
		group.add(option3);
		
		ButtonGroup groupOfsc = new ButtonGroup();
		groupOfsc.add(optionOFSC1);
		groupOfsc.add(optionOFSC2);
		

		add(option1, 			GuiUtils.posicionarElemento(20,1,0,0,1,1,	GridBagConstraints.HORIZONTAL, 	GridBagConstraints.WEST));
		add(optionOFSC1, 		GuiUtils.posicionarElemento(30,1,1,0,1,1,	GridBagConstraints.NONE, 		GridBagConstraints.WEST));
		add(etiquetaRuta, 		GuiUtils.posicionarElemento(10,1,2,0,1,1,	GridBagConstraints.NONE, 		GridBagConstraints.WEST));
		add(rutaFicheros, 		GuiUtils.posicionarElemento(10,1,3,0,1,1,	GridBagConstraints.HORIZONTAL, 	GridBagConstraints.WEST));
		add(btnExplorar, 		GuiUtils.posicionarElemento(10,1,4,0,1,1,	GridBagConstraints.HORIZONTAL, 	GridBagConstraints.EAST));
		add(option2, 			GuiUtils.posicionarElemento(20,1,0,1,1,1,	GridBagConstraints.NONE, 		GridBagConstraints.WEST));
		add(optionOFSC2, 		GuiUtils.posicionarElemento(30,1,1,1,1,1,	GridBagConstraints.HORIZONTAL, 	GridBagConstraints.WEST));
		add(etiquetaOrden, 		GuiUtils.posicionarElemento(25,1,2,1,1,1,	GridBagConstraints.HORIZONTAL, 	GridBagConstraints.WEST));
		add(numeroOrden, 		GuiUtils.posicionarElemento(10,1,3,1,1,1,	GridBagConstraints.HORIZONTAL, 	GridBagConstraints.EAST));
		add(option3, 			GuiUtils.posicionarElemento(20,1,0,2,1,1,	GridBagConstraints.HORIZONTAL, 	GridBagConstraints.WEST));
		add(conProxy, 			GuiUtils.posicionarElemento(20,1,0,3,1,1,	GridBagConstraints.HORIZONTAL, 	GridBagConstraints.WEST));
		add(checkCSV, 			GuiUtils.posicionarElemento(30,1,1,2,1,1,	GridBagConstraints.HORIZONTAL, 	GridBagConstraints.WEST));
		add(etiquetaCSV, 		GuiUtils.posicionarElemento(30,1,2,2,1,1,	GridBagConstraints.HORIZONTAL, 	GridBagConstraints.WEST));
		add(textCSVDIspositivo, GuiUtils.posicionarElemento(10,1,3,2,1,1,	GridBagConstraints.HORIZONTAL, 	GridBagConstraints.WEST));		
		add(boton, 				GuiUtils.posicionarElemento(10,1,0,4,4,1,	GridBagConstraints.NONE, 		GridBagConstraints.CENTER));

		//Acciones del boton
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String mensajeError = "";
				try{
					// Informar si se selecciono proxy
					setProxy(conProxy.isSelected());
						
					if (option1.isSelected() || option3.isSelected()){
						// se requiere generar IDX de foto
						// vamos a recuperar la informacion del fichero work_order
						// Para esto tiene que ingresar el numero de orden
						String tipoFichero = "Foto";
						if (option3.isSelected())
							tipoFichero = "Otro";
						GeneracionIDX generarIDX = new GeneracionIDX(tipoFichero, rutaFicheros.getText(), Integer.parseInt(numeroOrden.getText()));
						if (optionOFSC1.isSelected()) {
							mensajeError = generarIDX.generarFicheroIDXdesdeXML();
						} else {
							mensajeError = generarIDX.generarFicheroIDXdesdeOFSC();
						}
					}else if (option2.isSelected()){
						// se requiere generar IDX de firma
						GeneracionIDX generarIDX = new GeneracionIDX("Firma", rutaFicheros.getText(), Integer.parseInt(numeroOrden.getText()));
						if (optionOFSC1.isSelected()) {
							// vamos a recuperar la informacion del fichero work_order
							// informamos el CSV de la ventana (que esta en el PNG);
							generarIDX.setCsvDispositivo(textCSVDIspositivo.getText());
							generarIDX.setInformarCSVServidor(checkCSV.isSelected());
							// vamos a recuperar la informacion del fichero work_orden
							mensajeError = generarIDX.generarFicheroIDXdesdeXML();
						} else {
							mensajeError = generarIDX.generarFicheroIDXdesdeOFSC();
						}
					}
				}catch(Exception e1){
					mensajeError = e1.getMessage();
					e1.printStackTrace();
				}
				if ("".equals(mensajeError))
					JOptionPane.showMessageDialog(null, "Finalizado", "Fin", JOptionPane.INFORMATION_MESSAGE);
				else {
					JOptionPane.showMessageDialog(null, mensajeError, "Error", JOptionPane.ERROR_MESSAGE);
					String fechaFormatoNow = FormatUtils.parseAsString(new Date(), Constantes.FORMATO_FECHA_IDX);
					resultados.append("\n" + fechaFormatoNow + " >>>> " + mensajeError);
				}
				
			}

		});

	}

	public static void recuperarTagsEnArray(Map<String, String> mapaValores, Node nodes){
		if(nodes.hasChildNodes()  || nodes.getNodeType()!=3){
			mapaValores.put(nodes.getNodeName(), nodes.getTextContent());
			System.out.println(nodes.getNodeName()+" : "+nodes.getTextContent());
			NodeList nl=nodes.getChildNodes();
			for(int j=0;j<nl.getLength();j++)
				recuperarTagsEnArray(mapaValores, nl.item(j));
		}
	}

	/**
	 * Cargo aquellos componentes que deban tener un valor por defecto
	 */
	
	@Override
	protected void prePopulateFields() {
		super.prePopulateFields();

	}
	
	private static void setProxy(Boolean conProxy) {
		
		Properties mapUserData = Util.loadPropertiesAbsolutePath("C:\\apps\\HerramientaRegularizacion\\herramientaregularizacion.properties");
		String proxy = "";
		String port = "";
		String user = "";
		String pwd = "";
		String conProxyStr = conProxy.toString();

		if (conProxy) {
				proxy = "gnfproxy2010.intranet.gasnatural.com";
				port = "80";
				user = mapUserData.getProperty("userGasNat");
				pwd = mapUserData.getProperty("passGasNat");
		}
		
		System.setProperty("https.proxySet", conProxyStr);
		System.setProperty("https.proxyHost", proxy);
		System.setProperty("https.proxyPort", port);
		System.setProperty("https.proxyUser", user);
		System.setProperty("https.proxyPassword", pwd);
		
	}
	
}
