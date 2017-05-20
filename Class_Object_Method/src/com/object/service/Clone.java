package com.object.service;

import com.object.model.Employee2;

public class Clone {
	public static void main(String[] args) {
	    Employee2 obj1 = new Employee2();
		System.out.println(obj1);
		
		try {
			Employee2 obj2 = (Employee2) obj1.clone();
			System.out.println(obj2);
		
		} catch (CloneNotSupportedException e) {
		e.printStackTrace();
		}
	}

}
