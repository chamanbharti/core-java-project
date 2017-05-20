package tutorialspoint.thread;

public class ActiveCountThread {
	
	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		t.setName("Admin Thread");
		//set thread priority to 1
		//t.setPriority(15);//Exception in thread "Admin Thread" java.lang.IllegalArgumentException
		t.setPriority(1);
		//print the current thread
		System.out.println("Thread = "+t);
		//thread count
		int count = Thread.activeCount();
		System.out.println("currently active threads = "+count);
		Thread th[] = new Thread[count];
		//return the no of threads put into the array
		Thread.enumerate(th);
		//prints active threads
		for(int i=0;i<count;i++){
			System.out.println(i+" : "+th[i]);
		}
	}

}
