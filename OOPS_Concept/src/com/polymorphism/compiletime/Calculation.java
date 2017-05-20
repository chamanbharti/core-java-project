package com.polymorphism.compiletime;

public class Calculation {
	//1) Example of Method Overloading by changing the no. of arguments
	public void sum(int a,int b){
		System.out.println(a+b);
	}
	
	public void sum(int a,int b,int c){
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		
		Calculation obj = new Calculation();
		obj.sum(10, 20);
		obj.sum(10, 20, 30);
	}

}
