package com.error.verifyerror;

public class TestClassC {
	
	public static void _print_(TestClassA a){
		a.print();
	}
	
	public static void main(String[] args){
		
		TestClassB b = new TestClassB();
		TestClassC._print_(b);
	}

}

