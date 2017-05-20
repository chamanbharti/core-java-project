package com.tostring;

import java.util.ArrayList;

public class Test5 {
		
	/*public String toString(){
		return null;
	}*/
	public static void main(String[] args) {

		String s = new String("Chaman");//String class
		System.out.println(s);//chaman
		
		Integer I = new Integer(10);//Wrapper class
		System.out.println(I);//10
		
		ArrayList<String> l = new ArrayList<>();//Collection Class
		l.add("A");
		l.add("B");
		System.out.println(l);//[A,B]
		
		Test5 t = new Test5();//user defined class
		System.out.println(t);//com.tostring_1.Test5@15db9742
		}

}
