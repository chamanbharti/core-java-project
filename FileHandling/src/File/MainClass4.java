package File;

import java.io.File;
import java.util.Date;

public class MainClass4 {
 public static void main(String[] args) {
	 // Create an object that is a directory
	    File myDir = new File("C:/Java_Dev");
	    System.out.println(new Date(myDir.lastModified()));
}
}
