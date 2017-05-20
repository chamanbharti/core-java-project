package com.root.clone;
//http://javaconceptoftheday.com/difference-between-shallow-copy-vs-deep-copy-in-java/
//this is shallow copy
public class Student implements Cloneable{
	int rollno;
	String name;
	
	Student(int rollno,String name){
		this.rollno = rollno;
		this.name = name;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(101, "Chaman Bharti");
		Student s2 = null;
		try{
			//creating a clone object
			s2=(Student) s1.clone();
			
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		
		System.out.println(s1.rollno+" "+s1.name);
		//changing the name of s1
		s2.name = "Sahil Bharti";
		//this will be reflected in original s1
		System.out.println(s2.rollno+" "+s2.name);
	}

}
