package com.trywithresource;

public class MultiCatchBlock2 {
	public static void main(String[] args) {
		
		try{
			System.out.println(10/0);
			String s = null;
			System.out.println(s.length());
		}
		catch(ArithmeticException e){
			throw new NullPointerException();
		}
	}

}
