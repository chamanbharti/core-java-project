package com.supar;
class Vehicle4
{  
	
  public Vehicle4() {
		System.out.println("Hello Parent Class");
	}

void message()
  {
	  System.out.println("Welcome");
  }
}  
  
class Bike4 extends Vehicle4
{  
	public Bike4() {
		System.out.println("Hello child Class");
	}
  void message()
  {  
	  System.out.println("Welcome to java");    
  } 
  void display()
  {
	  super.message();
	  message();//will invoke current class message() method 
	  //super.message();//will invoke parent class message() method  
  }
  public static void main(String args[])
  {  
   Bike4 b=new Bike4();  
   b.display();  
     
  } 
  
}  