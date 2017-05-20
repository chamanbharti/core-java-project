package Thread;
class MyThreadDemo extends Thread
{

	public String MyMessage[]={"Java","is","very","good","Programming","Language"};
        

	MyThreadDemo(String s)
	{

	  super(s);
	}	  

	public void run()
	{
	  String name=getName();
	  
	  for(int i=0;i<MyMessage.length;i++)
	  {
	    Wait();
	    System.out.println(name+":"+MyMessage[i]);
	  }
	}

	void Wait()
	{
	  try
	  {
	    sleep(10);
	  }

	  catch(InterruptedException e)
	  {
	   System.out.println("Thread is Interupted");
	  }
	}
}

class ThreadDemo2
{
  public static void main(String[] args)
  {
	MyThreadDemo td1=new MyThreadDemo("Thread 1:");
	MyThreadDemo td2=new MyThreadDemo("Thread 2:");
	td1.start();
	td2.start();
	boolean isAlive1=true;
	boolean isAlive2=true;
	
	do
	{
		if(isAlive1 && !td1.isAlive())
		{
			isAlive1=false;
			System.out.println("Thread 1 is dead");
		}

		if(isAlive2 && !td2.isAlive())
		{
			isAlive2=false;
			System.out.println("Thread 2 is dead");
		}
	}

	while(isAlive1 || isAlive2);
  }
}