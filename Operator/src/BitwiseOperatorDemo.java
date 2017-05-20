public class BitwiseOperatorDemo 
{
  public BitwiseOperatorDemo()
  {
    int a = 2;//0010
    int b= 4;//0100
    //int y = 0010101; //21
   // int z; System.out.println("x & y : " + (x & y));
    System.out.println("Value of number before "+a);
    System.out.println("Value of number before "+ ~a);
    System.out.println("Result of a&b is "+(a&b));
    System.out.println("Result of a&b is "+(a|b));
    System.out.println("Result of a&b is "+(a^b));
    //System.out.println("x | y : " + (x | y));
    //System.out.println("x ^ y : " + (x ^ y));
    //System.out.println("~x : " + (~x));
    //System.out.println("x << y : " + (x << y));
    //System.out.println("x >> y : " + (x >> y));
    //System.out.println("x >>> y : " + (x >>> y));
    //There is no unsigned left shift operator
    } 

  public static void main(String args[])
  {
     new BitwiseOperatorDemo(); 
     
   }
}