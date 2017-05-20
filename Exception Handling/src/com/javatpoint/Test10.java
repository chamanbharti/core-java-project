package com.javatpoint;

import java.io.IOException;
//Rule: By default, Checked Exceptions are not forwarded in calling chain (propagated).
//checked exceptions are not propagated
public class Test10 {

	void m() //throws IOException
	{
		//int data = 50/0;
		throw new IOException();
	}
	void n() //throws IOException
	{
	
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
		Test10 t = new Test10();
		t.p();
		System.out.println("normal flow...");
	}
}
