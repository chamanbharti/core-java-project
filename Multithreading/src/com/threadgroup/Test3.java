package com.threadgroup;

public class Test3 implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		 Test3 t = new Test3();
		 ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");
		 
		 Thread t1 = new Thread(tg1,t,"One");
		 t1.start();
		 
		 Thread t2 = new Thread(tg1,t,"Two");
		 t2.start();
		 
		 tg1.setMaxPriority(3);
		 Thread t3 = new Thread(tg1,t,"Three");
		 t3.start();
		 System.out.println(t1.getPriority());
		 System.out.println(t2.getPriority());
		 System.out.println(t3.getPriority());
		 System.out.println("Thread Group Name: "+tg1.getName());
		 tg1.list();
	}

}
