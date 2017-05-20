package static_nonstatic;
public class StaticMethod5
{
	static int i;
	static String s;
   //static method
	static void display(){
		//its static method
		StaticMethod5 obj=new StaticMethod5();
		 System.out.println("i:"+obj.i);
		  System.out.println("i:"+obj.i);
		
	}
	
	void funcn()
	  {
	      //Static method called in non-static method
	      display();
	  }
  
	public static void main(String args[]) //Its a Static Method
	  {
	      //Static method called in another static method
	      display();
	   }
}
