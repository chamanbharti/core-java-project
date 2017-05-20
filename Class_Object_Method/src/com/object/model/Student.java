package com.object.model;

public class Student implements Cloneable{
	public int rollno;  
	public String name;  
	  
	public Student(int rollno,String name){  
	this.rollno=rollno;  
	this.name=name;  
	}  
	  
	public Object clone()throws CloneNotSupportedException{  
	return super.clone();  
	}  

}
