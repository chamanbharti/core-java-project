import java.io.IOException;

 
	public class Throws4{  
	   public static void main(String args[]) throws IOException{  //declare exception 
	      
	    	ThrowsMethod3 m=new ThrowsMethod3(); 
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