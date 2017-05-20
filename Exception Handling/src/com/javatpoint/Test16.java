package com.javatpoint;

import java.io.IOException;

public class Test16 {
	
	public static void main(String[] args) throws IOException {//declare exception  
			try{
				int x=30;
			}catch (Exception e) {
				System.out.println(e);
			}
			finally{
				System.out.println("Finally block is always executed");
			}
		System.out.println("normal flow...");
	}
}
