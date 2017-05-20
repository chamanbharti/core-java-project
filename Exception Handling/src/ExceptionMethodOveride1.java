import java.io.*;  
	class ExceptionMethodOveride1 extends Parent{  
	  void msg()throws IOException{  
	    System.out.println("TestExceptionChild");  
	  }  
	  public static void main(String args[]){  
	   Parent p=new ExceptionMethodOveride1();  
	   p.msg();  
	  }  
	}  