package com.object.service;

import com.object.model.Employee2;

public class NewInstance {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Object obj = Employee2.class.getClassLoader().loadClass("com.object.model.Employee2").newInstance();
		System.out.println(obj);

	}

}
