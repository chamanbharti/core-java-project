package path;

import java.io.File;
import java.io.IOException;

public class Path1 {
	public static void main(String[] args) throws IOException {
		/*String filePath = File.separator + "Java" + File.separator + "IO";
		File file=new File(filePath);
		System.out.println(file.getPath());*/
		
		/*File absolute = new File("/public/html/javafaq/index.html");
		File relative = new File("html/javafaq/index.html");
		
		System.out.println("absolute: ");
		System.out.println(absolute.getName());
		System.out.println(absolute.getPath());
		
		System.out.println();
		
		System.out.println("relative: ");
		System.out.println(relative.getName());
		System.out.println(relative.getPath());*/
		/*
		File myDir = new File("F:/jdk1.5.0/src/java/io");
		System.out.println(myDir);
		*/
		/*
		File myDir = new File("F:\\chaman\\src\\java\\io");
		System.out.println(myDir);
		*/
		//File file = new File("dir" + File.separatorChar + "filename.txt");
		/*File file = new File(".." + File.separatorChar + "filename.txt");
		file = file.getAbsoluteFile();
		System.out.println(file);*/
		File file1 = new File("./filename");
	    File file2 = new File("filename");
	    System.out.println(file1.equals(file2));

	    file1 = file1.getCanonicalFile();
	    file2 = file2.getCanonicalFile();
	    System.out.println(file1.equals(file2));
	}
}
