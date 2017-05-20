package com.top10.exception;

public class NumerFormatException1 {
public static void main(String[] args) {
		
		int i = Integer.parseInt("200");
		int ii = Integer.parseInt("ten");//java.lang.NumberFormatException:For input string: "ten"
		
		System.out.println(i); 
		System.out.println(ii);//java.lang.NumberFormatException:For input string: "ten"
	}

}
