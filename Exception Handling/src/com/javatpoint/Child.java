package com.javatpoint;

public class Child extends Parent{
	
	
//Rule: If the superclass method does not declare an exception, 
//subclass overridden method cannot declare the checked exception.
	//method 1
	/*void msg()throws IOException{
		System.out.println("Parent");
	}*/

//2) Rule: If the superclass method does not declare an exception, 
//subclass overridden method cannot declare the checked exception 
//but can declare unchecked exception.
	/*void msg()throws ArithmeticException{
		System.out.println("Parent");
	}*/
	
	//Rule: If the superclass method declares an exception, 
	/*subclass overridden method can declare same, subclass exception or no exception
	but cannot declare parent exception.*/
	
	/*//same exception
	void msg()throws ArithmeticException{
		System.out.println("Parent");
	}*/
	
	/*//subclass exception
		void msg()throws ArithmeticException{
			System.out.println("Parent");
		}*/
	
	//no exception
	void msg(){
		System.out.println("Parent");
	}
}