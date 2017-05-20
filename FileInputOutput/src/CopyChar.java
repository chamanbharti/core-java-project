import java.io.*;
public class CopyChar 
{
  public static void main(String[] args)
  {
	  File infile=new File("f1.txt");
	  File outfile=new File("f2.txt");
	  
	  FileReader fr=null;
	  FileWriter fw=null;
	  
	  try
	  {
		  fr=new FileReader(infile);
		  fw=new FileWriter(outfile);
		  
		  int ch;
		  while((ch=fr.read())!=-1)
		  {
			  fw.write(ch);
		  }
		  
	  }
	  catch(IOException e){System.out.println(e);System.exit(-1);}
	  
	  finally 
	  {
		  try
		  {
			  fr.close();
			  fw.close();
		  }
		  catch(IOException e){}
	  }
  }
}
