import java.io.*;

public class FileToFile3
{
	public static void main(String[] args) throws IOException
	{
		try
		{
			//reading side
			FileInputStream fistream=new FileInputStream("chaman.txt");//low level stream
			DataInputStream distream=new DataInputStream(fistream);//high level stream
			//writing side
			FileOutputStream fostream=new FileOutputStream("bharti.txt");//low level stream
			DataOutputStream dostream=new DataOutputStream(fostream);//high level stream

			int numLines=0;
			String str;
			String lineEnd=System.getProperty("line.separator");

			while( (str=distream.readLine() )!=null)
			{
			  dostream.writeBytes(str);//writes in the destination file,bharti.txt
			  dostream.writeBytes(lineEnd);//gives a new line in bharti.txt
			  System.out.println(str);//prints at DOS prompt
			  numLines++;
			}
			System.out.println("No. of lines:"+numLines);
			dostream.close();
			fostream.close();
			distream.close();
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