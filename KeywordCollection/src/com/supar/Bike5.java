package com.supar;
class Vehicle5
{  
  void message()
  {
	  System.out.println("Welcome");
  }
}  
  
class Bike5 extends Vehicle5
{    
	/*void message()
	{
		System.out.println("welcome to java");
	}  */
  void display()
  {
	  message();//will invoke parent class message() method  
	  //super.message();//will invoke parent class message() method  
  }
  public static void main(String args[])
  {  
   Bike5 b=new Bike5();  
   b.display();  
     
  } 
  
}  