package Thread;

public class Multi14 extends Thread
{
	public void run()
	{
		System.out.println("Name: "+Thread.currentThread().getName());
		System.out.println("Daemon: "+Thread.currentThread().isDaemon());
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		Multi14 t1=new Multi14();
		Multi14 t2=new Multi14();
		
		t1.setDaemon(true);
		
		t1.start();
		t2.join();
		t2.start();
	}
	
}
