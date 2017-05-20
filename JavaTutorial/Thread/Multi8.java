//What if we call run() method directly instead start() method?

class Multi8 extends Thread
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
       Multi8 t1=new Multi8();
       Multi8 t2=new Multi8();

       t1.run();
       t2.run();
   }


}