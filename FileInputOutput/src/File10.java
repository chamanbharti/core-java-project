import java.io.*;

class File10
{
	public static void main(String[] args)
	
	{
		try
		{
			FileWriter fw=new FileWriter("f5.txt");
			fw.write("My name is chaman");
			fw.flush();
			fw.close();
		}
		catch(Exception e){System.out.println(e);}

		System.out.println("Success");	
	}
}