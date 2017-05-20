package com.method.model;

public class ClassTypeReturn {
	
 ClassTypeReturn m1() {
		System.out.println("m1 method");
		ClassTypeReturn t = new ClassTypeReturn();
		//return t;
		return new ClassTypeReturn();
	}
 	ClassTypeReturn m2() {
		System.out.println("m2 method");
		return this;
	}
 	public static void main(String[] args) {
		ClassTypeReturn t1= new ClassTypeReturn();
		ClassTypeReturn t2=t1.m1();
		ClassTypeReturn t3=t1.m2();
	}

}
