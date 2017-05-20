package Thread;

	public class Thread2 extends Thread
	{
		public void run()
		{
			for(int i=9;i>=0;i--)
			  System.out.println("Test2: "+i);
			 try
			 {
				 Thread.sleep(1000);
			 }
			 catch(InterruptedException e)
			   {
				   e.printStackTrace();
			   }
		}
	}

	