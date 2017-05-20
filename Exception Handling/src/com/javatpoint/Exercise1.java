package com.javatpoint;

import java.io.IOException;

public class Exercise1 {
	public static void main(String[] args) {
		
		try{
			int a=5;
			System.out.println(a);
			//System.exit(0);//finally block will not be executed
			throw new IOException();//finally block will be executed
		}catch(Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("finally block");
		}
	}

}
