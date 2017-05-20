package Thread;
//Program of getName(),setName(String) and getId() method

class Multi11 extends Thread
{
	public void run()
	{
		System.out.println("Running");
	}
	
		public static void main(String[] args) throws InterruptedException 
		{
			Multi11 t1=new Multi11();
			Multi11 t2=new Multi11();
			System.out.println("Name of t1: "+t1.getName());
			System.out.println("Name of t2: "+t2.getName());
			System.out.println("Id of t1 "+t1.getId());
			
			t1.start();
			t1.join();
			t2.start();
			
			
			t1.setName("Chaman Bharti");
			System.out.println("After changing the name of t1 "+t1.getName());
		}
}
