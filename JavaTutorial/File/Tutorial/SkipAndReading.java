import java.io.*;
public class SkipAndReading
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis=new FileInputStream("chaman.txt");
		System.out.println("File size using available() method:"+fis.available());//prints 123
		
		fis.skip(30);
		
		System.out.println("NO. of bytes remaining to read after skipping:"+fis.available());//prints 93 (123-30)

		System.out.println("\n\tFile contents from skipping position");

		int temp;
		while( (temp=fis.read() )!=-1)
		{
		    System.out.print((char)temp);
		}
		fis.close();

		//another way of finding the file size
		File f1=new File("chaman.txt");
		System.out.println("\n\tFile size using length() method:"+f1.length());//prints 123
	}
}