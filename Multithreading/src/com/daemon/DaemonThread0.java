package com.daemon;

class MyThread extends Thread{
	
}
public class DaemonThread0{
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon());//false
		//Thread.currentThread().setDaemon(true);//IllegalThreadStateException
		MyThread t = new MyThread();
		System.out.println(t.isDaemon());//false
		t.setDaemon(true);
		System.out.println(t.isDaemon());
	}
}
