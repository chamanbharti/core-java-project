package com.string2long;

public class Test1 {
	public static void main(String[] args) {
		
		String s="9990449935";  
		long l=Long.parseLong(s);  
		System.out.println(l);//9990449935
		System.out.println(s+100);//9993939499 because + is string concatenation operator  
		System.out.println(l+100);//9993939399100 because + is binary plus operator  
	}

}
