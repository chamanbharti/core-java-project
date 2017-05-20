package File;

import java.io.File;
import java.io.FilenameFilter;

public class FileListFilter implements FilenameFilter {

	private String name;
	private String extension;
	public FileListFilter(String name,String extension){
		this.name=name;
		this.extension=extension;
	}
	public boolean accept(File directory, String filename) {
		boolean fileOk=true;
		
		if(name!=null){
			fileOk=filename.startsWith(name);
		}
		if(extension!=null){
			fileOk=filename.endsWith("."+extension);
		}
		
		return fileOk;
	}

}
