package com.thiss;


public class Demo2 extends Test
{
  public Demo2()                        // III
  {
    super(100);
    System.out.println("From Demo default");
  }
  public Demo2(int x)                   // IV
  {
    this();
    System.out.println(x);
  }
  public static void main(String args[])
  {
	  Demo2 d1 = new Demo2(10);            // IV
  }
}
