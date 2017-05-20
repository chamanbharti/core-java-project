package com.javatpoint;

public class Test5 {
	public static void main(String[] args) {
		
		try{
				int data = 25/5;//exception doesn't occur
				System.out.println(data);
		}catch(NullPointerException e){
			/*
Thrown when an application attempts to use null in a case where an object is required. 
These include:Calling the instance method of a null object. 
Accessing or modifying the field of a null object. 
Taking the length of null as if it were an array. 
Accessing or modifying the slots of null as if it were an array. 
Throwing null as if it were a Throwable value. 
Applications should throw instances of this class to indicate other illegal uses of the 
null object. NullPointerException objects may be constructed by the virtual machine as if 
suppression were disabled and/or the stack trace was not writable.
Since:JDK1.0
Author:unascribed
			 */
			System.out.println(e);
		}
		finally{
			System.out.println("finally block is always executed");
		}
		
		System.out.println("rest of code...");
	}

}