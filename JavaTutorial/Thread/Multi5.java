//Can we start a thread twice

class Multi5 extends Thread
{
  public void run()
  {
   
    System.out.println("Running");
   
  }

   public static void main(String args[])
   {
       Multi5 t1=new Multi5();

       t1.start();
       t1.start();
   }


}