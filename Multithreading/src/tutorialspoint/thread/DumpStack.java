package tutorialspoint.thread;

public class DumpStack {

	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		t.setName("Admin Thread");
		//set thread priority to 1
		t.setPriority(1);
		
		//print the current thread
		System.out.println("Thread = "+t);
		
		int count = Thread.activeCount();
		System.out.println("currently active thread = "+count);
		
		//prints a stack trace of the current thread to the standard error stream, used for debugging
		Thread.dumpStack();
	}
}