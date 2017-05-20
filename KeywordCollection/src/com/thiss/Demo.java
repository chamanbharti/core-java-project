package com.thiss;

class Hello
{
  public Hello()
  {
    System.out.println("From Hello constructor");
  }
} 
class Test extends Hello
{
  public Test()
  {
    System.out.println("From Test constructor");
  }
} 
public class Demo extends Test
{
  public Demo()
  {
    System.out.println("From Demo constructor");
  }
  public static void main(String args[])
  {
    Demo d1 = new Demo();
  }
}