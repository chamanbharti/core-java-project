package com.object.service;

import com.object.model.Student;

public class TestClone {
	public static final void main(String[] args) {
	//static public void main(String[] args) {
	//static public final void main(String[] args) {
		
		try{
			Student s1=new Student(101,"amit");  
		  
			Student s2=(Student)s1.clone();  
		  
			System.out.println(s1.rollno+" "+s1.name);  
			System.out.println(s2.rollno+" "+s2.name);  
		  
		}catch(CloneNotSupportedException c){}  
	}

}
