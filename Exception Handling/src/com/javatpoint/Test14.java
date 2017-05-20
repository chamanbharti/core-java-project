package com.javatpoint;

import java.io.IOException;

class M2{
	void method()throws IOException{
		//throw new IOException("Device Error");// normal flow msg doesn't show
		System.out.println("device operation performed");  
	}
}
public class Test14 {
	
	public static void main(String[] args) throws IOException {//declare exception  
			M2 m = new M2();
			m.method();
		
		System.out.println("normal flow...");
	}
}
