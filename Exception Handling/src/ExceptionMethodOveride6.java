import java.io.*;   
	class ExceptionMethodOveride6 extends Parent4{  
	  void msg() throws ArithmeticException{
		  System.out.println("child");
		 }  
	  
	  public static void main(String args[]){  
	   Parent4 p=new ExceptionMethodOveride6();  
		   try{  
			   p.msg();  
		   }catch(Exception e){}  
	  }  
}  