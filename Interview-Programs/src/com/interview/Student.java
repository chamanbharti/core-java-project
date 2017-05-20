package com.interview;

import java.io.Serializable;

public class Student implements Serializable{
	String name;
	int rollNo;
	
	public Student(String name, int rollNo){
		this.name = name;
		this.rollNo = rollNo;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public boolean equals(Object o){
		if(o == null){
			return false;
		}
		
		if(this == o){
			return true;
		}
		if(getClass()!=o.getClass()){
			return false;
		}
		if(o instanceof Student){
			Student s= (Student)o;
			//return this.getRollNo() == s.rollNo;//by rollno
			//return this.getName() == s.getName();//by name
			return this.getClass() == s.getClass();
		}
		else
			return false;
		//Student s = (Student)o;
		//return this.getRollNo()==s.rollNo;
		
	}
	public int hashCode(){
		final int prime=31;
		int result=0;
		result = result * prime + getRollNo();
		return result;
	}

}
