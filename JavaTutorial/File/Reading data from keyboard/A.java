import java.io.*;
class A
{
	public static void main(String[] args)
	{
		Console c=System.console();
		System.out.println("Enter ur name");
		String n=c.readLine();
		System.out.println("Welcome "+n);
		System.out.println("Enter ur age");
		String o=c.nextInt();
		System.out.println("Welcome "+o);
	}
}