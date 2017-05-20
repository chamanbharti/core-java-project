package Thread;

public class Multi13 extends Thread
{
	public void run()
	{
		System.out.println("Running thread name is: "+Thread.currentThread().getName());
		System.out.println("Running thread priority is: "+Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) 
	{
		Multi13 t1=new Multi13();
		Multi13 t2=new Multi13();
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
	}
	
}
