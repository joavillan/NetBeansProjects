package momatools.gui.tabs;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
//import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//import org.apache.poi.hssf.usermodel.HSSFCell;
//import org.apache.poi.hssf.usermodel.HSSFRow;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.util.ZipSecureFile;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.DataFormatter;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import momatools.gui.main.FileUtils;
import momatools.gui.main.GuiUtils;
import regularizacion.persistence.entity.BackendErrorOrder;
import regularizacion.persistence.entity.Extraccion;
import regularizacion.persistence.entity.KOCreacion;
import regularizacion.persistence.entity.PdteBackend;

/**
 * Tab para automatizar la extracción de tickets
 * 
 * @author j.villegas.antunez
 *
 */
public class TabSeguimientoF1s extends TabParents {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final JLabel jlBuscar = new JLabel("Ruta del fichero:");
	/**
	 * Campo de texto donde se almacenara la ruta de procedencia del excel.
	 */
	private static final JTextField jtfProcedencia = new JTextField("-- Seleccionar el fichero excel exportado de F1");
	/**
	 * Boton cuya accion sera elegir el directorio donde guardaremos los
	 * ficheros.
	 */
	private static final JButton botonBuscarFich = new JButton("Buscar...");
	
	/**
	 * Botón que desencadena los procesos y métodos necesarios para generar el nuevo Excel
	 */
	private static final JButton botonAñadirFich = new JButton("Añadir"); 
	
	private static final JLabel jlDestino = new JLabel("Destino para el Excel generado:");
	
	private static final JTextField jtfDestino = new JTextField("-- Seleccionar el directorio de destino para el excel exportado de F1");
	
	private static final JButton botonBuscarDir = new JButton("Buscar...");
	
//	Date vFecha = new Date();
//	
//	private String fecha = vFecha.getYear()+""+vFecha.getMonth()+""+vFecha.getDay();
//	

	//Nombre del documento generado
	Calendar c2 = new GregorianCalendar();
	String dia = Integer.toString(c2.get(Calendar.DATE));
	String mes = Integer.toString(c2.get(Calendar.MONTH)+1);
	String annio = Integer.toString(c2.get(Calendar.YEAR));
	private final String NOMBRESEGUIMIENTO = "Seguimiento_F1_"+annio+mes+dia+".xlsx";

	
	public TabSeguimientoF1s(JTextArea resultados) {
		super(new GridBagLayout(), resultados);
		initComponents();
	}
	
	/**
	 * Método que inicializa los componentes de la interfaz gráfica
	 */
	public void initComponents(){
		oyentes();
		posicionamiento();
	}
	
