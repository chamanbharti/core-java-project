package com.javatpoint;

import java.io.IOException;

class N{
	
	void m()throws IOException{
		throw new ArithmeticException("Sorry");
	}
	
	void n()throws ArithmeticException{
		throw new ArithmeticException("Sorry");
	}
}
public class Exercise2 {
	public static void main(String[] args) {
		
		N n = new N();
		try {
			n.m();
		} catch (IOException e) {
			e.printStackTrace();
		}
		n.n();
	}

}
