import java.io.*;

public class FileToFile2
{
	public static void main(String[] args) throws IOException
	{
		try
		{
			//reading side
			FileInputStream fistream=new FileInputStream("chaman.txt");//low level stream
			BufferedInputStream bistream=new BufferedInputStream(fistream);//high level stream
			//writing side
			FileOutputStream fostream=new FileOutputStream("bharti.txt");//low level stream
			BufferedOutputStream bostream=new BufferedOutputStream(fostream);//high level stream

			int i;

			while( (i=fistream.read() )!=-1)
			{
			  fostream.write(i);
			  System.out.print( (char) i);
			}
			bostream.close();
			fostream.close();
			bistream.close();
			fistream.close();
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