package com.supar;

class Packing
{
  int cost = 50;
}
public class TotalCost extends Packing
{
  int cost = 100;
  public void estimate()
  {
    System.out.println("Cost of articles Rs." + cost);
    System.out.println("Packing expenses Rs." + super.cost);
    System.out.println("Total to pay Rs." + (cost + super.cost));
  }
  public static void main(String args[])
  {
    TotalCost tc1 = new TotalCost();
    tc1.estimate();
  }
}
