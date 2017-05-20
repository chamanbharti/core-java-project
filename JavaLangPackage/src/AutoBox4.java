
public class AutoBox4 
{
	public static void main(String[] args) 
	{
		Integer iob=100;
		Double dob=98.6;
		
		dob=dob+iob;
		System.out.println("dob after expression: "+dob);
		
		Integer iOb = 2;
		switch(iOb) 
		{
			case 1: System.out.println("one");
			break;
			case 2: System.out.println("two");
			break;
			default: System.out.println("error");
		}
	}

}
