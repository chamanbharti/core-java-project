package File;

import java.io.File;

public class CanonialFile {
	public static void main(String[] argv) throws Exception {

	    File file1 = new File("./filename");
	    File file2 = new File("filename");
	    System.out.println(file1.equals(file2));

	    file1 = file1.getCanonicalFile();
	    file2 = file2.getCanonicalFile();
	    System.out.println(file1.equals(file2));
	  }
}
