import java.io.*;
//import java.util.zip;
import java.util.zip.DeflaterOutputStream;

public class File21
{
	public static void main(String[] args) 
	{

		try
		{
		 FileInputStream fin=new FileInputStream("File20.java");

		 FileOutputStream fout=new FileOutputStream("def.txt");
		 
		 DeflaterOutputStream out=new DeflaterOutputStream(fout);

		 int i;
		  while( (i=fin.read())!=-1)
		  {
			out.write((byte)i);
			out.flush();
		  }

		  fin.close();
		  out.close();
		
		}

	 	catch(Exception e){System.out.println("Rest of code");}
	}

}
