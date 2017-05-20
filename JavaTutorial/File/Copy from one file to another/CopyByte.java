import java.io.*;

class  CopyByte
{
    public static void main(String[] args) 
    {
          FileInputStream fis = null;
          FileOutputStream fos = null;

          try{
               fis = new  FileInputStream("chaman.txt");
               fos = new FileOutputStream("bharti.txt");

               int ch;
               while((ch=fis.read())!=1)
		{
                    fos.write(ch);
                }
             }
		catch(IOException e)
                {
                  System.out.println(e);
                  System.exit(-1);
                }

            finally
		{
                 try
		{
                       fos.close();
                       fis.close();
                 }

                 catch(IOException e){}
            }

    }
}