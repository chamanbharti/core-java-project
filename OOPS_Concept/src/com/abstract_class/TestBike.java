package com.abstract_class;

public class TestBike extends Bike{
	
	TestBike(){
		System.out.println("TestBike Constructor");
	}
	
	{
		System.out.println("I'm initialization block of TestBike");
	}
	
	static{
		System.out.println("I'm static block of TestBike");
	}
	//@Override
	void run() {
		System.out.println("Running Safely...");
		
	}
	public static void main(String[] args) {
		TestBike b = new TestBike();
		b.show();
		b.run();
		b.show1();//non-static way
		show1();//static way
	}
	

}
