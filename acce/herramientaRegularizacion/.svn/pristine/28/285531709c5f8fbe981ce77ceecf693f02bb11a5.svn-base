package gnf.sender.init;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class AuthOFSC {
	private final Charset UTF8_CHARSET = Charset.forName("UTF-8");
	
	private String password;
	private Date date;
	
	public AuthOFSC()
	{
		this.password = "";
		this.date = null;
	}
	
	public AuthOFSC(String password, Date date)
	{
		this.password = password;
		this.date = date;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public void setDate(Date date)
	{
		this.date = date;
	}
	

	public String genAuthString()
	{
		String auth_string = ""; 
		//Format date on format ISO 8601
		TimeZone tz = TimeZone.getTimeZone("UTC");
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mmZ");
		df.setTimeZone(tz);
		
		try
		{
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(this.password.getBytes(UTF8_CHARSET));
			md.update((df.format(this.date) + String.format("%32s", new BigInteger(1, md.digest()).toString(16)).replace(" ", "0")).getBytes());
			auth_string = String.format("%32s", new BigInteger(1,md.digest()).toString(16)).replace(" ", "0");
		}
		catch(NoSuchAlgorithmException e)
		{
			System.out.println("Error on calculation of auth_string");
		}
		
		return auth_string;
	}
}
