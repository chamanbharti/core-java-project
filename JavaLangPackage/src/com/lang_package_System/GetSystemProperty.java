package com.lang_package_System;
//http://www.java-examples.com/get-java-specification-version-using-system-class
public class GetSystemProperty {
	public static void main(String[] args) {
		
		String strOSName = System.getProperty("os.name");
		System.out.println("Get OS name example..OS is ");
		if(strOSName != null){
			if(strOSName.toLowerCase().indexOf("windows") != -1)
				System.out.println("Windows");
			else
				System.out.println("not windows");
		}
		//Get Java specification version using System class
		String strJavaVersion = System.getProperty("java.specification.version");
		System.out.println("Java Specification is: "+strJavaVersion);
		//Get classpath using System class
		String strClassPath = System.getProperty("java.class.path");
		System.out.println("Classpath is "+strClassPath);
		//Get file separator using System class
		String strFileSeparator = System.getProperty("file.separator");
		System.out.println("File separator is: "+strFileSeparator);
		
		
	}
	

}
