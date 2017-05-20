import java.io.*;	
public class Exception2{
	public static void main(String args[])throws FileNotFoundException{

		
		PrintWriter pw=new PrintWriter("abc.txt");
		System.out.println("Hello");
		System.out.println(10/0);
	}
}	