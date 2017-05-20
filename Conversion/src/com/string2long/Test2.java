package com.string2long;

public class Test2 {
	public static void main(String[] args) {
		
		long i=9993939399L;
		//String s = String.valueOf(i);
		String s = Long.toString(i);
		System.out.println(i+100);//9993939499 because + is string concatenation operator  
		System.out.println(s+100);//9993939399100 because + is binary plus operator   
	}

}
