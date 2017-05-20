package com.javatpoint;

import java.io.IOException;
//Rule: By default, Checked Exceptions are not forwarded in calling chain (propagated).
//checked exceptions are not propagated
public class Test11 {

	void m() throws IOException
	{
		//int data = 50/0;
		throw new IOException("device error");//checked exception  
	}
	void n() throws IOException
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
		Test11 t = new Test11();
		t.p();
		System.out.println("normal flow...");
	}
}
