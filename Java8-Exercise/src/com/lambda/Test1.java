package com.lambda;


public class Test1 {
	
	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		
		//with type declaration
		MathOperation addition = (int a, int b) -> a + b;
		
		//without type declaration
		MathOperation subtraction = (a, b) -> a - b;
		
		//with return statement along with curly braces
		MathOperation multiplication = (a, b) -> { return a * b; };
		
		//without return statement and without curly braces
		MathOperation division = (a, b) -> a / b;
		
		System.out.println(" 10 + 5 = "+t1.operate(10, 5, addition));
		System.out.println(" 10 - 5 = "+t1.operate(10, 5, subtraction));
		System.out.println(" 10 * 5 = "+t1.operate(10, 5, multiplication));
		System.out.println(" 10 / 5 = "+t1.operate(10, 5, division));
		
		//with parenthesis
		GreetingService greetingService1 = message ->
		System.out.println("Hello "+message);
		
		//without parenthesis
		GreetingService greetingService2 = (message) ->
		System.out.println("Hello "+message);
		
		greetingService1.sayMessage("Chaman Bharti");
		greetingService2.sayMessage("Palak Goyal");
		
	}
	
	interface MathOperation{
		int operation(int a, int b);
	}
	
	interface GreetingService{
		void sayMessage(String message);
	}
	
	private int operate(int a, int b, MathOperation mathOperation){
		return mathOperation.operation(a, b);
	}

}
