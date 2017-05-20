package com.abstract_class;

class Test{
	int x=10;
	public void display(){
		System.out.println("Hello 1");
	}
}
public abstract class Demo1 {
	//constructor
	Demo1(){
			System.out.println("Bike Constructor");
		}
		
		//instance block
		{
			System.out.println("I'm initialization block of Demo1");
		}
		//static block
		static{
			System.out.println("I'm static block of Demo1");
		}
		//static method
			public static void show1(){
				System.out.println("I'm static method of Demo1");
		}
	public static void main(String[] args) {
		Test t1 = new Test();
		System.out.println("From abstract class main(): "+t1.x);
		t1.display();
	}

}
