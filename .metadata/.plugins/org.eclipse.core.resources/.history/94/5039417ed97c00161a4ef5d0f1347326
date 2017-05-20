package com.object.service;

import com.object.model.Employee;
import com.object.model.Employee2;

/*
 * 
 * Using New Instance (Reflection)
Have you ever tried to connect to any DB using JDBC driver in Java, 
If your answer is yes then you must have seen “Class.forName“. 
We can also use it to create the object of a class. 
Class.forName actually loads the class in Java but doesn’t create any Object. 
To Create an Object of the Class you have to use newInstance method of Class class.
 */
public class ClassforName {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Employee2 object2 = (Employee2)Class.forName("com.object.model.Employee2").newInstance();
		object2.display();
		
	}

}
