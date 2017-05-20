package com.lang_package_System;

public class RunFinalizationOfObjects {
	public static void main(String[] args) {
		/*System.out.println("suggesting JVM to run finalize method");
		System.runFinalization();
		System.out.println("Suggested JVM to run finalize method");*/
		System.out.println("Suggesting VM to run garbage collector");
        System.gc();
        System.out.println("Suggested VM to garbage collect objects");
	}
}
