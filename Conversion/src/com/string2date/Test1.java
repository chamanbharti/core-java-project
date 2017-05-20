package com.string2date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		try{
			Date date = formatter.parse("12/02/1989");
			System.out.println("Date is :"+date);
		}
		catch(ParseException e){
			e.printStackTrace();
		}
		//Date d2 = formatter.parse("31 Mar, 2015");  
        //System.out.println("Date is: "+d2);   
		/*String sDate1 = "12/02/1989";
		Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
		
		System.out.println(sDate1);
		System.out.println(date1);*/
		
	}

}
