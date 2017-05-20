//import java.io.FileOutputStream;
import java.io.*;
class File1
{
  public static void main(String[] args)
  {
    try
    {
    FileOutputStream fout=new FileOutputStream("abc.txt");
    String s="Chaman Bharti is my name";

    byte b[]=s.getBytes();
    fout.write(b);

    fout.close();

    System.out.println("Success...");

    }
     catch(Exception e)
      {
        System.out.println(e); 
      }
  }
 
}
