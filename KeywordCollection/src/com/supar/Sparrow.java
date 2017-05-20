package com.supar;

public class Sparrow extends Bird
{
  public void eat()
  { 
    super.eat();
    System.out.println("Eats grains.");
    super.eat();                     // again you can call
  }
  public static void main(String args[])
  {
    Sparrow s1 = new Sparrow();
    s1.eat();
  }
}