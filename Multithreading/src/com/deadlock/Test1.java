package com.deadlock;

public class Test1 {
	
	public static void main(String args[]){  
		final Table obj = new Table();//only one object  
		Thread1 t1=new Thread1(obj);  
		Thread2 t2=new Thread2(obj);  
		t1.start();  
		t2.start();  
		}  

}
