package com.thiss;

class Test
{
  public Test()                        // I
  {
    System.out.println("From Test default");
  }
  public Test(int x)                   // II
  {
    this();
    System.out.println(x);
  }
}