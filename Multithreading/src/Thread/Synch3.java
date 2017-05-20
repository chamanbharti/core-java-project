package Thread;

public class Synch3 implements Runnable
{
	static int k;
	public void run()
	{
		synchronized(this)
		{
			for(int i=0;i<10000;i++)
			{
				k++;
				k--;
			}
		}
	}
	
	public static void main(String[] args) throws Exception
	{
		Synch3 sd=new Synch3();
		Thread bundle[]=new Thread[100];
		for(int i=0;i<bundle.length;i++)
		{
			bundle[i]=new Thread[sd];
			bundle[i].start();
		}
		System.out.println("Final Results: "+k);
		
	}
}
