package momatools.excel;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilidadesExcel {

	/** Metodo que lee del fichero excel de entrada el numero de columnas indicados y devuelve todos los datos leidos
	 * @param rutaExcel
	 * @param numCampos
	 * @param tieneCabecera
	 * @return
	 * @throws Exception
	 */
	public static List<String[]> leeExcel(String rutaExcel, int numCampos, boolean tieneCabecera) throws Exception{
		List<String[]> resultado = new ArrayList<String[]>();
		InputStream inp =null;
		
		if(rutaExcel.contains("{rutaInterna}")){
			rutaExcel=rutaExcel.replace("{rutaInterna}", "");
			inp = UtilidadesExcel.class.getClassLoader().getResourceAsStream(rutaExcel);
		}else{
			//Abrimos el fichero excel
			inp = new FileInputStream(rutaExcel);
		}
		
		
		XSSFWorkbook wb =  new XSSFWorkbook(inp);
		XSSFSheet sheet = wb.getSheetAt(0); //Suponemos que la excel solo tiene una hoja
		Iterator<Row> rowIterator = sheet.iterator();
		Row row;

		// Recorremos todas las filas para mostrar el contenido de cada celda
		if (tieneCabecera) rowIterator.next(); //Saltamos la primera fila
		while (rowIterator.hasNext()){
			row = rowIterator.next();

			String[] fila = new String[numCampos];
			int numCol = 0;
			
			//Obtenemos el iterator que permite recorrer todas las celdas de una fila
			Iterator<Cell> cellIterator = row.cellIterator();
			Cell celda;
			while (cellIterator.hasNext() && numCol < numCampos){
				celda = cellIterator.next();

				// Dependiendo del formato de la celda el valor se debe mostrar como String, Fecha, boolean, entero...
				switch(celda.getCellType()) {
				case Cell.CELL_TYPE_NUMERIC:
					if( DateUtil.isCellDateFormatted(celda) ){
						fila[numCol] = celda.getDateCellValue().toString();
					}else{
						fila[numCol] = ((int)celda.getNumericCellValue()) + "";
					}
					break;
				case Cell.CELL_TYPE_STRING:
					fila[numCol] = celda.getStringCellValue();
					break;
				case Cell.CELL_TYPE_BOOLEAN:
					fila[numCol] = celda.getBooleanCellValue() + "";
					break;
				}
				
				numCol++;
			}
			
			resultado.add(fila);
		}
		
		//Cerramos el libro excel
		wb.close();

		return resultado;
	}
}
