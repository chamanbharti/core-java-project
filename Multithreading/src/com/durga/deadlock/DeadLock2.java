package com.durga.deadlock;

class MyThread2 extends Thread{
	int total=0;
	public void run(){
		synchronized (this) {
			System.out.println("Child thread starts calculation");//2
			
			for(int i=1;i<=100;i++){
				total = total+i;
			}
			
			System.out.println("Child thread got notification call");//3
			this.notify();
		}
	}
}
public class DeadLock2 {
	public static void main(String[] args) throws InterruptedException {
		
		MyThread2 t1 = new MyThread2();
		t1.start();
		
		synchronized (t1) {
			System.out.println("Main thread trying to call wait() method");//1
			
				t1.wait();
				System.out.println("Main thread got notification call");//4
				System.out.println(t1.total);//5
		}
		
	}
}
