package javatpoint.classic;

import java.util.Calendar;
import java.util.Date;

public class UtilCalender {
	
	/*public class Date
			extends Date implements Serializable, Cloneable, Comparable<Date>*/
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("Current date is:"+calendar.getTime());

		System.out.println("Calender Type:"+calendar.getCalendarType());
		calendar.add(Calendar.DATE, -15);
		System.out.println("15 days ago:"+calendar.getTime());
		
		calendar.add(Calendar.DATE, 1);
		System.out.println("1 days before:"+calendar.getTime());
		
		//https://docs.oracle.com/javase/7/docs/api/java/util/Date.html
	}

}
