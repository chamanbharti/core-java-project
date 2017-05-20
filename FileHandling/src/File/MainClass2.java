package File;

import java.io.File;

public class MainClass2 {
	public static void main(String[] args) {
		File myFile=new File("C:" +File.separator);
		/*for(File s:myFile.listFiles()){
			System.out.println(s);
		}
		for(String s:myFile.list()){
			System.out.println(s);
		}
		*/
		System.out.println(myFile.length());
		

	}
}
