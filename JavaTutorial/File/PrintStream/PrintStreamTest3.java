import java.io.*;
class PrintStreamTest3
{
	public static void main(String[] args) throws Exception
	{
		
		PrintStream pout=new PrintStream(System.out);
		pout.println(100.20);
		pout.println("Hello Java");
		pout.println(true);
		pout.println(new Double(10.5));

		System.out.println("Java is simple but ocean");
		System.out.println("Practice it carefully");
		pout.close();
		
		
		
	}
}