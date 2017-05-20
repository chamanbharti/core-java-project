package Thread;

public class Thread0 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("Welcome to threads: "+i);
				Thread.sleep(500);
			}
		}
		
		catch(InterruptedException e)
		{
			System.err.println("Sleep time is distrubted, you may get incorrect functionality"+e);
		}
		
		System.out.println("Successful");
	}
	
	public static void main(String[] args)
	{
		Thread0 d1=new Thread0();
		d1.start();
	}
}
