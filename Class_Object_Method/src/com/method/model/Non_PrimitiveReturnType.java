package com.method.model;
//primitive type
class Emp{}
class X{}
public class Non_PrimitiveReturnType {
	//Emp e = new Emp();
	Emp m1(){
		System.out.println("m1 method");
		Emp e = new Emp();
		return e;
		//return new Emp();
	}
	X m2(){
		System.out.println("m2 method");
		X x = new X();
		return x;
	}
	static String m3(){
		System.out.println("m3 method");
		return "Chaman";
	}
	
	public static void main(String[] args) {
		Non_PrimitiveReturnType test = new Non_PrimitiveReturnType();
		Emp e = test.m1();
		System.out.println(e);
		X x = test.m2();
		System.out.println(x);
		
		String str = test.m3();
		System.out.println(str);
		
	}

}
