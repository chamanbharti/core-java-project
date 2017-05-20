package com.method.model;

public class ReturnInstanceVariable2 {
	
	int a =100;//instance(class) variable
	int m1(int a)//local variable
	{
		System.out.println("m1 method");
		return this.a;//return instance variable
	}
	public static final void main(String[] args) {
		ReturnInstanceVariable2 test = new ReturnInstanceVariable2();
		int x = test.m1(10);
		System.out.println("method return value= "+x);
	}

}
