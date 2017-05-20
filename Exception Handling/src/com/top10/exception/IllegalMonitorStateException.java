package com.top10.exception;

public class IllegalMonitorStateException {
	public static void main(String[] args) throws InterruptedException {
		ThreadA b = new ThreadA();
		b.start();
		//Thread.sleep(0,1);
		//b.join();
		b.wait();
		System.out.println(b.total);
	}

}
