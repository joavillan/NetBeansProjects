package activity.utilidades;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

public class MomaServicesUtil {

	public MomaServicesUtil() {
		super();
	}

	private static final Logger LOGGER = Logger.getLogger(MomaServicesUtil.class);

	public static boolean writeFile(String path, String fileName, byte[] fileBytes) {
		File targetFileIdx = new File(path, fileName);
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(targetFileIdx);
			fos.write(fileBytes);
		} catch (FileNotFoundException e) {
			LOGGER.error("Ruta de destino: " + path, e);
			return false;
		} catch (IOException e) {
			LOGGER.error("Ruta de destino: " + path, e);
			return false;
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				LOGGER.error("MomaServicesUtil -> Could not close in stream", e);
			}
		}
		return true;
	}

	public static MessageDigest getMessageDigest(String fechaFormato) {
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			LOGGER.error(e.getMessage(), e);
			return null;
		}
		md.update(("s04p_t3st1").getBytes());
		md.update(
				(fechaFormato + StringUtils.leftPad(new BigInteger(1, md.digest()).toString(16), 32, '0')).getBytes());
		return md;
	}

}
