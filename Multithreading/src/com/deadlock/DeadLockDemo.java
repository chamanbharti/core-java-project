package com.deadlock;

public class DeadLockDemo {
	public static void main(String[] args) {
		
		final String resource1 = "ratan jaiswal";
		final String resource2 = "ratan jaiswal";
		
		//t1 tries to lock resource1 then resource2
		Thread t1 = new Thread(){
			@Override
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread1: locked resource1");
					
					try{
						Thread.sleep(100);
					}catch(Throwable e){
						e.printStackTrace();
					}
					
					synchronized (resource2) {
					 System.out.println("Thread2: locked resource2");	
					}
				}
			}
		};
		
		//t2 tries to lock resource2 then resource1
		Thread t2 = new Thread(){
			public void run() {
				synchronized (resource2) {
					System.out.println("Thread2: locked resource2");
					
					try{
						Thread.sleep(100);
					}catch(Throwable e){
						e.printStackTrace();
					}
					
					synchronized (resource1) {
						System.out.println("Thread2: locked resource1");
					}
				}
			}
		};
		
		t1.start();
		t2.start();
	}

}
