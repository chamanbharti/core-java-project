package com.lang_package_Runtime;

public class GetAvailableProcessor {
	public static void main(String[] args) {
		Runtime rt= Runtime.getRuntime();
		int noOfProcessor = rt.availableProcessors();
		System.out.println(noOfProcessor+" processor available to JVM");
		long freeMemory = rt.freeMemory();
		System.out.println(freeMemory+" bytes free in JVM");
		long maxMemory = rt.maxMemory();
		System.out.println(maxMemory+" bytes max");
		long totalMemory = rt.totalMemory();
		System.out.println(totalMemory+" total memory in bytes");
		rt.gc();
		System.out.println("JVM has made best effort to garbage collect");
		rt.runFinalization();
		System.out.println("About to halt the current jvm");
		rt.halt(1);
		 /*
         * THIS METHOD NEVER RETURNS NORMALLY.
         * This statement will never executed, as the JVM is
         * terminated!
         */
		System.out.println("JVM Terminated");
	}

}
