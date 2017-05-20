import java.io.IOException;

 
	public class Throws3{  
	   public static void main(String args[]) throws IOException{  
	      
	    	ThrowsMethod2 m=new ThrowsMethod2(); 
	    	m.method();
	    	//surround with try/catch
	    	/*try {
				m.method();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} */ 
	  
	    System.out.println("normal flow...");  
	  }  
	}  