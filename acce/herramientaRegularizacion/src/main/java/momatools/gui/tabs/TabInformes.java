package momatools.gui.tabs;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import momatools.data.Database;
import momatools.excel.ExcelCDM;
import momatools.excel.ExcelPiloto;
import momatools.gui.combovals.TipoInforme;
import momatools.gui.main.FileUtils;
import momatools.gui.main.GuiUtils;

public class TabInformes extends TabParents{

	private static final long serialVersionUID = 1L;
	
	private static final String RUTA_DEFECTO = "C:\\GNF\\CdM Soporte\\Motor Cuadro de mando Semana.xlsm";

	private static final TipoInforme[] TIPOS = { TipoInforme.CARGA_KPI,TipoInforme.CUADRO_MANDOS,TipoInforme.SEG_PILOTO};
	private final JComboBox<TipoInforme> tipoInformeCombo = new JComboBox<TipoInforme>(TIPOS);
	

	public TabInformes(JTextArea resultados) {
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

		/************************* CONTROLES *************************/

		

		

		//Text para informar los dias a obtener
		final JTextField diasKPI = new JTextField("0.5");
		
		//Text para informar los ficheros
		final JTextField rutaINC = new JTextField("-- Seleccionar el fichero excel de incidencias (INC) exportado de F1");
		final JTextField rutaWO = new JTextField("-- Seleccionar el fichero excel de órdenes (WO) exportado de F1");

		//Text para informar la ruta de la excel de CDM
		final JTextField rutaExcel = new JTextField(RUTA_DEFECTO);
		
		//Boton para seleccionar un fichero excel
		final JButton btnBuscaExcel = new JButton("Buscar...");
		btnBuscaExcel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FileUtils.selectExcelFile(rutaExcel, RUTA_DEFECTO);
			}
		});
		
		//Boton para seleccionar un fichero excel
		final JButton btnBuscaINC = new JButton("Buscar...");
		btnBuscaINC.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FileUtils.selectFile(rutaINC, "", "xls");
			}
		});
			
		//Boton para seleccionar un fichero excel
		final JButton btnBuscaWO = new JButton("Buscar...");
		btnBuscaWO.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FileUtils.selectFile(rutaWO, "", "xls");
			}
		});
		

		//Boton generar
		JButton boton = new JButton("Generar");


		/************************* PANELES *************************/
		
		
		add(new JLabel("Tipo de informe: "), GuiUtils.posicionarElemento(10, 1, 0, 0, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.WEST));
		add(tipoInformeCombo, GuiUtils.posicionarElemento(10, 1, 1, 0, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.WEST));
		add(new JLabel("Numero de dias a obtener: "), GuiUtils.posicionarElemento(10, 1, 2, 0, 1, 1, GridBagConstraints.NONE, GridBagConstraints.EAST));
		add(diasKPI, GuiUtils.posicionarElemento(10, 1, 3, 0, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.EAST));
		
		add(new JLabel("Ruta de excel de INC: "), GuiUtils.posicionarElemento(10, 1, 0, 1, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.WEST));
		add(rutaINC, GuiUtils.posicionarElemento(10, 1, 1, 1, 2, 1, GridBagConstraints.NONE, GridBagConstraints.WEST));
		add(btnBuscaINC, GuiUtils.posicionarElemento(10, 1, 3, 1, 2, 1, GridBagConstraints.NONE, GridBagConstraints.WEST));
		
		add(new JLabel("Ruta de excel de WO: "), GuiUtils.posicionarElemento(10, 1, 0, 2, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.WEST));
		add(rutaWO, GuiUtils.posicionarElemento(10, 1, 1, 2, 2, 1, GridBagConstraints.NONE, GridBagConstraints.WEST));
		add(btnBuscaWO, GuiUtils.posicionarElemento(10, 1, 3, 2, 2, 1, GridBagConstraints.NONE, GridBagConstraints.WEST));
		
		add(new JLabel("Ruta fichero excel a modificar: "), GuiUtils.posicionarElemento(10, 1, 0, 3, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.WEST));
		add(rutaExcel, GuiUtils.posicionarElemento(10, 1, 1, 3, 2, 1, GridBagConstraints.NONE, GridBagConstraints.WEST));
		add(btnBuscaExcel, GuiUtils.posicionarElemento(10, 1, 3, 3, 2, 1, GridBagConstraints.NONE, GridBagConstraints.WEST));

		GridBagConstraints constraints = new GridBagConstraints();
		constraints.ipadx = 20;

		constraints.gridx = 0;
		constraints.gridy = 4;
		constraints.gridwidth = 4;
		constraints.gridheight = 1;
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.insets = new Insets(0, 10, 0, 10);
		add(boton, constraints);


		/************************* ACCIONES *************************/

		//Acciones del boton
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean correcto = true;
				try{
					if (((TipoInforme) tipoInformeCombo.getSelectedItem()) == TipoInforme.CARGA_KPI){

						//Carga de KPIs
						System.out.println("Seleccionada opcion 'Carga de KPIs'");
						String consulta = Database.ejecutaQueryKPI(diasKPI.getText());
						resultados.setText(consulta);

					}else if (((TipoInforme) tipoInformeCombo.getSelectedItem()) == TipoInforme.SEG_PILOTO){
						//Seguimiento Piloto
						System.out.println("Seleccionada opcion 'Seguimiento Piloto'");
						final long startTime = System.currentTimeMillis();
						ExcelPiloto excelPiloto = new ExcelPiloto(rutaINC.getText(), rutaWO.getText()); 
						excelPiloto.generarInformePiloto();
						final long endTime = System.currentTimeMillis();
						final long totalTime = endTime - startTime;
						final long seconds = totalTime / 1000;
						resultados.setText("TimeControl createActivity -> Tiempo Total del WS: (" + seconds + " seg) - (" + totalTime + " ms)");
					}else if (((TipoInforme) tipoInformeCombo.getSelectedItem()) == TipoInforme.CUADRO_MANDOS){
						//Cuadro de mandos
						System.out.println("Seleccionada opcion 'Cuadro de mandos'");
						final long startTime = System.currentTimeMillis();
						ExcelCDM.actualizaExcel(rutaExcel.getText());
						final long endTime = System.currentTimeMillis();
						final long totalTime = endTime - startTime;
						final long seconds = totalTime / 1000;
						resultados.setText("Cuadro de mandos actualizado -> Tiempo Total: (" + seconds + " seg) - (" + totalTime + " ms)");
					}
				}catch(Exception e1){
					correcto = false;
					resultados.setText(e1.getMessage());
					e1.printStackTrace();
				}
				if (correcto)
					JOptionPane.showMessageDialog(null, "Finalizado", "Fin", JOptionPane.INFORMATION_MESSAGE);
				else
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
}
