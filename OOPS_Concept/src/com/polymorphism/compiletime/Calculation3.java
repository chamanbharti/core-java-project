package com.polymorphism.compiletime;

public class Calculation3 {
	
	int sum(int a,int b){
		System.out.println(a+b);
		return 0;
	}
	
	double sum(int a,int b){
		System.out.println(a+b);
		return 0;
	}

	public static void main(String[] args) {
		Calculation3 obj=new Calculation3();  
		int result=obj.sum(20,20); //Compile Time Error  
	}
}
