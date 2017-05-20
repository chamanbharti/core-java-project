
import java.io.*;

class SimpleRead 
{

   public static void main(String args[])
   {
   try
   {


    FileInputStream fin=new FileInputStream ("f1.txt");
    BufferedInputStream bin=new BufferedInputStream(fin);

    
     int i;
      
      while((i=bin.read())!=-1)

      System.out.println((char)i);
      fin.close();
    }
    
     catch(Exception e)
     {
	System.out.println(e);
     }
    
    
   }

}