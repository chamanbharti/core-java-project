import java.io.*;

class File11
{
	public static void main(String[] args)
	throws Exception
	{
		
		
			FileReader fr=new FileReader("f5.txt");
			
			int i;
			while( (i=fr.read() )!=-1)
				System.out.print((char)i);
	        fr.close();
		
		

	}
}