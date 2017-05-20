package com.deadlock;

public class Test2 {
	public static void main(String[] args) {
		final Table2 obj = new Table2();//only one object
		
		//annonymous class
		Thread t1 = new Thread(){
			public void run(){
				obj.printTable(5);
			}
		};
		
		Thread t2 = new Thread(){
			public void run(){
				obj.printTable(100);
			}
		};
		
		//call thread
		t1.start();
		t2.start();
	}

}
