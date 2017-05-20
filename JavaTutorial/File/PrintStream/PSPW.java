import java.io.*;
public class PSPW 
{ 
public static void main(String args[]) throws IOException 
	{ 
	  FileOutputStream fostream=new FileOutputStream("chaman.txt");
	  BufferedOutputStream bostream =new BufferedOutputStream(fostream);
	  PrintStream ps = new PrintStream(bostream);  
	
	  int x=10;
	  double y=10.5;
	  boolean b=true;
	  String str="hello";
 
	  ps.println(x);	 
	  ps.println(y); 
	  ps.println(b); 
	  ps.print(str);   
	  ps.close(); 

	  //another code
	  //PrintStream ps=new PrintStream(System.out);
	  ps.println(x);
	  ps.println(y);
	  ps.println(b);
	  ps.println(str);
	} 

}