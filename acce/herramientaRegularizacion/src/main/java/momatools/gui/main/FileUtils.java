package momatools.gui.main;

import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import javax.swing.Icon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.apache.log4j.Logger;

import momatools.excel.UtilidadesExcel;

/**
 * Clase con metodos estaticos utiles para seleccionar archivos
 * 
 * @author l.lorenzoriesco
 *
 */
public class FileUtils {
	private static final Logger LOGGER = Logger.getLogger(FileUtils.class);

	/**
	 * Carga una ruta con un excel
	 * 
	 * @param component
	 *            donde cargar la ruta
	 * @param rutaInicial
	 *            carpeta donde empezar a buscar
	 * @return cadena con la nueva ruta hasta el archivo
	 */
	public static String selectExcelFile(JTextField component, String rutaInicial) {

		final JFileChooser fc = new JFileChooser(component.getText());
		fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
		fc.setAcceptAllFileFilterUsed(false);
		fc.addChoosableFileFilter(new FileNameExtensionFilter("Solo archivos excel con extension xlsx", "xlsx"));
		// si queremos cargar una ruta por defecto
		if (rutaInicial != null && (new File(rutaInicial)).isDirectory()) {
			fc.setCurrentDirectory(new File(rutaInicial));
		}
		int returnVal = fc.showOpenDialog((Component) null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File inFile = fc.getSelectedFile();
			component.setText(inFile.getAbsolutePath());
			return fc.getSelectedFile().getParent();
		} else
			return null;
	}

	public static String selectFile(JTextField component, String rutaInicial, String extension) {

		final JFileChooser fc = new JFileChooser(component.getText());
		fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
		fc.setAcceptAllFileFilterUsed(false);
		if (!extension.isEmpty())
			fc.addChoosableFileFilter(
					new FileNameExtensionFilter("Solo archivos con extension " + extension, extension));
		// si queremos cargar una ruta por defecto
		if (rutaInicial != null && (new File(rutaInicial)).isDirectory()) {
			fc.setCurrentDirectory(new File(rutaInicial));
		}
		int returnVal = fc.showOpenDialog((Component) null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File inFile = fc.getSelectedFile();
			component.setText(inFile.getAbsolutePath());
			return fc.getSelectedFile().getParent();
		} else
			return null;
	}

	/**
	 * Carga una ruta con un folder
	 * 
	 * @param component
	 *            donde cargar la ruta
	 */
	public static void selectFolder(JTextField component, String rutaInicial) {

		final JFileChooser fc = new JFileChooser(component.getText());
		fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		// si queremos cargar una ruta por defecto
		if (rutaInicial != null && (new File(rutaInicial)).isDirectory()) {
			fc.setCurrentDirectory(new File(rutaInicial));
		}
		int returnVal = fc.showOpenDialog((Component) null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File inFile = fc.getSelectedFile();
			component.setText(inFile.getAbsolutePath());
		}
	}

	/**
	 * Carga una ruta con un folder
	 * 
	 * @param component
	 *            donde cargar la ruta
	 */
	public static String selectFolder(String rutaInicial) {
		String rutaDefecto = null;
		// si queremos cargar una ruta por defecto
		if (rutaInicial != null && (new File(rutaInicial)).isDirectory()) {
			rutaDefecto = rutaInicial;
		}

		final JFileChooser fc = new JFileChooser(rutaDefecto);
		fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		int returnVal = fc.showOpenDialog((Component) null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File inFile = fc.getSelectedFile();
			return inFile.getAbsolutePath();
		}
		return null;
	}

	public static String descargaCopia(JTextField rutaExcel, String lastDirectory) {
		InputStream inp = null;
		try {
			String cadenaExcel = rutaExcel.getText();
			String[] ruta = cadenaExcel.split("/");
			String nombreFile = ruta[ruta.length - 1];

			if (cadenaExcel.contains("{rutaInterna}")) {
				cadenaExcel = cadenaExcel.replace("{rutaInterna}", "");
				inp = UtilidadesExcel.class.getClassLoader().getResourceAsStream(cadenaExcel);
			} else {
				// Abrimos el fichero excel
				inp = new FileInputStream(cadenaExcel);
			}

			FileOutputStream fos = null;
			File fileDest = new File(System.getProperty("java.io.tmpdir"), nombreFile);
			if (fileDest.exists()) {
				fileDest.delete();
			}
			fos = new FileOutputStream(fileDest);

			byte[] b = new byte[1024];
			int pos;
			while ((pos = inp.read(b)) != -1) {
				fos.write(b, 0, pos);
			}
			fos.flush();
			fos.close();
			fos = null;

			File nuevoFile = downloadFile(fileDest, lastDirectory);
			rutaExcel.setText(nuevoFile.getAbsolutePath());
			return nuevoFile.getParent();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (inp != null)
					inp.close();
			} catch (IOException e) {
				LOGGER.error("error descargacopia", e);
				;
			}
		}
		return null;

	}

	public static File downloadFile(File fileDest, String lastDirectory) {

		FileOutputStream fos = null;
		FileInputStream fis = null;
		try {
			JFileChooser ex = new JFileChooser("");
			ex.setFileSelectionMode(0);
			ex.setSelectedFile(fileDest);

			if (lastDirectory != null && (new File(lastDirectory)).isDirectory()) {
				ex.setCurrentDirectory(new File(lastDirectory));
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
			Files.copy(fileDest.toPath(), selectedFile.toPath(), StandardCopyOption.REPLACE_EXISTING);

			return selectedFile;

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

}
