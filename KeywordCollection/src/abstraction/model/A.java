package abstraction.model;

public abstract class A
{
 public abstract void callme();//abstract method
 
 A(){
	 System.out.println("A Constructor");//constructor
 }
  public int data=5;
  
 public void normal()//method
 {
  System.out.println("this is concrete method");
 }  
}