package javatpoint.classic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
	
	public static void main(String[] args) {
		//Method I Date to String
		/*Date date1 = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String strDate = formatter.format(date1);
		System.out.println("Formatted Date:"+strDate);*/
		
		//Method II String to Date
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		try{
			 Date date = formatter.parse("12/04/2017");
			 System.out.println("Formatted Date :"+date);
		}catch(ParseException e){
			e.printStackTrace();
		}
		
		//full example to format date and time in java
		/*Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		String strDate = formatter.format(date);
		System.out.println("Date Format with MM/dd/yyyy : "+strDate);  
		
		formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		strDate = formatter.format(date);
		 System.out.println("Date Format with dd-M-yyyy hh:mm:ss : "+strDate);  
		 
		 formatter = new SimpleDateFormat("dd MMMM yyyy");
		 strDate = formatter.format(date);
		 System.out.println("Date Format with dd MMMM yyyy : "+strDate);  
		 
		 formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");
		 strDate = formatter.format(date);
		 System.out.println("Date Format with dd MMMM yyyy zzzz : "+strDate);  
		
		 formatter = new SimpleDateFormat("E,dd MMM yyyy HH:mm:ss:z");
		 strDate = formatter.format(date);
		 System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z : "+strDate);  */
	}

}
