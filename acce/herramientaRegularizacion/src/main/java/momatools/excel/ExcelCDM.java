package momatools.excel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.util.List;
import java.util.ResourceBundle;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import momatools.data.Database;

public class ExcelCDM {
	/** Bundle con la informacion de la configuracion */
    private static ResourceBundle resourceConf = ResourceBundle.getBundle("ConfiguracionInformes");

	/** Metodo que actualiza el excel con lo leido en BBDD
	 * @param rutaExcel
	 * @throws Exception
	 */
	public static void actualizaExcel(String rutaExcel) throws Exception{
		//Abrimos el fichero excel
		InputStream inp = new FileInputStream(rutaExcel);
		XSSFWorkbook wb =  new XSSFWorkbook(inp);
		
		//Obtenemos la lista de querys a lanzar
		final String[] querys = resourceConf.getString("cdm.querys").split(";");
		
		//Bucle para rellenar la excel
		for (int i = 0; i < querys.length; i++){
			//Se obtienen los datos de la query
			String fichero = resourceConf.getString("cdm.query" + querys[i] + ".fichero");
			String sheetName = resourceConf.getString("cdm.query" + querys[i] + ".sheet");
			int columna = Integer.valueOf(resourceConf.getString("cdm.query" + querys[i] + ".columna")).intValue();
			String[] columnas = resourceConf.getString("cdm.query" + querys[i] + ".columnas").split(";");
			String[] tipoColumnas = resourceConf.getString("cdm.query" + querys[i] + ".tipo.columnas").split(";");
			String completo = resourceConf.getString("cdm.query" + querys[i] + ".completo");
			
			System.out.println("Hoja: " + sheetName);
			
			//Se lanza la query
			List<String[]> resultado = Database.ejecutaQuery(Database.DB_KPI, leeQuery(fichero), columnas);
			
			//Se rellenan en la excel en la posicion indicada
			XSSFSheet sheet = wb.getSheet(sheetName);
			XSSFRow row;
			XSSFCell cell;
			int numFila = 1;

			row = sheet.getRow(numFila);

			if (completo.equals("N")){
				//Como es una actualizacion parcial buscamos la ultima fila no informada
				cell = row.getCell(0);
				while (cell != null){
					numFila++;
					row = sheet.getRow(numFila);
					cell = row.getCell(0);
				}
			}
			
			for (int j = 0; j < resultado.size(); j++){
				String[] fila = resultado.get(j);
				
				//Actualizamos las celdas con su valor
				for (int f = 0; f < fila.length; f++){
					cell = row.getCell(columna + f);
					if (cell == null)
						cell = row.createCell(columna + f);
					if (tipoColumnas[f].equals(Cell.CELL_TYPE_NUMERIC + ""))
						cell.setCellValue(Double.valueOf(fila[f]).doubleValue());
					else
						cell.setCellValue(fila[f]);
				}
				
				//Pasamos a la siguiente fila
				numFila++;
				row = sheet.getRow(numFila);
				if (row == null)
					row = sheet.createRow(numFila);
			}
		}
		
		//Actualizamos el fichero excel
		FileOutputStream fileOut = new FileOutputStream(rutaExcel);
		wb.write(fileOut);
		fileOut.close();
		wb.close();
	}
	
	
	/** Crea una cadena con la query almacenada en fichero
	 * @param file
	 * @return
	 * @throws Exception
	 */
	private static String leeQuery(String file) throws Exception {
		String s = new String();
		StringBuffer sb = new StringBuffer();

		FileReader fr = new FileReader(new File("src/main/java/sql/" + file));
		BufferedReader br = new BufferedReader(fr);

		while ((s = br.readLine()) != null) {
			if (!s.startsWith("--"))
				sb.append(s);
		}
		br.close();

		return sb.toString();
	}
}