package com.method.model;

public class ReturnInstanceVariable {
	
	int a =100;//instance(class) variable
	int m1()
	{
		System.out.println("m1 method");
		return a;//return instance variable
	}
	public static final void main(String[] args) {
		ReturnInstanceVariable test = new ReturnInstanceVariable();
		int x = test.m1();
		System.out.println("method return value= "+x);
	}

}
