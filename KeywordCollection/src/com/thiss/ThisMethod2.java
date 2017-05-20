package com.thiss;

public class ThisMethod2 {
	
	void m(ThisMethod2 obj){  
		  	System.out.println("method is invoked");  
		  }  
		  void p(){  
			  m(this);  
		  }  
		    
		  public static void main(String args[]){  
			  ThisMethod2 s1 = new ThisMethod2();  
			  s1.p();  
		  }  
	}  