package com.override;

class Base {
	  public void fun() {
	     System.out.println("Base fun");     
	  }
	}
	   
	class Derived extends Base {
		
	  public void fun() {  // overrides the Base's fun()
	     System.out.println("Derived fun");  
	  }
	  public static void main(String[] args) {
		  
	      Base obj = new Derived();
	      obj.fun();
	  }  
	}