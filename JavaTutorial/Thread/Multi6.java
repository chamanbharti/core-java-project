//Can we start a thread twice

class Multi6 extends Thread
{
  public void run()
  {
   
    System.out.println("Running");
   
  }

   public static void main(String args[])
   {
       Multi6 t1=new Multi6();

       t1.run();//fine, but does not start a separate call stack
       //t1.start();
   }


}