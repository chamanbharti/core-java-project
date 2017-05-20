package com.lang_package_System;

public class GetSystemTime {
	public static void main(String[] args) {
		
		long InSystemTime = System.currentTimeMillis();
		System.out.println("Milliseconds since midnight, January 1, 1970 UTC : "+InSystemTime);
	}
}
