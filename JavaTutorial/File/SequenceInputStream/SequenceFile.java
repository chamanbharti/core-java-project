import java.io.*;
class SequenceFile 
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fin1=new FileInputStream("chaman.txt");
		FileInputStream fin2=new FileInputStream("bharti.txt");

		SequenceInputStream sis=new SequenceInputStream(fin1,fin2);

		int i;
		while( (i=sis.read() )!= -1)
		{
			System.out.print( (char)i);
		}
		//sis.close();
		//fis1.close();
		//fis2.close();
	}

} 

