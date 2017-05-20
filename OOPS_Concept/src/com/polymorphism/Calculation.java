package com.polymorphism;

public class Calculation {

	int sum(int a,int b){
		System.out.println(a+b);
		return 0;
	}  
	void sum(int a,int b,int c){System.out.println(a+b+c);}  
	
	public static void main(String[] args) {
		 Calculation c1 = new Calculation();
		 c1.sum(10,10, 10);
		 c1.sum(20,20); 
	}
}
