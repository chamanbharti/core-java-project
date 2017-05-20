package File;

import java.io.File;

public class Directory {
	public static void main(String[] args) {
		/*File file=new File("F:\\test2\\");
		file.mkdir();
		*/
		//File file=new File("F:\\chaman\\test\\");
		//file.mkdirs();
			File file = new File("F:\\Directory2");
			if (!file.exists()) {
				if (file.mkdir()) {
					System.out.println("Directory is created!");
				} else {
					System.out.println("Failed to create directory!");
				}
			}
		 
			File files = new File("F:\\Directory2\\Sub2\\Sub-Sub2");
			if (files.exists()) {
				if (files.mkdirs()) {
					System.out.println("Multiple directories are created!");
				} else {
					System.out.println("Failed to create multiple directories!");
				}
			}
		 
		    }
	}
