import java.io.BufferedReader;
import java.io.InputStreamReader;

public class File15 
{
	public static void main(String[] args) 
	throws Exception
	{
		char c;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in) );
		
		System.out.println("Enter characters, 'q' to quit: ");
		
		//read characters
		do
		{
			c=(char) br.read();
			
			System.out.println(c);
		} while(c !='q');
		
		
	}
}
