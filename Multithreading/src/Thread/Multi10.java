package Thread;
//Program of sleep() method

class Multi10 extends Thread
{
  public void run()
  {
   for(int i=1;i<=5;i++)
   {
     try
      {
         Thread.sleep(500);
      }

     catch(Exception e)
      {
         System.out.println(e);
      }
	   System.out.println(i); 
   }
  }

   public static void main(String args[])
   {
       Multi10 t1=new Multi10();
       Multi10 t2=new Multi10();
       Multi10 t3=new Multi10();
       t1.start();
       
       try
       {
    	  // t1.join();
    	   t1.join(500);
       }
       catch(Exception e)
       {
    	   System.out.println(e);
       }
       
      t2.start();
      t3.start();
   }


}
