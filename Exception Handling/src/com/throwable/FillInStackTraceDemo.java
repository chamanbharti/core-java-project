package com.throwable;
//public Throwable fillInStackTrace()
public class FillInStackTraceDemo {
	
	public static void main(String[] args) throws Throwable {
		
		System.out.println("\t ****Throwable Exception Class Demo****");
		
		//public Throwable fillInStackTrace()
		/*This method fills in the execution stack trace. This method records within 
		this Throwable object information about the current state of the stack frames for 
		the current thread.*/
		System.out.println(" \t ****public Throwable fillInStackTrace()****");
		
		try{
			function2();
		}catch(Exception e){
			System.err.println("Caught Inside Main:");
			e.printStackTrace();
		}
	}

	private static void function2() throws Throwable {
		
		try{
			function1();
		}catch(Exception e){
			System.err.println("Inside function2():");
			e.printStackTrace();
			throw e.fillInStackTrace();
		}
		
	}

	private static void function1() throws Exception{
		throw new Exception("this is thrown from function1()");
		
	}

}
