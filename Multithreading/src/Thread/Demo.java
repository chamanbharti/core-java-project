package Thread;


public class Demo extends Thread
{
	public void run()
	{
						try
						{
							for(int i=0;i<10;i++)
							{
								System.out.println("Welcome to threads: "+i);
							}
						}
						catch(Exception e)
						{
							System.out.println("Sleep time is disturbed, you may get incorrect functionality. " +e);
						}
						System.out.println("Successful");
	}
	public static void main(String[] args)
	{
		Demo d1=new Demo();
		d1.start();
	}
}
