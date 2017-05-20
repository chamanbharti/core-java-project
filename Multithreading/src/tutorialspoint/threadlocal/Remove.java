package tutorialspoint.threadlocal;

public class Remove {
	
	public static void main(String[] args) {
		
		ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();
		
		//sets the current thread's copy of this  thread-local variable to the specified value.
		threadLocal.set(50);
		//returns the current thread's value of this thread-local
		System.out.println("Value = "+threadLocal.get());
		
		//removes the current thread's value
		threadLocal.remove();
		//returns the current thread's value of this thread-local
		System.out.println("Value = "+threadLocal.get());
	}

}
