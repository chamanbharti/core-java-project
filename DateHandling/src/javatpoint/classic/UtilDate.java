package javatpoint.classic;

import java.util.Date;

public class UtilDate {
	
	/*public class Date
			extends Date implements Serializable, Cloneable, Comparable<Date>*/
	public static void main(String[] args) {
		
		Date date1 = new Date();
		System.out.println("Date is :"+date1);

		long millis = System.currentTimeMillis();
		Date date2 = new Date(millis);
		System.out.println("Date of java.util.Date");
		System.out.println("Date is:"+date2);
		
		//https://docs.oracle.com/javase/7/docs/api/java/util/Date.html
	}

}
