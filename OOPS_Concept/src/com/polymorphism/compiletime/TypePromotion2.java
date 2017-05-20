package com.polymorphism.compiletime;

public class TypePromotion2 {
	
	 void sum(int a,int b){
		 System.out.println("int arg method invoked");
		 System.out.println(a+b);
		 }  
	  void sum(long a,long b){
		  System.out.println("long arg method invoked");
		  }  
	
	public static void main(String[] args) {
		TypePromotion2 obj = new TypePromotion2();
		obj.sum(20, 20);//now int arg sum() method gets invoked  
	}

}
