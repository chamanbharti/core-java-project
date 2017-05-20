package com.javatpoint;

import java.io.IOException;

class M{
	void method()throws IOException{
		throw new IOException("Device Error");
	}
}
public class Test13 {
	
	public static void main(String[] args) {
		try{
			M m = new M();
			m.method();
		}catch(Exception e){
			System.out.println("Exception handled");
		}
		
		System.out.println("normal flow...");
	}

}
