package com.inter_thread;

public class ThreadAAA {
	public static void main(String[] args) throws InterruptedException {
		ThreadBB b = new ThreadBB();
		b.start();
		Thread.sleep(10000);
		//b.join();
		//b.wait();//java.lang.IllegalMonitorStateException
		synchronized (b) { 
			System.out.println("Main thread tring to call wait() method");// 3
			b.wait();// it will go into waiting state area
			System.out.println("Main thread got  notification");// 
			System.out.println(b.total);// 
		}
	}
			/*  Child thread starts calculation
				Child thread trying to give notification
				Main thread tring to call wait() method
			 */
}
