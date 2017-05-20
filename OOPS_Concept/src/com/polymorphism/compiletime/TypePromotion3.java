package com.polymorphism.compiletime;

public class TypePromotion3 {
	
	 void sum(int a,long b){
		 System.out.println("a method invoked");
		 System.out.println(a+b);
		 }  
	  void sum(long a,int b){
		  System.out.println("b method invoked");
		  }  
	
	public static void main(String[] args) {
		TypePromotion3 obj = new TypePromotion3();
		obj.sum(20, 20);//now ambiguity
	}

}
