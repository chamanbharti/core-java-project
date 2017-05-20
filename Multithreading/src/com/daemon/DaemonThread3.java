package com.daemon;

public class DaemonThread3 extends Thread{
	@Override
	public void run() {
			System.out.println("Name: "+Thread.currentThread().getName());
			System.out.println("Daemon: "+Thread.currentThread().isDaemon());
	}
	public static void main(String[] args) {
		DaemonThread3 t1=new DaemonThread3();
		DaemonThread3 t2=new DaemonThread3();
		
		t1.start();//starting thread
		
		t1.setDaemon(true);//will throw exception here  
		
		t2.start();
		
	}
}
