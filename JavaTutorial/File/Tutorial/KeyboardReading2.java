import java.io.*;
public class KeyboardReading2
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		int marks[]=new int[3];
	
		for(int i=0;i<marks.length;i++)
		{
		  System.out.println("Enter a whole number:");
		  String str1=br.readLine();
		  int x=Integer.parseInt(str1);

		  marks[i]=x;
		}
		
		 int total=0;//printing the array elements
		{
		    System.out.print("The elements are: ");
		    for(int i=0;i<marks.length;i++)
		    {
			System.out.print(marks[i]+"\t");
			total=total+marks[i];
		    }
		}
		
		System.out.println("\nThe average is :"+(total/marks.length));
	}
}