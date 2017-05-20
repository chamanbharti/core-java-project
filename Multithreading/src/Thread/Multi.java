package Thread;
class Multi extends Thread
{
  public void run()
  {
    System.out.println("Thread is running...");
  }

  public static void main(String[] args)throws Exception
  {
	  System.out.println("Entring Main method");
	  Multi t1=new Multi();
	  System.out.println("Starting thread");
	  t1.start();
	  t1.join();
	  System.out.println("Exiting Main method");
	  
	  
  }
 
}