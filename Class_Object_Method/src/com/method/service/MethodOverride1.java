package com.method.service;

import com.method.model.A;

public class MethodOverride1 extends A{
	
	public void msg(){//private,defualt, protected,public
			System.out.println("Hello java");
			}//C.T.Error  
		 public static void main(String args[]){  
			 MethodOverride1 obj=new MethodOverride1();  
			 obj.msg();
			// A a = new A();
		    // a.msg();  
		   }  
		  

}
