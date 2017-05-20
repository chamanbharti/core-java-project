package com.method.model;

public class ReturnLocalVariable {
	
	int a =100;//instance(class) variable
	int m1(int a)//local variable
	{
		System.out.println("m1 method");
		return a;//return local variable 10
	}
	/*int m1(int b)//local variable
	{
		System.out.println("m1 method");
		return a;//return instance variable 100
	}*/
	public static final void main(String[] args) {
		ReturnLocalVariable test = new ReturnLocalVariable();
		int x = test.m1(10);
		System.out.println("method return value= "+x);
	}

}
