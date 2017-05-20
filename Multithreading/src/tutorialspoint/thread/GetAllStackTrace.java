package tutorialspoint.thread;

import java.util.Map;

public class GetAllStackTrace implements Runnable {

	public void run(){
		System.out.println("This is run() method");
	}
	
	public static void main(String[] args) {
		
		GetAllStackTrace trace = new GetAllStackTrace();
		Thread t = new Thread(trace);
		
		//this will call run() method
		t.start();
		
		//returns a map of stack traces
		Map m = Thread.getAllStackTraces();
	}
}
