package com.string2double;

public class Test2 {
	public static void main(String[] args) {
		
		double d = 23.6f;
		//String s = String.valueOf(d);
		//String s = Double.toString(d);
		String s = Double.toString(23.6f);
		
		System.out.println(d+100);//123.60000038146973 because + is binary plus operator  
		System.out.println(s+100);//23.600000381469727100 because + is string concatenation operator 
	}

}
