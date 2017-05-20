class ExceptionMethodOveride4 extends Parent4{  
	  void msg()throws ArithmeticException{
		  System.out.println("child");
		 }  
	  
	  public static void main(String args[]){  
	   Parent4 p=new ExceptionMethodOveride4();  
		   try{  
			   p.msg();  
		   }catch(Exception e){}  
	  }  
}  