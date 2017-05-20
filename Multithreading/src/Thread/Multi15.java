package Thread;

public class Multi15 extends Thread
{
	public void run()
	{
		System.out.println("Name: "+Thread.currentThread().getName());
		System.out.println("Daemon: "+Thread.currentThread().isDaemon());
	}
	
	public static void main(String[] args) 
	{
		Multi15 t1=new Multi15();
		Multi15 t2=new Multi15();
		t1.start();
		
		t1.setDaemon(true);//will throw exception here
		
		t2.start();
	}
	
}
