package com.javatpoint;

public class Test7 {
	public static void main(String[] args) {
		
		try{
				int data = 25/0;// exception occurs and handled.
				System.out.println(data);
		}catch(ArithmeticException e){
			/*
			 Thrown when an exceptional arithmetic condition has occurred. 
			 For example, an integer "divide by zero" throws an instance of this class. 
			 ArithmeticException objects may be constructed by the virtual machine as if 
			 suppression were disabled and/or the stack trace was not writable.
			 Since:JDK1.0 Author:unascribed

			 */
			System.out.println(e);
		}
		finally{
			System.out.println("finally block is always executed");
		}
		
		System.out.println("rest of code...");
	}

}
