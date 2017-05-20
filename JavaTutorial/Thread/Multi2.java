class Multi2 extends Thread
{
  public void run()
  {
    System.out.println("Task One..");
  }

  public static void main(String[] args)
  {
    Multi2 t1=new Multi2();
    Multi2 t2=new Multi2();
    Multi2 t3=new Multi2();
    t1.start();
    t2.start();
    t3.start();
  }
 
}