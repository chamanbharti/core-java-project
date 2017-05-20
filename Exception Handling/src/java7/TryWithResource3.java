package java7;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class TryWithResource3 {
	public static void main(String[] args) {
		//using try-with-resource
		//using multiple resources
		try(FileOutputStream fileOutputStream = new FileOutputStream("text.txt")){
			//------code to write data into file----			
			String msg ="Welcom to java7";
			
			byte byteArray[] = msg.getBytes();//converting string into array
			fileOutputStream.write(byteArray);
			
			System.out.println("------------Data written into file--------------");  
	        System.out.println(msg); 
	        
		}catch(Exception e){
			System.out.println(e);
		}finally{
			System.out.println("Finally executes after closing of declared resources.");  
		}
	}

}
