package com.lang_package_System;

import java.util.Properties;

//Get system properties using System class
public class GetSystemProperties {
	public static void main(String[] args) {
		
		Properties prop = System.getProperties();
		System.out.println("Printing all system properties");
		prop.list(System.out);
	}

}
