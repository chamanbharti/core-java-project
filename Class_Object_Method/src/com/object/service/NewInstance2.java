package com.object.service;

import com.object.model.Employee2;
class Customer{}
public class NewInstance2 {
	public static void main(String[] args) throws Exception {
		//Object obj = Employee2.class.getClassLoader().loadClass("com.object.model.Employee2").newInstance();
		//System.out.println(obj);
		Object obj = Class.forName(args[0]).newInstance();
		System.out.println("Object created for"+obj.getClass().getName());

	}

}
