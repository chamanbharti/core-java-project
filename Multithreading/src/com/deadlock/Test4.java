package com.deadlock;

public class Test4 {
	public static void main(String[] args) {
		
		final Table4 obj = new Table4();//only one object
		
		//thread one
		Thread t1 = new Thread(){
			public void run(){
				obj.printTable(5);
			}
		};
		
		//thread two
		Thread t2 = new Thread(){
			public void run(){
				obj.printTable(100);
			}
		};
		
		//call both threads
		t1.start();
		t2.start();
	}
}
