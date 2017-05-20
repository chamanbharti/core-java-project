package com.abstract_class;

public abstract class Bike {
	
	abstract void run();//abstract method
	//constructor
	Bike(){
		System.out.println("Bike Constructor");
	}
	
	//instance block
	{
		System.out.println("I'm initialization block of Bike");
	}
	//static block
	static{
		System.out.println("I'm static block of Bike");
	}
	//static method
	public static void show1(){
			System.out.println("I'm static method of Bike");
	}
	//concrete method
	public void show(){
		System.out.println("Hello I am abstract's concrete method");
	}
	

}
