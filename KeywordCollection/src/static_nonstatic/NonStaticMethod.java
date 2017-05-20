package static_nonstatic;

public class NonStaticMethod {
	 public void display()
	   {
	       System.out.println("I'm non-static method");
	   }
	   public static void main(String agrs[])
	   {
		   NonStaticMethod obj=new NonStaticMethod();
	       obj.display();
	   }
}
