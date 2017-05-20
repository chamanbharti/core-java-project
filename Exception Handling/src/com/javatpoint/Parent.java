package com.javatpoint;

public class Parent {
	//Rule:1
	//If the superclass method does not declare an exception
	/*void msg(){
		System.out.println("Parent");
	}*/
	
	//Rule:2
	//If the superclass method declares an exception
	
	void msg()throws Exception{
		System.out.println("Parent");
	}
}
