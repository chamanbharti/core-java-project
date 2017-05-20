package tutorialspoint.threadlocal;

public class Set {
	
	public static void main(String[] args) {
		
		ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();
		
		//sets the current thread's copy of this  thread-local variable to the specified value.
		threadLocal.set(100);
		//returns the current thread's value of this thread-local
		System.out.println("Value = "+threadLocal.get());
		
		//sets the current thread's value
		threadLocal.set(0);
		//returns the current thread's value of this thread-local
		System.out.println("Value = "+threadLocal.get());
	}

}
