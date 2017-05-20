package Thread;

public class WithoutSynchro2 
{
	public static void main(String[] args) throws Exception
	{
		 final Table3 obj=new Table3();//only one object
		Thread1 t1=new Thread1()
		{
			public void run()
			{
				obj.printTable(5);
			}
		};
		Thread2 t2=new Thread2()
		{
			public void run()
			{
				obj.printTable(100);
			}
		};
	}
	
}
class Table3 
{
	//void printTable(int n)//method not synchronized
	//synchronized void printTable(int n)//synchronized method 
	void printTable(int n)//synchronized method 
	{
		synchronized(this)// synchronized block
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
		
	}

}