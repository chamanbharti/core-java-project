import java.io.*;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
public class File17 
{
	public static void main(String[] args) 
	throws Exception
	{
		 Console c=System.console();
		
		System.out.println("Enter password ");
		
		char[] ch=c.readPassword();
		System.out.println("Password is ");
		for(char ch2:ch)
		System.out.print(ch2);
		
		
	}
}
