//What if we call run() method directly instead start() method?

class Multi7 extends Thread
{
  public void run()
  {
   
    System.out.println("Running");
   
  }

   public static void main(String args[])
   {
       Multi7 t1=new Multi7();

       t1.run();//fine, but does not start a separate call stack
       //t1.start();
   }


}