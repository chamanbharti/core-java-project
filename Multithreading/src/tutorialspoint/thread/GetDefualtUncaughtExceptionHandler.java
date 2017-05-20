package tutorialspoint.thread;
import java.lang.*;

public class GetDefualtUncaughtExceptionHandler implements Runnable {
	
		Thread t;

	   public GetDefualtUncaughtExceptionHandler() {
	   
		   t = new Thread(this);
		   // this will call run() function
		   t.start();
	   }

	   public void run() {
	   
		   // prints thread name
		   System.out.println("Thread = " + t.getName());
		      
		   /* returns the default handler invoked when a thread abruptly
		   terminates due to an uncaught exception. */
		   Thread.UncaughtExceptionHandler handler = Thread
		   .getDefaultUncaughtExceptionHandler();
		   System.out.println(handler);
	   }

	public static void main(String[] args) {
		new GetDefualtUncaughtExceptionHandler();
	}

}
