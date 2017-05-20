package com.inter_thread;

public class ThreadAA {
	public static void main(String[] args) throws InterruptedException {
		ThreadBB b = new ThreadBB();
		b.start();
		//Thread.sleep(0,1);
		//b.join();
		//b.wait();//java.lang.IllegalMonitorStateException
		synchronized (b) { 
			System.out.println("Main thread tring to call wait() method");// 1
			b.wait();// it will go into waiting state area
			System.out.println("Main thread got  notification");// 4
			System.out.println(b.total);// 4
		}
	}

}
