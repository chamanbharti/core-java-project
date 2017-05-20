
import java.io.*;
import java.util.*;

class ReadMultiple 
{

   public static void main(String args[])

   throws Exception
   {

    //creating the fileinputstream objects for all the files

    FileInputStream fin1=new FileInputStream("f1.txt");
    FileInputStream fin2=new FileInputStream("f2.txt");
    FileInputStream fin3=new FileInputStream("f3.txt");
    FileInputStream fin4=new FileInputStream("f4.txt");

    
    //creating vector object to all the stream
   
    Vector v=new Vector();

    v.add(fin1);
    v.add(fin2);
    v.add(fin3);
    v.add(fin4);
	
    //creating enumeration object by calling the elements method

    Enumeration e=v.elements();

    //passing the enumeration object in the constructor
   
    SequenceInputStream bin=new SequenceInputStream(e);

    int i=0;
    while((i=bin.read())!=-1)
    {
      System.out.print((char)i);
    }
    
    bin.close();
    fin1.close();
    fin2.close();
   }

}