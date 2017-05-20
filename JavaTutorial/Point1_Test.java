
class Point1
{
  int x;
  int y;
  Point1(int a,int b)
  {
	  x=a;
	  y=b;
  }
  void Display_Test()
  {
	  System.out.println("The Point is :("+x+","+y+")");
  }
}


public class Point1_Test 
{
  public static void main(String para[])
  {
	 Point1 p1=new Point1(2,5);
	 Point1 p2=new Point1(9,7);
	 p1.Display_Test();
	 p2.Display_Test();
	  
  }
}
