package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Julio_Cesar Oliva_Herrera
 *
 */
public class DateTime {
	
	LocalDateTime dateAndTime;
	DateTimeFormatter dtFormat;
	String datumOchTidString;
	
	static public String getDatumOchTid() {
		LocalDateTime dateAndTime = LocalDateTime.now();
		DateTimeFormatter dtFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String datumOchTidString = dateAndTime.format(dtFormat).toString();
		
		return datumOchTidString;	
		
	}
	
}
