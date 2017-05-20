package Thread;

class Table2 
{
	//void printTable(int n)//method not synchronized
	//synchronized static void printTable(int n)//method synchronized
	void printTable(int n)//method synchronized
	{
		synchronized(this)
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(n*i);
				try
				{
					Thread.sleep(400);
				}
				catch(Exception e){System.out.println(e);}
			}
		}
		
	}//end of method

}
class MyThread1 extends Thread
{
	Table2 t;
	MyThread1(Table2 t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
	}
}
class MyThread2 extends Thread
{
	Table2 t;
	MyThread2(Table2 t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(100);
	}
}

class WithoutSynchro
{
	public static void main(String[] args) 
	{
		Table2 obj=new Table2();//only one object
		MyThread1 t1=new MyThread1(obj);
		MyThread2 t2=new MyThread2(obj);
		t1.start();
		t2.start();
	}
}
