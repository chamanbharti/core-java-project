package com.object.service;

import com.object.model.Employee;

/*Method 1
Using new keyword.
This is the most common way to create an object in java. Almost 99% of objects are created in this way.*/
public class NewKeyword {
	public static void main(String[] args) {
		 Employee e=new Employee(1,"Indhu");
		 Employee e1=new Employee(2,"Sindhu");
		     
		 e.display();
		 e1.display();
	}

}
