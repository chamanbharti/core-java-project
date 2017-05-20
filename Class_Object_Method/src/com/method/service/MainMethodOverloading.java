package com.method.service;

public class MainMethodOverloading {
	public static void main(String args[]) {
		System.out.println("main() method invoked");
		main(10);
	}

	private static void main(int i) {
		System.out.println(i);
		
	}

}
