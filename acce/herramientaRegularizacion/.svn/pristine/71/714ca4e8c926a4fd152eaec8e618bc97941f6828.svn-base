package momatools.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.util.ZipSecureFile;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import momatools.data.Database;

public class ExcelPiloto {

	private String rutaExcelWO;
	private String rutaExcelINC;
	private List<String[]> registrosKPI;
	private List<String[]> trazasErroneas;
	private List<String[]> listadoF1;
	private XSSFWorkbook libroExcel;
	public String mensajeError;

	// Tabs donde se infoman los datos de las querys y las excels de incidencias
	private static final String TAB_REPORT = "report";
	private static final String TAB_F1_SOPORTE = "f1-soporte";
	private static final String TAB_TRAZAS_FALLIDAS = "Trazas fallidas";

	private static final String TAB_RESUMEN = "Resumen";
	private static final String TAB_HISTORICO = "Historico";

	private static ResourceBundle resourceConf = ResourceBundle.getBundle("ConfiguracionInformes");

	public ExcelPiloto(String rutaExcelINC, String rutaExcelWO) {
		super();
		this.rutaExcelWO = rutaExcelWO;
		this.rutaExcelINC = rutaExcelINC;
		this.registrosKPI = new ArrayList<String[]>();
		this.trazasErroneas = new ArrayList<String[]>();
		this.listadoF1 = new ArrayList<String[]>();
		this.mensajeError = "";
	}

	public void generarInformePiloto() {
		File inp;
		XSSFWorkbook excelWO = null;
		FileOutputStream fileOut = null;
		try {
			// Abrir la plantilla excel e informar las distintas pestañas
			ZipSecureFile.setMinInflateRatio(0.00001);
			inp = new File("src/main/java/momatools/excel/resources/AAAAMMDD Seguimiento Piloto.v1.xlsx");
			inp.setReadable(true);
			fileOut = new FileOutputStream("C:\\GNF\\AAAAMMDD Seguimiento Piloto.v1.xlsx");

			excelWO =  new XSSFWorkbook(inp);


			// Obtener las trazas erroneas
			this.trazasErroneas = Database.ejecutaQuery(Database.DB_MOMAWEB, resourceConf.getString("query.piloto.trazas"), resourceConf.getString("query.piloto.trazas.columnas").split(";"));
			informarPestaña(excelWO, this.trazasErroneas, TAB_TRAZAS_FALLIDAS, 1, this.trazasErroneas.get(0).length, this.trazasErroneas.size());
			this.trazasErroneas = null;

			// Obtener datos de los KPI para llenar pestaña report
			this.registrosKPI = Database.ejecutaQuery(Database.DB_KPI, resourceConf.getString("query.piloto.kpi"), resourceConf.getString("query.piloto.kpi.columnas").split(";"));
			informarPestaña(excelWO, this.registrosKPI, TAB_REPORT, 1, this.registrosKPI.get(0).length, this.registrosKPI.size());
			this.registrosKPI = null;

			// Extraer los datos de los F1 existentes (de la expotacion de la herramienta de F1).
			this.listadoF1 = obtenerIncidenciasyWO();
			informarPestaña(excelWO, this.listadoF1, TAB_F1_SOPORTE, 52, this.listadoF1.get(0).length-1, this.listadoF1.size());
			this.listadoF1 = null;

			// Guardar el fichero generado en la carpeta donde estaban los ficheros de la traza 
			excelWO.write(fileOut);
			fileOut.close();
			excelWO.close();
		} catch (Exception e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fileOut.close();
				excelWO.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}

	private void informarPestaña(XSSFWorkbook excelWO, List<String[]> listaRegistros, String pestania, 
			int desdeFila, int maxColumnas, int maxFilas) {
		// Abrimos la plantilla del informe piloto
		XSSFSheet sheet = excelWO.getSheet(pestania);
		XSSFRow row;
		XSSFCell cell;
		int numFila = 0;
		
		System.out.println("Comenzar en la fila "+desdeFila);
		System.out.println("Maximo de filas a recuperar "+maxFilas);
		System.out.println("Maximo de columnas a recuperar "+maxColumnas);

		int longitud = listaRegistros.get(0).length;			
		Iterator<String[]> registros = listaRegistros.iterator();
		
		System.out.println("Numero de registros "+listaRegistros.size());
		System.out.println("Numero de columnas "+longitud);
		while (registros.hasNext() || numFila < maxFilas) {
			String[] registro = registros.next();
			row = sheet.createRow(desdeFila);
			//Informamos las celdas con los valores obtenidos
			for (int f = 0; f < longitud; f++){
				if (maxColumnas == 0 || f < maxColumnas - 1) {
					cell = row.createCell(f);
					cell.setCellValue(registro[f]);
				}
			}
			desdeFila++;
			numFila++;
		}	

	}

	private List<String[]> obtenerIncidenciasyWO() {
		List<String[]> tablaINCyWO = obtenerInfoDeExcel(this.rutaExcelWO, "Sheet 1");
//		tablaINCyWO.addAll(obtenerInfoDeExcel(this.rutaExcelINC, "Sheet 1"));
		return tablaINCyWO;
	}

	private List<String[]> obtenerInfoDeExcel(String ruta, String hoja) {
		//Obtener los datos de las WO
		InputStream inp;
		List<String[]> tabla = new ArrayList<String[]>();
		try {
			inp = new FileInputStream(ruta);
			HSSFWorkbook excelWO =  new HSSFWorkbook(inp);
			HSSFSheet sheet = excelWO.getSheet(hoja); 

			Iterator<Row> rowIterator = sheet.rowIterator();
			// Avanzamos la primera fila que son los nombres de los campos
			rowIterator.next();
			while(rowIterator.hasNext())
			{
				HSSFRow row = (HSSFRow) rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				int i = 0;
				String[] registros = new String[sheet.getRow(0).getPhysicalNumberOfCells()];
				while(cellIterator.hasNext())
				{
					HSSFCell cell = (HSSFCell) cellIterator.next();
					switch (cell.getCellType()) 
					{
					case Cell.CELL_TYPE_NUMERIC:
						registros[i] = Double.toString(cell.getNumericCellValue()); 
						break;
					case Cell.CELL_TYPE_STRING:
						registros[i] = cell.getStringCellValue(); 
						break;
					}
					i++;
				}
				tabla.add(registros);
			}
			inp.close();
		} catch (FileNotFoundException e) {
			mensajeError = e.getStackTrace().toString();
		} catch (IOException e) {
			mensajeError = e.getStackTrace().toString();
		}

		return tabla;
	}


}
