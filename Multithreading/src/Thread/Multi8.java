package Thread;
//Can we start a thread twice

class Multi8 extends Thread
{
  public void run()
  {
   
    System.out.println("Running");
   
  }

   public static void main(String args[])
   {
       Multi8 t1=new Multi8();
       //t1.start();
       t1.run();//fine, but does not start a separate call stack
      
   }


}