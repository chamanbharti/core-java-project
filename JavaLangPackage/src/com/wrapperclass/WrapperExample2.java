package com.wrapperclass;

public class WrapperExample2 {
	public static void main(String[] args) {
		//Converting Integer to int 
		 Integer a=new Integer(30);
		 int i=a;
		 //int i=a.intValue();//converting Integer into int
		 int j=a;//autoboxing,now compiler will write a.intValue internally
		
		System.out.println(a+" "+i+" "+j);
	}

}
