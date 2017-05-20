package com.daemon;

public class DaemonThread2 extends Thread{
	@Override
	public void run() {
		if(Thread.currentThread().isDaemon()){//checking for daemon thread
			System.out.println("daemon thread work");
		}
		else{
			System.out.println("user thread work");
		}
	}
	public static void main(String[] args) {
		DaemonThread2 t1=new DaemonThread2();
		DaemonThread2 t2=new DaemonThread2();
		DaemonThread2 t3=new DaemonThread2();
		
		t1.setDaemon(true);//now t1 is daemon thread
		
		t1.start();//starting thread
		t2.start();
		t3.start();
		
	}
}
