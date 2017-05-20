package CurrentDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {
	public static void main(String[] args) throws ParseException {  
		//Java SimpleDateFormat Example: Date to String
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		String strdate = formatter.format(date);
		System.out.println(strdate);
		//Java SimpleDateFormat Example: String to Date
		SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy");
		Date date2 = formatter2.parse("31/03/2015");
		System.out.println("Date is: "+date2);
		//Java String to int
		String s="200";  
		int i=Integer.parseInt(s);  
		System.out.println(s+100);//200100 because + is string concatenation operator  
		System.out.println(i+100);//300 because + is binary plus operator  
		//Java int to String
		int j=200;  
		String t=String.valueOf(i);  
		System.out.println(j+100);//300 because + is binary plus operator  
		System.out.println(t+100);//200100 because + is string concatenation operator  
		//Java String to long
		String u="9990449935";  
		long l=Long.parseLong(u);  
		System.out.println(l); 
		//Java long to String using String.valueOf()
		long ll=9993939399L;  
		String ss=String.valueOf(ll);  
		System.out.println(ss);  
		////Java long to String using Long.toString()
		long ii=9993939399L;  
		String sss=Long.toString(ii);  
		System.out.println(sss);  
		//Java String to float
		String s2f="23.6";  
		float f=Float.parseFloat("23.6");  
		System.out.println(f); 
		//Java String to double
		String s2d="23.6";
		double d = Double.parseDouble(s2d);
		System.out.println(d);
		//Java String to Date
		String sDate1="31/12/1998";  
	    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
	    System.out.println(sDate1+"\t"+date1);  

}
	
}
