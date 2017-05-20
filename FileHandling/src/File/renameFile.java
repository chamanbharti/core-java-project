package File;

import java.io.File;

public class renameFile {
	public static void main(String[] args) {
		 File file = new File("C:\\text.txt");
		 //file.renameTo(new File("C:\\text.txt.bak"));
		 file.setReadOnly();
		 System.out.println(file.canRead());
	}
}
