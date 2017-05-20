package com.deadlock;

public class InterruptingThread extends Thread{
	
	public void run(){
		try{
			Thread.sleep(1000);
			System.out.println("task");
		}catch(InterruptedException e){
			throw new RuntimeException("Thread interrupted..."+e);
		}
		System.out.println("thread is running..."); 
	}
	public static void main(String[] args) {
		InterruptingThread t1 = new InterruptingThread();
		t1.start();
		try{
			t1.interrupt();
		}catch(Exception e){
			System.out.println("Exception handled "+e);
		}
	}

}
