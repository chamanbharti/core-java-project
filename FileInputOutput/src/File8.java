import java.io.*;
class File8
{
	public static void main(String[] args)
	throws Exception
	{
		FileOutputStream fout=new FileOutputStream("f4.txt");
		BufferedOutputStream bout=new BufferedOutputStream(fout);

		String s="Sachin is my favourite player";
		byte b[]=s.getBytes();
		bout.write(b);

		bout.flush();
		bout.close();

		System.out.println("Success");	
	}
}