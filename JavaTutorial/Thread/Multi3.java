class Multi3 implements Runnable
{
  public void run()
  {
    System.out.println("Task One..");
  }

  public static void main(String[] args)
  {
    Thread t1=new Thread(new Multi3());//passing annonymous object of Multi3 class
    Thread t2=new Thread(new Multi3());
    t1.start();
    t2.start();
    //t3.start();
  }
 
}