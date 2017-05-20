package com.method.model;
//primitive type
public class PrimitiveReturnType {
	
	int m1(){
		System.out.println("m1 method");
		return 10;
	}
	float m2(){
		System.out.println("m2 method");
		return 10.5f;
	}
	long m3(){
		System.out.println("m3 method");
		return 10L;
	}
	double m4(){
		System.out.println("m4 method");
		return 10.5d;
	}
	char m5(){
		System.out.println("m5 method");
		return 'c';
	}
	static String m6(){
		System.out.println("m6 method");
		return "Chaman";
	}
	short m7(){
		System.out.println("m7 method");
		return 10;
	}
	byte m8(){
		System.out.println("m8 method");
		return 10;
	}
	boolean m9(){
		System.out.println("m9 method");
		return true;
	}
	public static void main(String[] args) {
		PrimitiveReturnType test = new PrimitiveReturnType();
		int i = test.m1();
		System.out.println("return value of m1(): "+i);
		float f = test.m2();
		System.out.println("return value of m2(): "+f);
		long l = test.m3();
		System.out.println("return value of m3(): "+l);
		double d = test.m4();
		System.out.println("return value of m4(): "+d);
		char ch = test.m5();
		System.out.println("return value of m5(): "+ch);
		String s = test.m6();
		//String s = PrimitiveReturnType.m6();
		//String s = m6();
		System.out.println("return value of m6(): "+s);
		short sh = test.m7();
		System.out.println("return value of m7(): "+sh);
		byte by = test.m8();
		System.out.println("return value of m8(): "+by);
		boolean b = test.m9();
		System.out.println("return value of m2(): "+b);
		
	}

}
