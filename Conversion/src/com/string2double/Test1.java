package com.string2double;

public class Test1 {
	public static void main(String[] args) {
		
		String s = "23.6";
		double d = Double.parseDouble(s);
		
		System.out.println(s+100);//23.6100 because + is string concatenation operator  
		System.out.println(d+100);//123.6 because + is binary plus operator 
	}

}
