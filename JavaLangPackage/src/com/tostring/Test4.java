package com.tostring;

public class Test4 {
		
		int rollno;
		String name;
		String city;
		
		Test4(int rollno,String name,String city){
			this.rollno = rollno;
			this.name = name;
			this.city = city;
	}
	public String toString(){
		return "This is my Test4 Class with "+rollno+" "+name+" "+city;
	}
	public static void main(String[] args) {
		   Test4 s1=new Test4(101,"Raj","lucknow");  
		   Test4 s2=new Test4(102,"Vijay","ghaziabad");  
		     
		   System.out.println(s1);//compiler writes here s1.toString()  
		   System.out.println(s2);//compiler writes here s2.toString()  
		}

}
