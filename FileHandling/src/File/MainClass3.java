package File;

import java.io.File;

public class MainClass3 {
	public static void main(String[] args) {
		File myFile=new File("C:\\java.exe");
		long size=myFile.length();
		String display=FileUtils.byteCountToDisplaySize(size);
		
		System.out.println("Name  ="+myFile.getName());
		System.out.println("Size  ="+size);
		System.out.println("Display ="+display);
		

	}
}
