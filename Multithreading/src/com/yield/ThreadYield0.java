package com.yield;
class MyRunnable implements Runnable{
	
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("child thread-1");
			Thread.yield();
		}
	}
	
}
	
public class ThreadYield0{
	public static void main(String args[]){

		MyRunnable r=new MyRunnable();//thread instantiation
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<10;i++){
			System.out.println("main thread-1");
		}
	}
}