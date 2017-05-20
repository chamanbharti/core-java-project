package java7;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TryWithResource1 {
	public static void main(String[] args) {
		//using try-with-resource
		try(FileOutputStream fileOutputStream = new FileOutputStream("text.txt")){
			
			String msg ="Welcom to java7";
			
			byte byteArray[] = msg.getBytes();//converting string into array
			fileOutputStream.write(byteArray);
			
			System.out.println("Message written to file successfuly!");
			
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
