package com.thiss;

public class ThisConstructor 
{
  int id;
  String name;
  ThisConstructor()
  {
	  System.out.println("Default Constructor is invoked"); 
  }
 
  ThisConstructor(int id,String name)
  {
	  //this();//this is used to invoked current class constructor
	  this.id=id;
	  this.name=name;
  }
  void Display()
  {
	  System.out.println(id+" "+name);
  }
  public static void main(String[] args)
  {
	  ThisConstructor e1=new ThisConstructor(11,"Chaman");
	  ThisConstructor e2=new ThisConstructor(12,"Bharti");
	  e1.Display();
	  e2.Display();
  }
}

