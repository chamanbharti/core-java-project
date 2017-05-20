package com.object.model;

public class Employee2 implements Cloneable
{
 
	@Override
	public Object clone() throws CloneNotSupportedException {
	return super.clone();
	}
	
	public int id=122655;;
	public String name="Chaman Bharti";
	 
	 
	public void display(){
	 
	System.out.println(id+" "+name);
	 
	}


	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", name=" + name + "]";
	}
	
}