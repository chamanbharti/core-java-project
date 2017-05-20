package com.string2float;

public class Test2 {
	public static void main(String[] args) {
		
		float f = 23.6f;
		//String s = String.valueOf(f);
		//String s = Float.toString(f);
		String s = Float.toString(23.6f);
		
		System.out.println(f+100);//123.6 because + is binary plus operator  
		System.out.println(s+100);//23.6100 because + is string concatenation operator 
	}

}
