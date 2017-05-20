package com.method.service;

public class MethodOverload1 {
	//final void sum(int a,int b){
    static void sum(int a,int b){
		System.out.println(a+b);
		}  
	  public void sum(int a,int b,int c){
		  System.out.println(a+b+c);
		  }  
	  
	  public static void main(String args[]){  
	  MethodOverload1 obj=new MethodOverload1();  
	  obj.sum(10,10,10);  
	  obj.sum(20,20);  
	 // sum(20,20);  
	  
	  }  

}
