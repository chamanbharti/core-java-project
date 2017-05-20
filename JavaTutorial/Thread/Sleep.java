//Program of sleep() method

class Multi4 extends Thread
{
  public void run()
  {
   for(int i=0;i<5;i++)
   {
     try
      {
         Thread.sleep(500);
      }

     catch(InterruptedException e)
      {
         System.out.println(e);
      }
   }
  }

   public static void main(String args[])
   {
       Multi4 t1=new Multi4();
       Multi4 t2=new Multi4();

       t1.start();
       t2.start();
   }


}