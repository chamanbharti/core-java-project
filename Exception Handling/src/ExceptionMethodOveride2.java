import java.io.*;  
 
	public class ExceptionMethodOveride2 extends Parent2{  
	  void msg()throws ArithmeticException{  
	    System.out.println("TestExceptionChild");  
	  }  
	  public static void main(String args[]){  
	   Parent2 p=new ExceptionMethodOveride2(); 
	   p.msg(); 
	   ExceptionMethodOveride2 p1=new ExceptionMethodOveride2();
	   p1.msg();
	   Parent2 p2=new Parent2();
	   p2.msg();  
	  }  
	}  