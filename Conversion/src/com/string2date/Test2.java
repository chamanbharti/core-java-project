package com.string2date;

import java.text.DateFormat;
import java.util.Date;

public class Test2 {
	public static void main(String[] args) {
		
		 Date currentDate = new Date();
		 System.out.println("Current Date: "+currentDate);
		 
		 String dateTostr = DateFormat.getInstance().format(currentDate);
		 System.out.println("Date Format using getInstance(): "+dateTostr);
	}

}
