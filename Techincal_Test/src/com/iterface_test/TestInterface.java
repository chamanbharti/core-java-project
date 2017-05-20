package com.iterface_test;
interface A{
	void test();
}
interface B{
	void test();
}
class C implements A,B{
	/*@Override
	public void test2() {
		System.out.println("Test2");
		
	}*/
	//@Override
	/*public void test1() {
		System.out.println("Test1");
		
	}
	@Override
	public void test2() {
		System.out.println("Test2");
		
	}*/
	@Override
	public void test() {
		System.out.println("Test overriding");
		
	}
}
public class TestInterface {
	public static void main(String[] args) {
		A a=new C();
		B b=new C();
		C c=new C();
		//a.test1();
		//a.test2();//The method test2() is undefined for the type A
		//b.test1();//The method test1() is undefined for the type B
		//b.test2();
		//c.test1();
		//c.test2();
		a.test();
		b.test();
		c.test();
	}

}
