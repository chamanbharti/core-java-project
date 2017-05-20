package com.javatpoint;

public class Test8 {

	public static void main(String[] args) {
		
		validate(13);
		System.out.println("rest of code...");
	}
	static void validate(int age){
		if(age<18){
				throw new ArithmeticException("Not Valid Age");
		}else{
			System.out.println("Welcome to vote");
		}
	
	}
}
