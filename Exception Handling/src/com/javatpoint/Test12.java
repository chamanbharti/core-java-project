package com.javatpoint;

import java.io.IOException;
//Rule: By default, Checked Exceptions are not forwarded in calling chain (propagated).
//checked exceptions are not propagated
public class Test12 {

	void m() throws IOException
	{
		//int data = 50/0;
		throw new IOException("device error");//checked exception  
	}
	void n() throws IOException
	{
	
		m();
	}
	void p() throws IOException{
			n();
	}
	public static void main(String[] args) throws IOException {
		Test12 t = new Test12();
		t.p();
		System.out.println("normal flow...");
	}
}
