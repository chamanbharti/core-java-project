package com.daemon;

public class DaemonThread1 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread");
		}
		try{
			Thread.sleep(20000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		DaemonThread1 t=new DaemonThread1();
		t.setDaemon(true);
		t.start();
		System.out.println("End of main thread");
		
	}
}
