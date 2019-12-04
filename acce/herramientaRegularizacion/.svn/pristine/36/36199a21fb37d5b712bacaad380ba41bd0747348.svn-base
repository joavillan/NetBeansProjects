package momatools.gui.tabs;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Properties;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import gnf.sender.init.Entornos;
import momatools.excel.UtilidadesExcel;
import momatools.gui.main.CreacionFromTrace;
import momatools.gui.main.FileUtils;
import momatools.webServices.activitypcc.ActivityPCCService;
import momatools.webServices.activitypcc.ServicePortType;
import momatools.webServices.common.IdentificationRequest;
import momatools.webServices.common.IdentificationResponse;
import momatools.webServices.message_types.UpdateActivityRequest;
import momatools.webServices.message_types.UpdateActivityResponse;
import momatools.webServices.message_types.UpdateOrderRequest;
import momatools.webServices.message_types.UpdateOrderRequest.MOMACONActivity;
import momatools.webServices.message_types.UpdateOrderRequest.Order;
import momatools.webServices.message_types.UpdateOrderResponse;
import momatools.webServices.trackorder.ServicePortTypeTrack;
import momatools.webServices.trackorder.TrackOrderService;

public class TabRegularizacionEstado extends TabParents{

	private static final Logger LOGGER = Logger.getLogger(TabRegularizacionEstado.class);
	private static final long serialVersionUID = 1L;
    
    /** Opciones de entorno */
    private static final Entornos[] ENVIRONMENTS = { Entornos.DESARROLLO, Entornos.INTEGRACION, Entornos.PRODUCCION };
	private final JComboBox<Entornos> envCombo = new JComboBox<Entornos>(ENVIRONMENTS);
    private String lastDirectory;
    
