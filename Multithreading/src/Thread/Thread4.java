package Thread;

public class Thread4 extends Thread 
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(this.getName()+":"+i);
		}
	}
	
	public static void main(String[] args) 
	{
		Thread4 t1=new Thread4();
		Thread4 t2=new Thread4();
		//setting priority
		t1.setPriority(Thread.MAX_PRIORITY-1);//9
		t2.setPriority(MIN_PRIORITY+1);//3
		//seting name
		t1.setName("High");//for 8 thread
		t2.setName("Less");//for 3 thread
		//retrieve the priority
		System.out.println("Hight Priority is "+t1.getPriority());//prints 9
		System.out.println("Less Priority is "+t2.getPriority());//prints 3
		t1.start();//t2 starts first
		t2.start();
		//we can join method also
		
	}

}
