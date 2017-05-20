package File;

import java.io.File;
import java.io.IOException;

public class CreateFile 
{
    public static void main( String[] args ) throws IOException
    {	/*
    	try {
 
	      File file = new File("F:\\newfile.txt");
 
	      if (file.createNewFile()){
	        System.out.println("File is created!");
	      }else{
	        System.out.println("File already exists.");
	      }
 
    	} catch (IOException e) {
	      e.printStackTrace();
	}*/
    	 File file = new File("F:\\saharkochodunga.txt");
    	 file.createNewFile();
    }
}
