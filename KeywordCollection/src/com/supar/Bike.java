package com.supar;

class Vehicle
{  
  int speed=50;  
}  
  
class Bike extends Vehicle
{  
  int speed=100;  
      
  void display()
  {  
   System.out.println(speed);//will print speed of Bike   
  }  
  public static void main(String args[])
  {  
   Bike b=new Bike();  
   b.display();  
   Vehicle v=new Bike();
      
  } 
  
}  