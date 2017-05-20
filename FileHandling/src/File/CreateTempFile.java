package File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateTempFile {
	public static void main(String[] args) {
		/*File tmp=new File("chaman", "tmp");
		System.out.println("Your temp file is "+tmp.getCanonicalPath());*/
		try{
			 
	    	   //create a temp file
	    	   File temp = File.createTempFile("temp-file-name", ".tmp"); 
	 
	    	   System.out.println("Temp file : " + temp.getAbsolutePath());
	    	   
	    	   //write it
	    	   BufferedWriter bw=new BufferedWriter(new FileWriter(temp));
	    	   bw.write("This is the temporary file content");
	    	   bw.close();
	    	   System.out.println("Done");
	    	 //delete temporary file when the program is exited
	    	  // temp.deleteOnExit();
	 
	           //delete immediate	
	    	   temp.delete();
	    	 //Get tempropary file path
	    	   String absolutePath=temp.getAbsolutePath();
	    	   String tempFilePath=absolutePath.substring(0,absolutePath.lastIndexOf(File.separator));
	    	   System.out.println("Temp file path : "+tempFilePath);
	 
	    	}
		catch(IOException e){
	 
	    	   e.printStackTrace();
	 
	    	}
	}
}
