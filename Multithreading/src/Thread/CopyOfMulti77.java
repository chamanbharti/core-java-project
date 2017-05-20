package Thread;
//Program of sleep() method

class CopyOfMulti77 extends Thread
{
  public void run()
  {
   for(int i=1;i<=5;i++)
   {
     try
      {
         Thread.sleep(500);
      }

     catch(InterruptedException e)
      {
         System.out.println(e);
      }
	   System.out.println(i); 
   }
  }

   public static void main(String args[])
   {
       CopyOfMulti77 t1=new CopyOfMulti77();
       CopyOfMulti77 t2=new CopyOfMulti77();

       t1.start();
       t2.start();
       //t1.run();
       //t2.run();
   }


}