import java.io.*;
import java.net.*;
public class InetAddressTest 
{
	public static void main(String[] args) throws UnknownHostException
	{
        try
        {
		InetAddress Address=InetAddress.getLocalHost();
		System.out.println(Address);
		Address = InetAddress.getByName("facebook.com");
		System.out.println(Address);
		InetAddress SW[] = InetAddress.getAllByName("www.twitter.com");
		for(int i=0;i<SW.length;i++)
		 System.out.println(SW[i]);
        }
        catch(Exception e){System.out.println(e);}
		
	}
}

	