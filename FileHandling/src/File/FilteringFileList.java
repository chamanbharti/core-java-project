package File;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Date;

public class FilteringFileList {
	public static void main(String[] args) {
		File myDir=new File("C:/");
		FilenameFilter select=new FileListFilter("F", "txt");
		File[] contents=myDir.listFiles(select);
		
		for(File file:contents){
			System.out.println(file+" is a "+(file.isDirectory() ? "directory" : "file") + "last modified on \n "+new Date(file.lastModified()));
		}
	}
}
