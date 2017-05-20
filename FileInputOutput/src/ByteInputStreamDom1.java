import java.io.ByteArrayInputStream;
import java.io.IOException;


public class ByteInputStreamDom1 
{
	public static void main(String[] args) throws IOException
	{
		
		byte vowels[]={'a','e','i','o','u'};
		ByteArrayInputStream bais=new ByteArrayInputStream(vowels);
		int temp;
		
		while( (temp=bais.read())!= -1)
		{
			char ch=(char)temp;
			System.out.println("Vowel: "+ch+" and its ASCII Value: "+temp);
		}
		System.out.println("\n\nTo read again after calling reset() method");
		bais.reset();//places the file pointer at the beginning of the array
		while( (temp=bais.read())!= -1)
		{
			char ch=(char)temp;
			System.out.println("Vowel: "+ch+" and its ASCII Value: "+temp);
		}
		bais.close();
	}

}
