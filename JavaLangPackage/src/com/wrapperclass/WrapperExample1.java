package com.wrapperclass;

public class WrapperExample1 {
	public static void main(String[] args) {
		//Converting int into Integer  
		int a=20;
		//int i=30;
		Integer i=Integer.valueOf(a);//Converting int into Integer  
		Integer j=a;//autoboxing,now compiler will write Integer.valueOf(a) internally
		
		System.out.println(a+" "+i+" "+j);
	}

}
