package javatpoint.classic;

import java.sql.Date;

public class SQLDate {
	
	/*public class Date
			extends Date implements Serializable, Cloneable, Comparable<Date>*/
	public static void main(String[] args) {
		
		Date date1 = new Date(1000);
		System.out.println("Date is :"+date1);
		
		long millis = System.currentTimeMillis();
		Date date2 = new Date(millis);
		System.out.println("Date of java.sql.Date");
		System.out.println("Date is:"+date2);
		
		//int getHours()
		//System.out.println("getHours():"+date1.getHours());// java.lang.IllegalArgumentException
		
		//int getMinutes()
		//System.out.println("getMinutes():"+date1.getMinutes());//RT:IllegalArgrumentException
		
		//int getSeconds()
		//System.out.println("getSeconds():"+date1.getSeconds());
		
		//int getTime()
		//System.out.println("getTime():"+date1.getTime());
		
		//System.out.println("getTimezoneOffset():"+date1.getTimezoneOffset());
		
		//set hours
		//void setHours(int i)
		//date1.setHours(10000);
		//System.out.println("Time after setting:  " + date1.toString());//IllegalArgumentException
		
		//set minutes
		//void setMinutes(int i)
		//date1.setMinutes(10000);
		//System.out.println("Time after setting:  " + date1.toString());//IllegalArgumentException
		
		//set second
		// void setSeconds(int i)
		//date1.setSeconds(10000);;
		//System.out.println("Time after setting:  " + date1.toString());//IllegalArgumentException
	
		//set Time
		//void setTime()
		//date1.setTime(10000);
		//System.out.println("setTime(): "+date1);
		
		//String toString()
		//Formats a date in the date escape format yyyy-mm-dd.
		//System.out.println(date1.toString());
		
		//static Date valueOf(String s)
		//Converts a string in JDBC date escape format to a Date value.
		//String str = "2017-04-12";
		//Date date2 = Date.valueOf(str);
		//System.out.println("formated date:"+date2);
	}

}
