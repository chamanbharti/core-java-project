

public class LogicalOperatorDemo 
{

	public LogicalOperatorDemo() 
	{
		boolean x = true;
		boolean y = true;
		System.out.println("x & y : " + (x & y));
		System.out.println("x && y : " + (x && y));
		System.out.println("x | y : " + (x | y));
		System.out.println("x || y: " + (x || y));
		System.out.println("x ^ y : " + (x ^ y));
		System.out.println("!x : " + (!x));
	}
	public static void main(String args[]) 
	{
		new LogicalOperatorDemo();
	}
}