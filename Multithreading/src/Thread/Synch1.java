package Thread;
// This program uses a synchronized block.
class Synch1 
{
	public static void main(String args[]) 
	{
	Callme target = new Callme();
	Caller t1 = new Caller(target, "Hello");
	Caller t2 = new Caller(target, "Synchronized");
	Caller t3 = new Caller(target, "World");
	// wait for threads to end
	try 
	{
		t1.t.join();
		t2.t.join();
		t3.t.join();
		} 
		catch(InterruptedException e) 
		{
			System.out.println("Interrupted");
		}
	}
}

class Callme 
{
	void call(String msg) 
	{
		System.out.print("[" + msg);
		try 
		{
		Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
		System.out.println("Interrupted");
		}
		System.out.println("]");
	}
}

class Caller implements Runnable
{
	String msg;
	Callme target;
	Thread t;
	public Caller(Callme targ, String s) 
	{
		target = targ;
		msg = s;
		t = new Thread(this);
		t.start();
	}
	// synchronize calls to call()
	public void run() 
	{
		synchronized(target) 
		{ // synchronized block
			target.call(msg);
		}
	}
}