	/**
	 * Metodo que añade las funcionalidades a los botones
	 */
	public void oyentes(){
		botonBuscarFich.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FileUtils.selectExcelFile(jtfProcedencia, null);
			}
		});
		
		botonAñadirFich.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				recolectarDatosExcel();
				
			}
		});
		
		botonBuscarDir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FileUtils.selectFolder(jtfDestino, null);;
			}
		});
	}
	
	/**
	 * Metodo que posiciona y dimensiona los elementos de la interfaz gráfica
	 */
	public void posicionamiento() {

		add(jlBuscar, GuiUtils.posicionarElemento(10, 1, 0, 2, 1, 1, GridBagConstraints.NONE, GridBagConstraints.WEST));
		add(jtfProcedencia, GuiUtils.posicionarElemento(300, 1, 1, 2, 1,  1, GridBagConstraints.HORIZONTAL,
				GridBagConstraints.WEST));
		add(botonBuscarFich,
				GuiUtils.posicionarElemento(10, 1, 2, 2, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.WEST));
		add(botonAñadirFich,
				GuiUtils.posicionarElemento(10, 1, 3, 2, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.EAST));
		add(jlDestino, GuiUtils.posicionarElemento(10, 1, 0, 3, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.EAST));
		add(jtfDestino, GuiUtils.posicionarElemento(100, 1, 1, 3, 1, 1, GridBagConstraints.HORIZONTAL,
				GridBagConstraints.EAST));
		add(botonBuscarDir,
				GuiUtils.posicionarElemento(10, 1, 2, 3, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.EAST));
	}
	
	/**
	 * Método que guarda los datos del Excel en una lista de objetos
	 * Los campos comentados son referencias de celdas con formato customizado (Fecha: dd/mm/aaaa hh:mm:ss) en el Excel, el cual no he podido guardar
	 * @param file
	 * @throws IOException
	 */
	private void guardarDatos(XSSFWorkbook file) throws IOException {
//		int count = 0 ;
		XSSFSheet Resumen = file.getSheetAt(0);
		 ArrayList<Extraccion> ex = new ArrayList<>();
		    //I've Header and I'm ignoring header for that I've +1 in loop
		 for(int i=Resumen.getFirstRowNum()+1;i<=Resumen.getLastRowNum();i++){
	          Extraccion e= new Extraccion();
	          Row ro=Resumen.getRow(i);
	          for(int j=ro.getFirstCellNum();j<=ro.getLastCellNum();j++){
	              Cell ce = ro.getCell(j);
	              //Se comprueba que columna es dentro del Excel y se guarda en su propiedad correspondiente
	            if(j==0){  
	                //If you have Header in text It'll throw exception because it won't get NumericValue
	                e.setTicket_Id(ce.getStringCellValue());
	            }
	            if(j==1){
	                e.setTipo_Ticket(ce.getStringCellValue());
	            }
	            if(j==2){
	                e.setFecha_Creacion(String.valueOf(ce.getNumericCellValue()));
	            }
	            if(j==3){
	                e.setEstado(ce.getStringCellValue());
	            }
	            if(j==4){
	                e.setDesc_Estado(ce.getStringCellValue());
	            }  
	            if(j==5){
	                e.setEnlace_Ppm(ce.getStringCellValue());
	            }  
	            if(j==6){
	                e.setGrupo_Entrada(ce.getStringCellValue());
	            }  
	            if(j==7){
	                e.setGrupo_Actual(ce.getStringCellValue());
	            }  
	            if(j==8){
	                e.setOrganizacion_Soporte(ce.getStringCellValue());
	            }  
	            if(j==9){
	                e.setCateg_Prod1(ce.getStringCellValue());
	            }  
	            if(j==10){
	                e.setCateg_prod2(ce.getStringCellValue());
	            }  
	            if(j==11){
	                e.setCateg_prod3(ce.getStringCellValue());
	            }  
	            if(j==12){
	                e.setNombre_Prod(ce.getStringCellValue());
	            }  
	            if(j==13){
//	            	System.out.print(ce.getCellType());System.out.println(" "+count++);
//	                e.setFeacha_Resolucion(String.valueOf(ce.getRichStringCellValue()));
	            }  
	            if(j==14){
//	                e.setFecha_Cierre(String.valueOf(ce.getNumericCellValue()));
	            }  
	            if(j==15){
//	                e.setFecha_Objetivo(ce.getStringCellValue());
	            }  
	            if(j==16){
	                e.setExcluir_Ans(ce.getStringCellValue());
	            }  
	            if(j==17){
//	                e.setFecha_Ultima_modificacion(String.valueOf(ce.getNumericCellValue()));
	            }  
	            if(j==18){
	                e.setCanal_Entrada(ce.getStringCellValue());
	            }  
	            if(j==19){
	                e.setSolicitud_Servicio(ce.getStringCellValue());
	            }  
	            if(j==20){
	                e.setIndisp_Serv(ce.getStringCellValue());
	            }  
	            if(j==21){
	                e.setAfecta_usuario(ce.getStringCellValue());
	            }  
	            if(j==22){
	                e.setImpacto(ce.getStringCellValue());
	            }  
	            if(j==23){
	                e.setPrioridad(ce.getStringCellValue());
	            }  
	            if(j==24){
	                e.setInc_Difundida(ce.getStringCellValue());
	            }  
	            if(j==25){
	                e.setLocalidad_cliente(ce.getStringCellValue());
	            }  
	            if(j==26){
	                e.setUbicacion_cliente(ce.getStringCellValue());
	            }  
	            if(j==27){
	                e.setCliente_Id(ce.getStringCellValue());
	            }  
	            if(j==28){
	                e.setNombre_cliente(ce.getStringCellValue());
	            }
	            if(j==29){
	                e.setApellidos_cliente(ce.getStringCellValue());
	            }
	            if(j==30){
	                e.setAmbito_Ss(ce.getStringCellValue());
	            }
	            if(j==31){
	                e.setPais_Cliente(ce.getStringCellValue());
	            }
	            if(j==32){
	                e.setResumen(ce.getStringCellValue());
	            }
	            if(j==33){
	                e.setNotas(ce.getStringCellValue());
	            }
	            if(j==34){
	                e.setNumero_Reasignados(String.valueOf(ce.getNumericCellValue()));
	            }
	            if(j==35){
	                e.setNumero_Reaperturas(String.valueOf(ce.getNumericCellValue()));
	            }
	            if(j==36){
	                e.setMemo(ce.getStringCellValue());
	            }
	            if(j==37){
	                e.setRemitente(ce.getStringCellValue());
	            }
	            if(j==38){
	                e.setUsuario_Asignado(ce.getStringCellValue());
	            }
	            if(j==39){
	                e.setResolucion(ce.getStringCellValue());
	            }
	            if(j==40){
	                e.setTipo_Incidencia(ce.getStringCellValue());
	            }
	            if(j==41){
	                e.setVip(ce.getStringCellValue());
	            }
	            if(j==42){
//	                e.setFecha_Inicio_Real(ce.getStringCellValue());
	            }
	            if(j==43){
//	                e.setFecha_Programada_Inicio(ce.getStringCellValue());
	            }
	            if(j==44){
//	                e.setFecha_programada_Finalizacion(ce.getStringCellValue());
	            }
	            if(j==45){
	                e.setPatron(ce.getStringCellValue());
	            }
	            if(j==46){
	                e.setCausa_Raiz(ce.getStringCellValue());
	            }
	            if(j==47){
	                e.setGrupo_Apertura(ce.getStringCellValue());
	            }
	            if(j==48){
	                e.setUsuario_Resultor(ce.getStringCellValue());
	            }
	            if(j==49){
	                e.setMotivo_Resolucion(ce.getStringCellValue());
	            }
	            if(j==50){
	                e.setCateg_Detalle1(ce.getStringCellValue());
	            }
	            if(j==51){
	                e.setCateg_Detalle2(ce.getStringCellValue());
	            }
	            if(j==52){
	                e.setCateg_Detalle3(ce.getStringCellValue());
	            }
	            if(j==53){
	                e.setCateg_Resolucion1(ce.getStringCellValue());
	            }
	            if(j==54){
	                e.setCateg_Resolucion2(ce.getStringCellValue());
	            }
	            if(j==55){
	                e.setCateg_Resolucion3(ce.getStringCellValue());
	            }
	            if(j==56){
	                e.setServicio_Afectado(ce.getStringCellValue());
	            }
	            if(j==57){
	                e.setCateg_Operacional2(ce.getStringCellValue());
	            }
	            if(j==58){
	                e.setCateg_Operacional3(ce.getStringCellValue());
	            }
	            if(j==59){
	                e.setPais_Enrutado(ce.getStringCellValue());
	            }
	            if(j==60){
//	                e.setFecha_Cierre_Calculo(ce.getStringCellValue());
	            }
	            if(j==61){
//	                e.setFecha_Creacion_Calculo(ce.getStringCellValue());
	            }
	            if(j==62){
	                e.setEntre0y4(ce.getStringCellValue());
	            }
	            if(j==63){
	                e.setEntre5y14(ce.getStringCellValue());
	            }
	            if(j==64){
	                e.setEntre15y20(ce.getStringCellValue());
	            }
	            if(j==65){
	                e.setMayor20(ce.getStringCellValue());
	            }
	            if(j==66){
//	                e.setFecha_Extraccion(ce.getStringCellValue());
	            }
	            if(j==67){
	                e.setEntrada(ce.getStringCellValue());
	            }
	            if(j==68){
	                if (ce.getStringCellValue() != null) {
	                	e.setCerrados(ce.getStringCellValue());
					}
	            }
	            if(j==69){
	            	if (ce == null) {
	                	break;
					}else{
						e.setGrupo_Ans(ce.getStringCellValue());
					}
	            }
	            if(j==70){
	                if (ce == null) {
	                	break;
					}else{
						e.setDevueltas_Nosotros(ce.getStringCellValue());
					}
	            }
	            if(j==71){
	            	if (ce != null) {
	            		e.setReasignadas_Otros(ce.getStringCellValue());
					}
	            }
	            if(j==72){
	            	if (ce != null) {
	            		e.setMes(ce.getStringCellValue());
					}
	            }
	            if(j==73){
	            	if (ce != null) {
	            		e.setMes_Cierre_Automático(ce.getStringCellValue());
					}
	            }
	          }
	          //Se guarda el valor de la celda en la propiedad del objeto del ArrayList
	          ex.add(e);
	      }
	 }
	
	/**
	 * Método que recoge el documento Excel a procesar y genera el nuevo
	 */
	private void recolectarDatosExcel() {
		
		System.out.println("Generar informe");
		XSSFWorkbook excelWO = null;
//		FileInputStream fileIn= null;
		FileOutputStream fileOut = null;
		try {
			ZipSecureFile.setMinInflateRatio(0.00001);
			//Se asigna una ruta y el nombre al archivo que será creado
			fileOut = new FileOutputStream(jtfDestino.getText() + "\\" + NOMBRESEGUIMIENTO);
			//Se recoge el archivo que será procesado para generar el nuevo documento
			excelWO = new XSSFWorkbook(jtfProcedencia.getText());
			//Llamada al método para gurdar los datos del Excel seleccionado en una Lista de objetos
			guardarDatos(excelWO);
			//procesarDatos();
			//subirDatos();
			/**
			 * Escritura para comprobar que se recogen bien los datos (provisional)
			 * Se debe cambiar por un metodo que escriba el documento con los datos de los objetos guardados.
			 */
			excelWO.write(fileOut);
			//Mensaje de proceso correcto
			JOptionPane.showMessageDialog(null, "Se ha generado su excel correctamente.", "Correcto",
					JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e) {
			//Datos erroneos, también es posible que ya haya una exportación en esa fecha ya que solo dbe de haber una por día
			JOptionPane.showMessageDialog(null, "Error al generar plantilla", "ATENCIÓN", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		} finally {
			try {
				//se cierra el flujo de ambos archivos
				fileOut.close();
				excelWO.close();
			} catch (IOException e) {
			}
		}
	}
}

