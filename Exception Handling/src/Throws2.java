 
	public class Throws2{  
	   public static void main(String args[]){  
	    try{  
	    	ThrowsMethod1 m=new ThrowsMethod1();  
	    	m.method();  
	    }catch(Exception e){System.out.println("exception handled");}     
	  
	    System.out.println("normal flow...");  
	  }  
	}  