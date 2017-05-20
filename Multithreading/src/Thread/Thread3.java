package Thread;
public class Thread3 extends Thread
{
	public static void main(String[] args) 
	{
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		t1.start();
		t2.start();
		
		try
		{
			t1.join(500);
			//t2.join(500);
		}
		catch(InterruptedException e)
		   {
			   e.printStackTrace();
		   }
		
	}
}