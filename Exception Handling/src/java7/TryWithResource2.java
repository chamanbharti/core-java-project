package java7;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class TryWithResource2 {
	public static void main(String[] args) {
		//using try-with-resource
		//using multiple resources
		try(FileOutputStream fileOutputStream = new FileOutputStream("text.txt");
				InputStream inputStream = new FileInputStream("text.txt")){
			//------code to write data into file----			
			String msg ="Welcom to java7";
			
			byte byteArray[] = msg.getBytes();//converting string into array
			fileOutputStream.write(byteArray);
			
			System.out.println("------------Data written into file--------------");  
	        System.out.println(msg); 
	        
	        // -----------------------------Code to read data from file---------------------------------------------//  
	        // Creating input stream instance  
	        DataInputStream dataInputStream = new DataInputStream(inputStream);
	        int data = inputStream.available();//returns an estimate of no of bytes that can be read from this input stream.
	        byte[]byteArray2 = new byte[data];
			inputStream.read(byteArray2);
			 String str = new String(byteArray2); // passing byte array into String constructor  
		     System.out.println("------------Data read from file--------------");  
		     System.out.println(str); // display file data  
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
