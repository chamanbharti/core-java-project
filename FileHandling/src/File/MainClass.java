package File;

import java.io.File;
import java.net.URI;

public class MainClass {
	public static void main(String[] args) {
		File myfile=new File("C:"+File.separator+"jdk1.5.0"+File.separator,"File.java");
		//File remoteFile=new File(new URI("file:///index.html"));
		//System.out.println(myfile.getName());
		//System.out.println(myfile.getPath());
		//System.out.println(myfile.isAbsolute());
		//System.out.println(myfile.getParent());
		//System.out.println(myfile.getParentFile());
		//System.out.println(myfile);
		//System.out.println(myfile.exists());
		//System.out.println(myfile.isAbsolute());
		//System.out.println(myfile.isDirectory());
		//System.out.println(myfile.isFile());
		//System.out.println(myfile.isHidden());
		//System.out.println(myfile.canExecute());
		//System.out.println(myfile.canRead());
		//System.out.println(myfile.canWrite());
		System.out.println(myfile.getAbsolutePath());
		System.out.println(myfile.getAbsoluteFile());
		
		
		
		
		
	}
}
