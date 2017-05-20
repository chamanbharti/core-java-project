import java.io.*;   	  
class ExceptionMethodOveride3 extends Parent4{  
	  void msg(){
		  System.out.println("child");
		 }  
	  
	  public static void main(String args[]){  
	   Parent4 p=new ExceptionMethodOveride3();  
	   try{  
	   p.msg();  
	   }catch(Exception e){}  
	  }  
	}  