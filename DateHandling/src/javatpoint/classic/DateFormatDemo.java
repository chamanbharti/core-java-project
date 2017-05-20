package javatpoint.classic;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateFormatDemo {
	public static void main(String[] args) throws ParseException{
		
		//method I  Date to String
		/*Date date = new Date();
		System.out.println("Current Date:"+date);
		String date2Str = java.text.DateFormat.getInstance().format(date);
		System.out.println("Formated current Date:"+date2Str);*/
		
		//method II String to Date
		/* Date d = java.text.DateFormat.getDateInstance().parse("31 Mar, 2015");  
	     System.out.println("Date is: "+d);  */
		
		Date date = new Date();
		System.out.println("Current Date:"+date);
		
		String date2Str = java.text.DateFormat.getInstance().format(date);
		System.out.println("Date Format using getInstance():"+date2Str);
		
		date2Str = java.text.DateFormat.getDateInstance().format(date);
		System.out.println("Date Format using getDateInstance():"+date2Str);
		
		date2Str = java.text.DateFormat.getTimeInstance().format(date);
		System.out.println("Date Format using getTimeInstance():"+date2Str);
		
		date2Str = java.text.DateFormat.getDateTimeInstance().format(date);
		System.out.println("Date Format using getDateTimeInstance():"+date2Str);
		
		date2Str = java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT).format(date);
		System.out.println("Date Format using getTimeInstance(DateFormat.SHORT):"+date2Str);
		
		date2Str = java.text.DateFormat.getTimeInstance(java.text.DateFormat.MEDIUM).format(date);
		System.out.println("Date Format using getTimeInstance(DateFormat.MEDIUM):"+date2Str);
		
		date2Str = java.text.DateFormat.getTimeInstance(java.text.DateFormat.LONG).format(date);
		System.out.println("Date Format using getTimeInstance(DateFormat.LONG):"+date2Str);
		
		date2Str = java.text.DateFormat.getTimeInstance(java.text.DateFormat.DEFAULT).format(date);
		System.out.println("Date Format using getTimeInstance(DateFormat.DEFAULT):"+date2Str);
		
		date2Str = java.text.DateFormat.getTimeInstance(java.text.DateFormat.FULL).format(date);
		System.out.println("Date Format using getTimeInstance(DateFormat.FULL):"+date2Str);
		
		date2Str = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(date);
		  System.out.println("Date Format using getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT): "+date2Str);  
	}

}
