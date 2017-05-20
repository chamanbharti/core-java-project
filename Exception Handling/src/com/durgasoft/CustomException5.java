package com.durgasoft;

public class CustomException5 {

		public static void main(String[] args){
			
			try{
				   System.out.println(10/0);
				}
				catch(ArithmeticException e){
				  System.out.println(10/2);
				}
				catch(Exception e){
				  System.out.println(10/2);
				}
				//no exception
			
		}
}


