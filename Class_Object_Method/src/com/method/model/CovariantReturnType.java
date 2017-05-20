package com.method.model;

class A1{
	private A1 get(){
		return this;
	}
}
class B extends A1{
	public B get(){
		return this;
	}
	void message(){
		System.out.println("welcome to covariant return type");
	}
}
public class CovariantReturnType {
	public static void main(String[] args) {
		new B().get().message();
	}

}
