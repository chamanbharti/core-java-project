package javatpoint.classic;

import java.util.Date;

public class CurrentDate {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println("java.util.Date: "+date);
		
		long millis = System.currentTimeMillis();
		Date date2 = new Date(millis);
		System.out.println("java.sql.Date: "+date2);
		
		//Get Current Date: java.sql.Date
		long millis2 = System.currentTimeMillis();
		java.sql.Date date3 = new java.sql.Date(millis2);
		System.out.println("java.sql.Date: "+date3);
		
		//Get Current Date & Time: java.util.Calendar
		Date date4=java.util.Calendar.getInstance().getTime();  
		System.out.println("java.util.Calender: "+date4);  
		
		//Get Current Date: java.time.LocalDate
		System.out.println("java.time.Local Date: "+java.time.LocalDate.now());
		
		//Get Current Time: java.time.LocalTime
		System.out.println("java.time.Local Time: "+java.time.LocalTime.now());
		
		//Get Current Date & Time: java.time.LocalDateTime
		System.out.println("java.time.LocalDateTime: "+java.time.LocalDateTime.now());
		
		//Get Current Date & Time: java.time.Clock
		System.out.println("java.time.Clock:"+java.time.Clock.systemUTC().instant());
	}
}
