package Thread;

public class Multi12 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) 
	{
		Multi12 t1=new Multi12();
		Multi12 t2=new Multi12();
		Multi12 t3=new Multi12();
		
		t1.start();
		t2.start();
		//t3.start();
	}
	
}
