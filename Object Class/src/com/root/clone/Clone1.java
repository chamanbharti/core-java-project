package com.root.clone;

import java.util.GregorianCalendar;

public class Clone1 {
	public static void main(String[] args) {

		   // create a gregorian calendar, which is an object
		   GregorianCalendar cal = new GregorianCalendar();

		   // clone object cal into object y
		   GregorianCalendar y = (GregorianCalendar) cal.clone();

		   // print both cal and y
		   System.out.println("" + cal.getTime());
		   System.out.println("" + y.getTime());
		   }

}
