class ExceptionMethodOveride5 extends Parent4{  
	  void msg()throws Exception{
		  System.out.println("child");
		 }  
	  
	  public static void main(String args[]){  
	   Parent4 p=new ExceptionMethodOveride5();  
		   try{  
			   p.msg();  
		   }catch(Exception e){}  
	  }  
}  