package com.root.clone;

public class EqualsDemo {
	public static void main(String[] args) {
		
		//get an integer, which is an object	
		Integer x = new Integer(50);
		
		//get a float, which is an object as well
		Float f = new Float(50f);
		
		//check if these are equal, which is false since they are different class
		System.out.println(""+x.equals(f));
		//check if x is equal with another int 50
		System.out.println(""+x.equals(50));
		String s1="chaman";
		String s2="chaman";
		System.out.println(""+s1.equals(s2));
	}
}
