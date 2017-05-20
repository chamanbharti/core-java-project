package com.root.clone;
//http://javaconceptoftheday.com/difference-between-shallow-copy-vs-deep-copy-in-java/
//this is deep copy
public class Student2 implements Cloneable{
	int rollno;
	String name;
	
	Student2(int rollno,String name){
		this.rollno = rollno;
		this.name = name;
	}
	//overriding clone() method to create a deep copy of an object.
	public Object clone() throws CloneNotSupportedException{
		//return super.clone();
		//Student2 s2 = (Student2)super.clone();
		//return s2;
		return new Student2(rollno, name);
	}
	
	public static void main(String[] args) {
		Student2 s1 = new Student2(101, "Chaman Bharti");
		Student2 s2 = null;
		try{
			//creating a clone object
			s2=(Student2) s1.clone();
			
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		
		System.out.println(s1.rollno+" "+s1.name);
		//changing the name of s1
		s2.name = "Sahil Bharti";
		//This change will not be reflected in original student 'student1'
		System.out.println(s1.rollno+" "+s1.name);
	}

}
