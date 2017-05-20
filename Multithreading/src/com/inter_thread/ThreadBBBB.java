package com.inter_thread;

public class ThreadBBBB extends Thread{
	int total=0;
	@Override
	public void run() {
		synchronized (this) {
			
			System.out.println("Child thread starts calculation");// 1
			
			for (int i = 1; i <= 100; i++) {
				total = total + i;
			}
			System.out.println("Child thread trying to give notification");// 2
			this.notifyAll();
		}
	}

}
