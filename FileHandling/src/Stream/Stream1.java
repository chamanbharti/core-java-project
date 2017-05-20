package Stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class Stream1 {
	public static void main(String[] args) {
		try{
				copy(System.in,System.out);
		}
		
		catch(IOException ex){
			System.err.println(ex);
		}
	}

	private static void copy(InputStream in, PrintStream out) throws IOException{
		
		byte[] buffer = new byte[1024];
		
		while(true){
			int bytesRead = in.read(buffer);
			
			if(bytesRead == -1)
				break;
			out.write(buffer, 0, bytesRead);
		}
		
	}
	
	
	

}