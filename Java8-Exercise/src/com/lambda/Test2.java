	package com.lambda;

public class Test2 {
	
	final static String salutation = " Hello! ";
	
	public static void main(String[] args) {
		
		GreetingService greetingService1 = message ->
		System.out.println(salutation + message);
		
		greetingService1.sayMessage("Chaman Bharti");
		
	}
	
	interface GreetingService{
		 
		void sayMessage(String message);
	}

}
