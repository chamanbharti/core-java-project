package com.supar;
class Vehicle3
{  
  Vehicle3()
  {
	  System.out.println("Vehicle is created");
  }
}  
  
class Bike3 extends Vehicle3
{  
  int speed;
      
  Bike3(int speed)
  {  
	  this.speed=speed;
	  System.out.println(speed);    
  }  
  public static void main(String args[])
  {  
   Bike3 b=new Bike3(10);  
   //b.display();  
     
  } 
  
}  