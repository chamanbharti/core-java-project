package com.durga.deadlock;

class MyThread3 extends Thread{
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
public class DeadLock3 {
	public static void main(String[] args) throws InterruptedException {
		
		MyThread3 t1 = new MyThread3();
		t1.start();
		
		Thread.sleep(10000);
		
		synchronized (t1) {
			System.out.println("Main thread trying to call wait() method");//1
			
				//t1.wait();
				t1.wait(10000);
				System.out.println("Main thread got notification call");//4
				System.out.println(t1.total);//5
		}
		
	}
}
