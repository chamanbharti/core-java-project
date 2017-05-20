package Thread;
//Program of sleep() method

class Multi6 extends Thread
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
	   
       Multi6 t1=new Multi6();
       Multi6 t2=new Multi6();

       t1.start();
       t2.start();
   }


}