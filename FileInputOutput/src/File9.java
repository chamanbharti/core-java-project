import java.io.*;
class File9
{
	public static void main(String[] args)
	{
	try
	{
		FileInputStream fin=new FileInputStream("f4.txt");
		BufferedInputStream bin=new BufferedInputStream(fin);

		int i=0;
		while( (i=bin.read() )!=-1 )
		
			System.out.println((char)i);
		
		fin.close();
	}
	catch(Exception e){System.out.println(e);}
}
}