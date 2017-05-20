package com.deadlock;

public class ResolveDeadLockTest {
	//Resource A
	private class A{
		private int i = 10;
		
		public int getI(){
			return i;
		}
		
		public void setI(int i){
			this.i = i;
		}
	}
	//Resource B
	private class B{
		private int i = 20;
		
		public int getI(){
			return i;
		}
		
		public void setI(int i){
			this.i = i;
		}
	}
	public static void main(String[] args) {
		
		ResolveDeadLockTest test = new ResolveDeadLockTest();
		
		final A a = test.new A();
		final B b = test.new B();
		
		//thread-1
		Runnable block1 = new Runnable() {
			public void run() {
			 //synchronized (a) {//it will show deadlock
				 synchronized (b) {
				try{
					//adding delay so that both threads can start trying to lock resources
					Thread.sleep(100);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				//Thread-1 have A but need B also
				//synchronized (b) {//it will show deadlock
				synchronized (a) {
					System.out.println("In block 1");
				}
			  }	
			}
		};
		//Thread-2
		Runnable block2 = new Runnable() {
			
			@Override
			public void run() {
				//synchronized (b) {//it will show deadlock
				synchronized (b) {
					//Thread-2 have B nut need A also
					//synchronized (a) {
					synchronized (a) {
					System.out.println("In block 2");	
					}
				}
			}
		};
		
		new Thread(block1).start();
		new Thread(block2).start();
	}

}
