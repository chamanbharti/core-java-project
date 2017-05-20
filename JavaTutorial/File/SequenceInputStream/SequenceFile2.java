import java.io.*;
class SequenceFile2 
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fin1=new FileInputStream("chaman.txt");
		FileInputStream fin2=new FileInputStream("bharti.txt");

		SequenceInputStream sis=new SequenceInputStream(fin1,fin2);
		FileOutputStream fout=new FileOutputStream("chamanbharti.txt");
		int i;
		while( (i=sis.read() )!= -1)
		{
			System.out.print( (char)i);
			fout.write(i);
		}
		sis.close();
		fout.close();
		fin1.close();
		fin2.close();
	}

} 

