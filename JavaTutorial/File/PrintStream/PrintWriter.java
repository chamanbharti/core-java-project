import java.io.*;
public class PrintWriter 
{ 
public static void main(String args[]) throws IOException 
	{ 
	  PrintWriter pwriter = new PrintWriter(System.out);   
	  pwriter.println(100);	 
	  pwriter.println("Hai"); 
	  pwriter.println(new Double(10.5)); 
	  pwriter.print(false);   
	  pwriter.close(); 
	} 

}