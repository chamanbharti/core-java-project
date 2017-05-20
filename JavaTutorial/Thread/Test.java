class Simple extends Thread
{
  public void run()
  {
    System.out.println("Task One..");
  }
}

class Simple2 extends Thread
{
  public void run()
  {
    System.out.println("Task Two..");
  }
}

class Test
{
  public static void main(String[] args)
  {
    Simple1 t1=new Simple1();
    Simple2 t2=new Simple2();
    t1.start();
    t2.start();
  }
 
}