import java.io.ByteArrayOutputStream;
import java.io.IOException;


public class ByteOutputStreamDemo1 
{
	public static void main(String[] args) throws IOException 
	{
		byte alphabets[]={'A','B','C','D','E','F','G'};
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		baos.write(alphabets);
		System.out.println("Getting all the bytes from the stream: "+baos.toString());
		baos.close();
		//to write a part of byte array
		ByteArrayOutputStream baos2=new ByteArrayOutputStream();
		baos2.write(alphabets,2,4);
		System.out.println("Getting 4 bytes starting from 2: "+baos2.toString());
		baos2.close();
		
	}

}
