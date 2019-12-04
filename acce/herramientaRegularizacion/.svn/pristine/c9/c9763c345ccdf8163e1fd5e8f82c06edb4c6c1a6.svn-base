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
import java.net.URL;
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
import javax.xml.datatype.DatatypeFactory;
import javax.xml.namespace.QName;
import javax.xml.ws.Holder;

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
import momatools.webServices.activitypcc.ActivityPCCService;
import momatools.webServices.activitypcc.ServicePortType;
import momatools.webServices.common.IdentificationRequest;
import momatools.webServices.common.IdentificationResponse;
import momatools.webServices.message_types.UpdateOrderRequest;
import momatools.webServices.message_types.UpdateOrderResponse;
import momatools.webServices.message_types.UpdateOrderRequest.MOMACONActivity;
import momatools.webServices.message_types.UpdateOrderRequest.Order;
import momatools.webServices.trackorder.ServicePortTypeTrack;
import momatools.webServices.trackorder.TrackOrderService;
import regularizacion.persistence.entity.BackendErrorOrder;
import regularizacion.persistence.entity.KOCreacion;
import regularizacion.persistence.entity.PdteBackend;

/**
 * Tab para automatizar el proceso del cuadre moma zeus
 * 
 * @author f.guillen.caro
 */
public class TabConsultasTablas extends TabParents {
	/**
	 * Serial default.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Constante con los entornos disponibles.
	 */
	private static final String[] TABLAS = { "MOMACON_ACTIVITY", "TRACK_ORDER", "TRACK_ACTIVITY" };
	/**
	 * Campo de texto donde se almacenara la ruta de destino del excel.
	 */
	private static final JTextField jtfOrden = new JTextField("");
	/**
	 * Campo de texto donde se almacenaran las ordenes a excluir.
	 */
	private static final JTextField jtfActividad = new JTextField("");
	/**
	 * Boton cuya accion generara los ficheros surgidos del cuadre.
	 */
	private static final JButton botonConsultar = new JButton("Consultar");
	private static final JButton marcarKOCreacion = new JButton("Error en creación");
	/**
	 * Boton cuya accion borrara el contenido del area de texto.
	 */
	private static final JButton botonLimpiar = new JButton("Limpiar");
	/**
	 * Desplegable para seleccionar el entorno sobre el que se lanzaran las
	 * queries.
	 */
	private static final JComboBox<String> envCombo = new JComboBox<String>(TABLAS);
	/**
	 * Propiedades, la primera de solo lectura y sobre la segunda se escribirá.
	 */
	private Properties propsConfig;
	private Properties propsLastConfig;
	/**
	 * Etiquetas.
	 */
	private static final JLabel jlOrden = new JLabel("Nº Orden:");
	private static final JLabel jlActividad = new JLabel("Nº Actividad:");
	private static final JLabel jlEnv = new JLabel("Elige la tabla:");

	/**
	 * Constructor de la clase
	 * 
	 * @param layout
	 * @param resultados
	 */
	public TabConsultasTablas(JTextArea resultados, Properties propsConfig, Properties propsLastConfig) {
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
		resultados.setEditable(false);
		envCombo.setToolTipText("Tabla contra la que se hace la consulta");
		jtfOrden.setToolTipText("Número de orden por el que consultar");
		jtfActividad.setToolTipText("Número de actividad por la que consultar");
		botonConsultar.setToolTipText("Pulsa para llevar a cabo la consulta");
		marcarKOCreacion.setToolTipText("Pulsa para marcar la orden en estado Error en creacion en TRACK_ORDER");
		marcarKOCreacion.setEnabled(false);
		botonLimpiar.setToolTipText("Pulsa para limpiar texto y ruta");
		oyentes();
		posicionamiento();
		jtfActividad.setEnabled(false);

	}

	/**
	 * Metodo donde se añade accion a los componentes de nuestro tab.
	 */
	public void oyentes() {

		botonConsultar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				resultados.setText("");
				if (jtfOrden.getText().equals("") && jtfActividad.getText().equals("")) {
					JOptionPane.showMessageDialog(null,
							"Se debe informar un número de orden o actividad para proceder a la búsqueda.", "Error",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					if (envCombo.getSelectedItem().equals("TRACK_ORDER")) {
						if (jtfOrden.getText().equals("")) {
							JOptionPane.showMessageDialog(null,
									"Se debe informar un número de orden para poder filtrar en MOMA_TRACK_ORDER.",
									"Error", JOptionPane.INFORMATION_MESSAGE);
						} else {
							try {
								Database.ejecutaQueryConsulta(resultados, (String) envCombo.getSelectedItem(),
										jtfOrden.getText(), jtfActividad.getText(), propsConfig, propsLastConfig);
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}

					} else if (envCombo.getSelectedItem().equals("TRACK_ACTIVITY")) {
						try {
							Database.ejecutaQueryConsulta(resultados, (String) envCombo.getSelectedItem(),
									jtfOrden.getText(), jtfActividad.getText(), propsConfig, propsLastConfig);
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					} else {
						try {
							Database.ejecutaQueryConsulta(resultados, (String) envCombo.getSelectedItem(),
									jtfOrden.getText(), jtfActividad.getText(), propsConfig, propsLastConfig);
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}

				}

			}
		});

		botonLimpiar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int confirm = JOptionPane.showConfirmDialog(null,
						"Se borrarán todos los datos rellenados, ¿desea continuar?", "ATENCIÓN",
						JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if (confirm == 0) {
					resultados.setText("En esta zona se vera el resultado de la tarea que se ejecute");
					jtfOrden.setText("");
					jtfActividad.setText("");
				}

			}
		});
		
