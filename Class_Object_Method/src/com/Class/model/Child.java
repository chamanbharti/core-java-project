package com.Class.model;

public class Child extends Parent{
	int c=30;
	int d=40;
	public void displayChild(){
		System.out.println(c+" "+d);
	}
	public static void main(String[] args) {
		Parent p=new Parent();
		p.displayParent();
		//p.displayChild();
		
		Child c=new Child();
		c.displayChild();
		c.displayParent();
		
		Parent pc=new Child();
		pc.displayParent();
		//pc.displayChild();
		
	}
}
