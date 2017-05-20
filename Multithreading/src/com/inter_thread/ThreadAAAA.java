package com.inter_thread;

public class ThreadAAAA {
	public static void main(String[] args) throws InterruptedException {
		ThreadBBBB b = new ThreadBBBB();
		b.start();
		Thread.sleep(10000);
		//b.join();
		//b.wait();//java.lang.IllegalMonitorStateException
		synchronized (b) { 
			System.out.println("Main thread tring to call wait() method");// 3
			b.wait(10000);// it will go into waiting state area
			System.out.println("Main thread got  notification");// 4
			System.out.println(b.total);// 5
		}
	}
			/*  Child thread starts calculation
				Child thread trying to give notification
				Main thread tring to call wait() method
				Main thread got  notification
				5050
			 */
}
