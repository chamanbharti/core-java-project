package Thread;

class Multi3 implements Runnable
{
  public void run()
  {
    System.out.println("Task One..");
  }

  public static void main(String[] args)
  {
    //Thread t1=new Thread(new Multi3());//passing annonymous object of Multi3 class
    //Thread t2=new Thread(new Multi3());
	  Multi3 s1=new Multi3();
	  Thread t1=new Thread(s1);
	  Thread t2=new Thread(s1);
	  Thread t3=new Thread(s1);
    t1.start();
    t2.start();
    t3.start();
  }
 
}