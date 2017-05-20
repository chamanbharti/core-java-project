package Thread;
//Program of sleep() method

class Multi9 extends Thread
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
       Multi9 t1=new Multi9();
       Multi9 t2=new Multi9();

       t1.start();
       t2.start();
       // t1.run();
       //t2.run();
   }


}