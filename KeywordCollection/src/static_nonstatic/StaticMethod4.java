package static_nonstatic;
public class StaticMethod4 
{
	static int i;
	static String s;
   //int a=40;//non static
  
  public static void main(String[] args)//its a static method
  {
	  StaticMethod4 obj=new StaticMethod4();
	  //non static variables accesssed using object obj
	  System.out.println("i:"+obj.i);
	  System.out.println("s:"+obj.s);
  }
}
