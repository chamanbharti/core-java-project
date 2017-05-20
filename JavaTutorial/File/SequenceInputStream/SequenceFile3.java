import java.io.*;
import java.util.*;
class SequenceFile3 
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fin1=new FileInputStream("chaman.txt");
		FileInputStream fin2=new FileInputStream("bharti.txt");
		FileInputStream fin3=new FileInputStream("chamanbharti.txt");
		FileInputStream fin4=new FileInputStream("chamanbharti2.txt");


		Vector v=new Vector();
		v.add(fin1);
		v.add(fin2);
		v.add(fin3);
		v.add(fin4);

		Enumeration e=v.elements();

		SequenceInputStream sis=new SequenceInputStream(e);
		
		int i;
		while( (i=sis.read() )!= -1)
		{
			System.out.print( (char)i);
			//fout.write(i);
		}
		sis.close();
		fin1.close();
		fin2.close();
		fin3.close();
		fin4.close();
	}

} 