		marcarKOCreacion.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {	
				if(!jtfOrden.equals("")){
					int confirm = JOptionPane.showConfirmDialog(null, "Se actualizará el estado de la orden en TRACK_ORDER, ¿desea continuar?",
							"ATENCIÓN", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
					if (confirm == 0) {
						try {
							marcarKOCreacion();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
				else{
					JOptionPane.showMessageDialog(null,
							"Se debe informar un número de orden para marcar como Error en creacion.",
							"Error", JOptionPane.INFORMATION_MESSAGE);
				}

								
			}
		});
		
		envCombo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(envCombo.getSelectedItem().equals("MOMACON_ACTIVITY")){
					jtfActividad.setEnabled(false);
				}
				else{
					jtfActividad.setEnabled(true);
				}
				
				if(envCombo.getSelectedItem().equals("TRACK_ORDER")){
					marcarKOCreacion.setEnabled(true);
				}
				else{
					marcarKOCreacion.setEnabled(false);
				}
				
			}
		});
	}

	/**
	 * Metodo donde se posiciona los componentes de nuestro tab.
	 */
	public void posicionamiento() {
		add(jlOrden, GuiUtils.posicionarElemento(10, 1, 0, 2, 1, 1, GridBagConstraints.NONE, GridBagConstraints.WEST));
		add(jtfOrden, GuiUtils.posicionarElemento(300, 1, 1, 2, 1, 1, GridBagConstraints.HORIZONTAL,
				GridBagConstraints.WEST));
		add(jlActividad, GuiUtils.posicionarElemento(100, 1, 0, 3, 1, 1, GridBagConstraints.HORIZONTAL,
				GridBagConstraints.EAST));
		add(jtfActividad, GuiUtils.posicionarElemento(100, 1, 1, 3, 1, 1, GridBagConstraints.HORIZONTAL,
				GridBagConstraints.WEST));
		add(jlEnv,
				GuiUtils.posicionarElemento(10, 1, 0, 4, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.EAST));
		add(envCombo,
				GuiUtils.posicionarElemento(10, 0, 1, 4, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.EAST));
		add(botonConsultar,
				GuiUtils.posicionarElemento(5, 1, 1, 6, 2, 1, GridBagConstraints.NONE, GridBagConstraints.WEST));
		add(marcarKOCreacion,
				GuiUtils.posicionarElemento(5, 1, 2, 6, 2, 1, GridBagConstraints.NONE, GridBagConstraints.WEST));
		add(botonLimpiar,
				GuiUtils.posicionarElemento(5, 1, 3, 6, 2, 1, GridBagConstraints.NONE, GridBagConstraints.WEST));
	}
	
	/** Actualiza los estados de la actividad
	 * @param portTrack
	 * @param orden
	 * @param numAct
	 * @param estadoProceso
	 * @throws Exception 
	 */
	private void marcarKOCreacion() throws Exception{
		String wsdltrack = Entornos.PRODUCCION.getWsdltrack();
		TrackOrderService track = new TrackOrderService(wsdltrack);
		ServicePortTypeTrack portTrack = track.getServicePort();
		IdentificationRequest identificationRequest = new IdentificationRequest();
		UpdateOrderRequest updateOrderRequest = new UpdateOrderRequest();
		Holder<IdentificationResponse> identificationResponse = new Holder<IdentificationResponse>();
		Holder<UpdateOrderResponse> updateOrderResponse = new Holder<UpdateOrderResponse>();
		
		//Rellenamos los datos de entrada
		identificationRequest.setMessageId("");
		identificationRequest.setCountryCode("");
		identificationRequest.setSectorCode("");
		identificationRequest.setTimeStampRequest(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()));
		
		Order ordenReq = new Order();
		ordenReq.setNumeroOrden(jtfOrden.getText());
		ordenReq.setEstadoOrden("Error en creacion");
		updateOrderRequest.setOrder(ordenReq);
			
		
		//Actualizamos la actividad
		portTrack.updateOrder(identificationRequest, updateOrderRequest, identificationResponse, updateOrderResponse);
		
	}

}
