package com.javatpoint;

import java.io.IOException;

public class Test17 {
	
	public static void main(String[] args) throws IOException {//declare exception  
			Test17 t = new Test17();
			Test17 tt = new Test17();
			t=null;
			tt=null;
			System.gc();
		System.out.println("normal flow...");
	}
}
