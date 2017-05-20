
public class AutoBox2 
{
	// Take an Integer parameter and return
	// an int value;
	static int m(Integer v)
	{
		return v;//auto-unbox to int
	}
	public static void main(String[] args) 
	{
		Integer iob=m(100);
		System.out.println(iob);
	}

}
