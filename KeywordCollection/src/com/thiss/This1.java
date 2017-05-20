package com.thiss;

public class This1
{
  int id;
  String name;

  This1(int i,String n)
  {
	  id=i;
	  name=n;
  }
  /* 
    This1(int id,String name)
  {
	  id=id;
	  name=name;
  }
   */
  void Display()
  {
	  System.out.println(id+" "+name);
  }
  
  public static void main(String[] args)
  {
  	  This1 s1=new This1(11,"Chaman");
  	This1 s2=new This1(12,"Bharti");
  	  s1.Display();
  	  s2.Display();
  }
}
