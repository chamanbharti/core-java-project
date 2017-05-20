import java.io.*;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
public class File19
{
	public static void main(String[] args) 
	throws Exception
	{
		 FileOutputStream fout=new FileOutputStream("mfile.txt");
		 PrintStream pout=new PrintStream(fout);
		 pout.println(1900);
		 pout.println("Hello Java");
		 pout.println("Welcome to Java");
		 pout.close();
		 fout.close();
		
		
	}
}
