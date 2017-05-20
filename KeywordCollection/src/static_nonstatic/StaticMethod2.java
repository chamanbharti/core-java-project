package static_nonstatic;
class StaticMethod2
{
  static int cube(int x)
  {
    return x*x*x;
  }
 
  public static void main(String[] args)
  {
    int result=StaticMethod2.cube(5);
	  //StaticMethod2 result=new StaticMethod2();
	  
    System.out.println(result);
  }
}