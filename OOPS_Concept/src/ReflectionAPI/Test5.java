package ReflectionAPI;

public class Test5 {
	 public static void main(String args[]){  
		  try{  
		  Class c=Class.forName("Simple");  
		 // Simple s=(Simple)c.newInstance();  
		  //s.message();  
		  Simple s=(Simple)c.newInstance();
		  s.message();
		  
		  }catch(Exception e){System.out.println(e);}  
	}

}
