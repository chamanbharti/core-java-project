package Thread;
// This program is not synchronized.
class Call
{
	synchronized void call(String msg) 
	{
		System.out.print("[" + msg);
			try 
			{
				Thread.sleep(2000);
			} 
			catch(InterruptedException e) 
			{
				System.out.println("Interrupted");
			}
		System.out.println("]");
	}
}

class teller implements Runnable 
{
	String msg;
	Call target;
	Thread t;
		public teller(Call targ, String s) 
		{
			System.out.println("Inside teller method");
			target = targ;
			msg = s;
			t = new Thread(this);
			t.start();
		}
		public void run() 
		{
			target.call(msg);
		}
}

class Synchro_Test
{
	public static void main(String args[]) 
	{
		Call target = new Call();
		teller ob1 = new teller(target, "Hi");
		teller ob2 = new teller(target, "This");
		teller ob3 = new teller(target, "is");
		teller ob4 = new teller(target, "Synchronization");
		teller ob5 = new teller(target, "Testing");
			// wait for threads to end
			try 
			{
				ob1.t.join();
				ob2.t.join();
				ob3.t.join();
				ob4.t.join();
				ob5.t.join();
			} 
			catch(InterruptedException e) 
			{
				System.out.println("Interrupted");
			}
		}
}