package Thread;
class Multi1 implements Runnable
{
  public void run()
  {
    System.out.println("Thread is running...");
  }

  public static void main(String[] args)
  {
	System.out.println("Entering Main method");
    Multi1 m1=new Multi1();
    Thread t1=new Thread(m1);
    System.out.println("Starting thread");
    t1.start();
    System.out.println("Exiting Main method");
  }
 
}