    private final JTextField rutaExcel = new JTextField("");
    private String ordenesARecrear="";
	private Properties propsLastConfig;
	private String excelPath;

       
	public TabRegularizacionEstado(JTextArea resultados,Properties propsLastConfig) {
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
		//Text para informar la ruta de la excel con las ordenes
		excelPath=propsLastConfig.getProperty("regulariza.rutaexcel");
		super.initComponents();

		/************************* CONTROLES *************************/

		
		
		rutaExcel.setText(excelPath);
		
		
		
		
		//Boton para seleccionar un fichero excel
		final JButton btnBuscaExcel = new JButton("Buscar...");
		btnBuscaExcel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FileUtils.selectExcelFile(rutaExcel, excelPath);
				propsLastConfig.setProperty("regulariza.rutaexcel", rutaExcel.getText());
			}
		});
		JButton btnDescargar = new JButton("Descargar Copia");
		btnDescargar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lastDirectory=FileUtils.descargaCopia(rutaExcel,lastDirectory);
				propsLastConfig.setProperty("regulariza.rutaexcel", rutaExcel.getText());

			}
		});
		
		//Check que indica si la excel tiene cabecera
		final JCheckBox cabecera = new JCheckBox("Â¿Tiene cabecera?", true);
		cabecera.setHorizontalTextPosition(SwingConstants.LEFT);
		
		

		//Boton regularizar
		JButton boton = new JButton("Regularizar");


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
		add(new JLabel("En el entorno de:"), constraints);
		
		constraints.gridx = 2;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.WEST;
		add(envCombo, constraints);

		constraints.gridx = 4;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(0, 10, 0, 10);
		add(btnBuscaExcel, constraints);
		constraints.gridx = 5;
		add(btnDescargar, constraints);
		
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
					regularizarEstado(rutaExcel.getText(), cabecera.isSelected());
				}catch(Exception e1){
					correcto = false;
					resultados.setText(resultados.getText() + e1.getMessage());
				}
				if (correcto){
					JOptionPane.showMessageDialog(null, "Finalizado", "Fin", JOptionPane.INFORMATION_MESSAGE);
					if(!ordenesARecrear.isEmpty()){
						ordenesARecrear=ordenesARecrear.substring(1);						
						int choice = JOptionPane.showOptionDialog((Component) null, "Deseas lanzar la recreacion de las ordenes \n" + ordenesARecrear, "Quit?",
								JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, (Icon) null, (Object[]) null, (Object) null);

						if (choice == JOptionPane.YES_OPTION) {
							//recreo desde y hacia el entorno seleccionado en el combo
							String[] args = {ordenesARecrear,((Entornos)envCombo.getSelectedItem()).toString(),((Entornos)envCombo.getSelectedItem()).toString()};
							CreacionFromTrace.main(args);
						}
						//vacio el listado cada vez

						ordenesARecrear="";
					}
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
	 * @param numCampos
	 * @param tieneCabecera
	 * @param entorno
	 * @throws Exception
	 */
	private void regularizarEstado(String rutaExcel, boolean tieneCabecera) throws Exception{
		//Leemos el fichero excel
		List<String[]> excel = UtilidadesExcel.leeExcel(rutaExcel, 6, tieneCabecera);
		
		

		//Obtenemos el WSDL del entorno seleccionado
		String wsdlpcc = ((Entornos)envCombo.getSelectedItem()).getWsdlpcc();
		String wsdltrack = ((Entornos)envCombo.getSelectedItem()).getWsdltrack();
		
		ActivityPCCService pcc = new ActivityPCCService(new URL(ActivityPCCService.class.getResource("."), wsdlpcc),new QName("http://www.gasnaturalfenosa.com/MOMA/ActivityPCC", "ActivityPCCService"));
		ServicePortType portPCC = pcc.getActivityPCCServicePort();
		TrackOrderService track = new TrackOrderService(wsdltrack);
		ServicePortTypeTrack portTrack = track.getServicePort();
		//Establecemos la conexion al entorno selecionado
		BindingProvider bindingProviderPCC = (BindingProvider) portPCC;
		bindingProviderPCC.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, wsdlpcc);
		BindingProvider bindingProviderTrack = (BindingProvider) portTrack;
		bindingProviderTrack.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, wsdltrack);

		resultados.setText("Inicio regularizacion entorno " + envCombo.getSelectedItem() + "\n");
		for (int i = 0; i < excel.size(); i++){
			String[] fila = excel.get(i);
			if(StringUtils.isEmpty(fila[0])||StringUtils.isEmpty(fila[1])){
				LOGGER.warn("Saltando orden: " + fila[0] +" Actividad: " + fila[1]);
				continue;
			}
			LOGGER.info("Enviando orden: " + fila[0]);
			resultados.setText(resultados.getText() + "Orden: " + fila[0] + " - NÂº actividad: " + fila[1] 
					+ " - Estado: " + fila[2] + " - Estado proceso: " + fila[3]
							+ " - Tecnico: " + fila[4] + " - Id Tecnico: " + fila[5] + "\n");
			String res = "";
			
			if("RECREAR".equals(fila[2])){
				//CASO ESPECIAL para recrear ordenes atascadas, solo hace esto
				LOGGER.info("Preparamos orden: " + fila[0] +" Actividad: " + fila[1] + " para recrearla");
				//Llamamos al WS de TrackOrder para actualizar el estado de la orden
				res = llamadaTrackOrder(portTrack, fila[0], fila[1], fila[3],"Error en creacion");
				resultados.setText(resultados.getText() + "Llamada TrackOrder para recrear: " + res + "\n");
				ordenesARecrear+=","+fila[0];
			}else{
				if (fila[3] != null && !fila[3].trim().equals("") && !fila[3].trim().equals("N/A")){
						//Llamamos al WS de TrackOrder para actualizar el estado de la orden
						res = llamadaTrackOrder(portTrack, fila[0], fila[1], fila[3],fila[2]);
						resultados.setText(resultados.getText() + "Llamada TrackOrder: " + res + "\n");
					
				}else{
					//Llamamos al WS de TrackOrder para actualizar el estado de la orden
					res = llamadaTrackOrder(portTrack, fila[0], fila[1], fila[3],null);
					resultados.setText(resultados.getText() + "Llamada TrackOrder: " + res + "\n");
				}

				if (fila[2] != null && !fila[2].trim().equals("") && !fila[2].trim().equals("N/A")){
					//Llamamos al WS de updateActivity para limpiar los campos de error
					res = llamadaActivityPCC(portPCC, fila[0], fila[1], fila[2]);
					resultados.setText(resultados.getText() + "Llamada ActivityPCC: " + res + "\n");
				}

				if (fila[4] != null && !fila[4].trim().equals("")){
					//Llamamos al WS de updateActivity para actualizar el tecnico
					res = llamadaActivityPCCTecnico(portPCC, fila[0], fila[1], fila[4], fila[5]);
					resultados.setText(resultados.getText() + "Llamada ActivityPCC - Tecnico: " + res + "\n");
				}
				
			}
			
			
			
		}
	}
	
	/** Actualiza los campos de error de la actividad
	 * @param portPCC
	 * @param orden
	 * @param numAct
	 * @param estado
	 */
	private String llamadaActivityPCC(ServicePortType portPCC, String orden, String numAct, String estado) throws Exception{
		IdentificationRequest identificationRequest = new IdentificationRequest();
		UpdateActivityRequest updateActivityRequest = new UpdateActivityRequest();
		Holder<IdentificationResponse> identificationResponse = new Holder<IdentificationResponse>();
		Holder<UpdateActivityResponse> updateActivityResponse = new Holder<UpdateActivityResponse>();
		
		//Rellenamos los datos de entrada
		identificationRequest.setMessageId("");
		identificationRequest.setCountryCode("");
		identificationRequest.setSectorCode("");
		identificationRequest.setTimeStampRequest(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()));
		
		updateActivityRequest.setNumeroActividad(numAct);
		updateActivityRequest.setNumeroOrden(orden);
		updateActivityRequest.setEstadoActividad(estado);
		updateActivityRequest.setOperacion("notificacion");
		
		//Actualizamos la actividad
		portPCC.updateActivity(identificationRequest, updateActivityRequest, identificationResponse, updateActivityResponse);
		
		//Recuperamos el resultado
		String resultado = identificationResponse.value.getResult();
		if (resultado.equals("1")) 
			resultado += " - " + identificationResponse.value.getErrorCode() + " - " + identificationResponse.value.getErrorDescription();
		
		return resultado;
	}
	
	/** Actualiza los estados de la actividad
	 * @param portTrack
	 * @param orden
	 * @param numAct
	 * @param estadoProceso
	 * @throws Exception 
	 */
	private String llamadaTrackOrder(ServicePortTypeTrack portTrack, String orden, String numAct, String estadoProceso,String estado) throws Exception{
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
		ordenReq.setNumeroOrden(orden);
		if(estado!=null && !"N/A".equals(estado)){
			ordenReq.setEstadoOrden(estado);
		}
		updateOrderRequest.setOrder(ordenReq);
		
		MOMACONActivity momac = new MOMACONActivity();
		momac.setNumeroActividad(numAct);
		if(estadoProceso!=null && !"N/A".equals(estadoProceso)){
			momac.setEstadoProceso(estadoProceso);
		}
		updateOrderRequest.setMOMACONActivity(momac);
		
		
		//Actualizamos la actividad
		portTrack.updateOrder(identificationRequest, updateOrderRequest, identificationResponse, updateOrderResponse);
		
		//Recuperamos el resultado
		String resultado = identificationResponse.value.getResult();
		if (resultado.equals("1")) 
			resultado += " - " + identificationResponse.value.getErrorCode() + " - " + identificationResponse.value.getErrorDescription();

		return resultado;
	}
	
	/** Actualiza el tecnico
	 * @param portPCC
	 * @param orden
	 * @param numAct
	 * @param estado
	 */
	private String llamadaActivityPCCTecnico(ServicePortType portPCC, String orden, String numAct, String tecnico, String idTecnico) throws Exception{
		IdentificationRequest identificationRequest = new IdentificationRequest();
		UpdateActivityRequest updateActivityRequest = new UpdateActivityRequest();
		Holder<IdentificationResponse> identificationResponse = new Holder<IdentificationResponse>();
		Holder<UpdateActivityResponse> updateActivityResponse = new Holder<UpdateActivityResponse>();
		
		//Rellenamos los datos de entrada
		identificationRequest.setMessageId("");
		identificationRequest.setCountryCode("");
		identificationRequest.setSectorCode("");
		identificationRequest.setTimeStampRequest(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()));
		
		updateActivityRequest.setNumeroActividad(numAct);
		updateActivityRequest.setNumeroOrden(orden);
		updateActivityRequest.setOperacion("updateStatus");
		updateActivityRequest.setOrdenXML("<xml><Tecnico>" + tecnico +"</Tecnico><IdTecnico>" + idTecnico +"</IdTecnico><TipoTecnico>MW</TipoTecnico></xml>");
		
		//Actualizamos la actividad
		portPCC.updateActivity(identificationRequest, updateActivityRequest, identificationResponse, updateActivityResponse);
		
		//Recuperamos el resultado
		String resultado = identificationResponse.value.getResult();
		if (resultado.equals("1")) 
			resultado += " - " + identificationResponse.value.getErrorCode() + " - " + identificationResponse.value.getErrorDescription();
		
		return resultado;
	}
	
	
}