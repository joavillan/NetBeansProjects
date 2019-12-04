package activity.utilidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * Clase con utilidades de formateo
 * 
 * @author llorenzo
 *
 */
public final class FormatUtils {
	private static final Logger LOGGER = Logger.getLogger(FormatUtils.class);
	private FormatUtils() {
		// not called
	}

	public static Date convertDate(String stringDate, String dateFormat, List<String> alternativeFormats) {
		Date parsed = null;
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);

		// See if we can parse the output of Date.toString()
		if (stringDate != null && !stringDate.isEmpty()) {
			try {
				parsed = format.parse(stringDate);
				LOGGER.trace(parsed.toString());
				// LOGGER.error(" 2. " + parsed.toString());
			} catch (ParseException pe) {
				LOGGER.trace("Format " + dateFormat + " failed. Trying other formats ");
				if (alternativeFormats != null && alternativeFormats.size() > 0) {
					for (int i = 0; i < alternativeFormats.size() && parsed == null; i++) {
						format = new SimpleDateFormat(alternativeFormats.get(i));
						try {
							parsed = format.parse(stringDate);
						} catch (ParseException innerPe) {
							LOGGER.trace("Format " + alternativeFormats.get(i) + " tried and failed");
						}
					}
				}
				if (parsed == null) {
					LOGGER.error("ERROR: Cannot parse \"" + stringDate + "\"");
				}
			}
		}
		return parsed;
	}

	/**
	 * obtains the date of a certain string
	 * 
	 * @param stringDate
	 *            the string to parse
	 * @param dateFormat
	 *            the date format
	 * @return null if an error ocurrs, the date in any other case
	 */
	public static Date convertDate(String stringDate, String dateFormat) {

		return convertDate(stringDate, dateFormat, null);
	}

	public static String parseAsString(Date value, String dateFormat) {
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		return format.format(value);
	}
	
	public static String convertirFechaAFormato(String fecha, String formato) {
		String fechaARetornar = fecha;
		List<String> formatosAlternativos= new ArrayList<String>();
		//agrego primero los formatos con horas minutos y segundos para obtener la mayor info
		formatosAlternativos.add("yyyy-MM-dd'T'HH:mm:ss");
		formatosAlternativos.add("yyyy-MM-dd HH:mm:ss");
		formatosAlternativos.add("yyyy-MM-dd");
		formatosAlternativos.add("dd/MM/yy");
		Date fechaConvert = convertDate(fecha,formato,formatosAlternativos);
		if (fechaConvert!=null) {
			return parseAsString(fechaConvert,formato);
		}
		else{
			LOGGER.error("Error en el parseo de la fecha " + fecha
					+ " no se formatea, se retorna la fecha para el IDX sin convertir, si es una fecha correcta agregue nuevos formatos en esta funcion");
			return fechaARetornar;
		}
	}

}
