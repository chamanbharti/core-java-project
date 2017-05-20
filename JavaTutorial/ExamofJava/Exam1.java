import java.io.*;
public class Exam1 
{
   public static void main(String[] args) 
   {
	 try
	 {
		 FileInputStream fis=new FileInputStream("chaman.txt");
		 int n;
		 while( (n=fis.available() )>0)
		 {
			 byte[] b = null;
			 int result=fis.read(b);
			 if(result==-1)
				 break;
			 System.out.println(b);
		 }
		 fis.close();
	 }
	 catch(IOException e)
	 {
		 System.err.println(e);
	 }
	 System.out.println();
   }
}
