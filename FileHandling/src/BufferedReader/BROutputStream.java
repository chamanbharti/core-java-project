package BufferedReader;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BROutputStream {
	public static void main(String[] args) throws IOException {
		FileOutputStream fout=new FileOutputStream("F:\\Text.txt");
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		String s="Sachin is my favourite player"
				+ "In this approach, any error, including an error opening the file, is simply handled by"+
"the single catch statement. Because of its compactness, this approach is used by many of"+
"the I/O examples in this book. Be aware, however, that this approach is not appropriate"+
"in cases in which you want to deal separately with a failure to open a file, such as might be"+
"caused if a user mistypes a filename. In such a situation, you might want to prompt for the"+
"correct name, for example, before entering a try block that accesses the file."+
"To write to a file, you can use the write( ) method defined by FileOutputStream. Its"+
"simplest form is shown here:";
		byte b[] = s.getBytes();
		bout.write(b);
		bout.flush();
		fout.close();
		System.out.println("success");
	}

}
