import java.io.*;
public class File3 
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fin=new FileInputStream("abc.txt");
		FileOutputStream fout=new FileOutputStream("abcd.txt");
		
		int i=0;
		while((i=fin.read())!=-1)
		{
			fout.write((byte)i);
			
		}
		fin.close();
		
	}
}
