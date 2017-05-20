
class Point
{
  int x;
  int y;
  Point()
  {
	  x=2;
	  y=4;
  }
  void Display_Test()
  {
	  System.out.println("The Point is :("+x+","+y+")");
  }
}


public class Point_Test 
{
  public static void main(String para[])
  {
	 Point p1=new Point();
	 Point p2=new Point();
	 p1.Display_Test();
	 p2.Display_Test();
	  
  }
}
