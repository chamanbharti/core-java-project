package tutorialspoint.threadlocal;

public class GetThread {
	public static void main(String[] args) {
		
		ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();
		
		threadLocal.set(100);
		//returns the current thread's value
		System.out.println("value = "+threadLocal.get());
		
		threadLocal.set(90);
		//returns the current thread's value
		System.out.println("value = "+threadLocal.get());
		
	}

}
