package Thread;

public class Multi13B extends Thread 
{
	@Override
	public void run() 
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(this.getName()+":"+i);
		}
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		Multi13B hl1=new Multi13B();
		Multi13B hl2=new Multi13B();
		//setting priority
		hl1.setPriority(Thread.MAX_PRIORITY-1);//9
		hl2.setPriority(Thread.MIN_PRIORITY+1);//3
		//setting the name
		hl1.setName("High");//for 8 thread
		hl2.setName("Less");//for 3 thread
		//to receive priority
		System.out.println("High Priority is "+hl1.getPriority());//prints 9
		System.out.println("Less Priority is "+hl2.getPriority());//prints 3
		
		hl1.start();
		//hl2.join();
		hl2.start();
		//you can use join() method also
	}

}
