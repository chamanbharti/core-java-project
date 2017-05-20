class Exception0 
{
	public static void main(String args[]) 
       {
		 try{
			 int data=50/0;//may throw exception  
		     //System.out.println("rest of the code..."); 
			 throw new ArithmeticException();
			 //return 4;
		 }
		 catch(ArithmeticException ee){
			 System.out.println("Exception 1");
		 }
		 catch(ArrayIndexOutOfBoundsException ee){
			 System.out.println("Exception 1");
		 }
		 catch(Exception e){
			 System.out.println("Exception 2");
		 }finally{
			 System.out.println("Exception 3");
		 }
       }

}