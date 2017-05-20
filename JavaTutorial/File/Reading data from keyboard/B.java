import java.io.*;
class B
{
	public static void main(String[] args)
	{
		Console c=System.console();
		
		System.out.println("Enter ur age");
		int a=c.nextInt();
		System.out.println("Welcome "+a);
	}
}