package com.javatpoint;

import java.io.IOException;

class M3{
	void method()throws IOException{
		throw new IOException("device operation performed");  
		
	}
}
public class Test15 {
	
	public static void main(String[] args) throws IOException {//declare exception  
			M3 m = new M3();
			
			m.method();
		
		System.out.println("normal flow...");
	}
}
