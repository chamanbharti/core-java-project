// Create multiple threads.
class ThirdThread implements Runnable 
{
		String name; // name of thread
		Thread t;
		ThirdThread(String threadname) 
			{
				name = threadname;
				t = new Thread(this, name);
				System.out.println("New thread: " + t);
				t.start(); // Start the thread
			}
	// This is the entry point for thread.
	public void run() 
	{
			try 
			{
				for(int i = 5; i > 0; i--) 
				{
					System.out.println(name + ": " + i);
					Thread.sleep(1000);
				}
			} 
			catch (InterruptedException e) 
			{
				System.out.println(name + "Interrupted");
			}
	System.out.println(name + " exiting.");
	}
}
class Thread3 
{
		public static void main(String args[]) 
		{
			new ThirdThread("One"); // start threads
			new ThirdThread("Two");
			new ThirdThread("Three");
				try 
				{
					// wait for other threads to end
					Thread.sleep(10000);
				} 
				catch (InterruptedException e) 
				{
					System.out.println("Main thread Interrupted");
				}
			System.out.println("Main thread exiting.");
		}
}