import java.io.*;

public class FileToFile1
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream fis=new FileInputStream("chaman.txt");
			FileOutputStream fos=new FileOutputStream("bharti.txt");

			int i;

			while( (i=fis.read() )!=-1)
			{
			  fos.write(i);
			  System.out.print( (char) i);
			}
			fos.close();
			fis.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File does not exist:"+e);
		}
		catch(IOException e)
		{
			System.out.println("Some I/O problem:"+e);
		}
	}

}