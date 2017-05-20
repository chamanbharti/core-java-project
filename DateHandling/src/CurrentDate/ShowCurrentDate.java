package CurrentDate;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

public class ShowCurrentDate {
	
	public static void main(String[] args) {
		/*Get Current Date

// http://howtodoinjava.com/core-java/basics/java-date-examples/
There are 4 ways to print current date in java.

         1st way:*/
		Date date=new Date();
		System.out.println("1st way:"+date);//Fri Jul 15 10:10:02 IST 2016
		
		//2nd way:
		long millis=System.currentTimeMillis();
		Date date2=new Date(millis);
		System.out.println("2nd way:"+date2);//Fri Jul 15 10:10:02 IST 2016
		
		//3th way:
		Date date3=java.util.Calendar.getInstance().getTime();  
		System.out.println("3rd way:"+date3); //Fri Jul 15 10:10:02 IST 2016
		
		//4th way:
		long millis2=System.currentTimeMillis();
		java.sql.Date date4=new java.sql.Date(millis2);
		System.out.println("4th way:"+date4);//2016-07-15
		
		//4th way:
		long millis3=System.currentTimeMillis();
		java.sql.Time time=new java.sql.Time(millis3);
		System.out.println("5th way:"+time);//10:10:02
		
		//5th way:
		long millis4=System.currentTimeMillis();
		java.sql.Timestamp timeStamp=new java.sql.Timestamp(millis4);
		System.out.println("5th way:"+timeStamp);//2016-07-15 10:10:02.542
		
		
	}

}
