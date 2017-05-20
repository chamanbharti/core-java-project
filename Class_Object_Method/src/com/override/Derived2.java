package com.override;

class Base {
	  private void fun() {
	     System.out.println("Base fun");     
	  }
	}
	   
	class Derived2 extends Base {
		
	  public void fun() {  // overrides the Base's fun()
	     System.out.println("Derived fun");  
	  }
	  public static void main(String[] args) {
		  
	      Base obj = new Derived2();
	      obj.fun();
	  }  
	}