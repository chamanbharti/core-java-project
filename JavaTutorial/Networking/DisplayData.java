//myserver.java

import java.io.*;
import java.net.*;

public class DisplayData
{

	public static void main(String[] args)
	{
		try
		{
			URL url=new URL("http://www.javatpoint.com/chamanbharti/");
			
			URLConnection urlcon=url.openConnection();
			
			InputStream stream=urlcon.getInputStream();
			
			int i;
			while((i=stream.read())!=-1)
			{
				System.out.println((char)i);
			}

		}

		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}