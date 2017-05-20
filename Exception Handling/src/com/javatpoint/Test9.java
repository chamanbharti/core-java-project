package com.javatpoint;
//Rule: By default Unchecked Exceptions are forwarded in calling chain (propagated).
public class Test9 {

	void m(){
		int data = 50/0;
	}
	void n(){
		m();
	}
	void p(){
		try{
			n();
		}catch(Exception e){
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		Test9 t = new Test9();
		t.p();
		System.out.println("normal flow...");
	}
}
