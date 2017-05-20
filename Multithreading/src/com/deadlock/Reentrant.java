package com.deadlock;

public class Reentrant {
	public synchronized void m(){
		n();
		System.out.println("this is m() method");
	}
	
	public synchronized void n(){
		System.out.println("This is n() method");
	}
	
	public static void main(String[] args) {
		final Reentrant re = new Reentrant();
		
		Thread t = new Thread(){
			public void run(){
				re.m();//calling method of Reentrant class
			}
		};
		t.start();
	}

}
