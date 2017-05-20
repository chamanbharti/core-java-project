package com.polymorphism.compiletime;

public class Calculation2 {
	//2) Example of Method Overloading by changing data type of argument
	
	void sum(int a,int b){
		System.out.println(a+b);
	}
	
	void sum(double a,double b){
		System.out.println(a+b);
	}
	
	void sum(int a,double b){
		System.out.println(a+b);
	}
	
	void sum(int a,long b,double c){
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {

		Calculation2 obj = new Calculation2();
		//void sum(int a,int b)
		obj.sum(10, 20);//it will invoke void sum(int a,int b)
		
		//void sum(int double,double b)
		obj.sum(10.0, 20.0);//it will invoke void sum(int double,double b)
		obj.sum(10, 20);//it will invoke void sum(int double,double b),it promote int to double
		
		//void sum(int a,double b)
		//obj.sum(10, 20); // it will invoke void sum(int a,double b)
		//obj.sum(10, 20.0);
		//obj.sum(10, 20, 30);
		//obj.sum(10, 20, 30.0);

	}

}
