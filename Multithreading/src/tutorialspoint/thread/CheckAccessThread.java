package tutorialspoint.thread;

public class CheckAccessThread {
	
	 public static void main(String args[]){

		   new ThreadClass("A");
		   Thread t = Thread.currentThread();

			   try {
			   /* determines if the currently running thread has permission to 
			   modify this thread */
			   t.checkAccess();
			   System.out.println("You have permission to modify");
			      }
	
			   /* if the current thread is not allowed to access this thread, then it 
			   result in throwing a SecurityException. */
			   catch(Exception e) {
			   System.out.println(e);
			   }
		   }

}
class ThreadClass implements Runnable{
	
	Thread t;
	String s;
	ThreadClass(String s){
		this.s = s;
		t = new Thread(this);
		//this will call run()
		t.start();
	}
	@Override
	public void run() {
		System.out.println("This is run()");
		
	}
}
