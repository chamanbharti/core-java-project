package tutorialspoint.thread;

public class CurrentThread implements Runnable{
	
	CurrentThread(){
		//main thread
		Thread currentThread = Thread.currentThread();
		//thread created
		Thread t = new Thread(this, "Admin Thread");
		
		System.out.println("current thread = "+currentThread);
		System.out.println("thread created= "+t);
		
		//this will call run()
		t.start();
	}

	@Override
	public void run() {

		System.out.println("This is run()");
		
	}

public static void main(String[] args) {
		
		new CurrentThread();
	}
}
