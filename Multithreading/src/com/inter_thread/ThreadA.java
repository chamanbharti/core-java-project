package com.inter_thread;

public class ThreadA {
	public static void main(String[] args) throws InterruptedException {
		ThreadB b = new ThreadB();
		b.start();
		//Thread.sleep(0,1);
		//b.join();
		b.wait();//java.lang.IllegalMonitorStateException
		System.out.println(b.total);
	}

}
