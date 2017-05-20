package static_nonstatic;

public class StaticClass1 {
	
	static int data=30;  
	
	  static class Inner{  
	   void msg(){System.out.println("data is "+data);}  
	  }  
	  
	  public static void main(String args[]){  
		  StaticClass1.Inner obj=new StaticClass1.Inner();  
		  obj.msg();  
	  }  

}
