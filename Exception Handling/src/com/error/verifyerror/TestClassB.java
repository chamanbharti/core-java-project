package com.error.verifyerror;

//A class tries to extend a class declared as final:
public class TestClassB{
	
	public TestClassB() {
		super();
		System.out.println("Created a new instance of the TestClassB class");
	}
	//A method tries to override a super method that is declared as final:
	public void print() {
        System.out.println("TestClassB::print()");
    }
	
	/*public static void main(String[] args) {
		TestClassB b = new TestClassB();
		b.print();
	}*/
}
