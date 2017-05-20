package com.deadlock;

public class Test7 {
	public static void main(String[] args) {
		
		Thread t1 =new Thread(){
			public void run(){
				System.out.println("this starts");
				Table7.printTable(11);
				System.out.println("this ends");
			}
		};
		
		Thread t2 = new Thread(){
			public void run(){
				System.out.println("this starts");
				Table7.printTable(12);
				System.out.println("this ends");
			}
		};
		
		Thread t3 = new Thread(){
			@Override
			public void run() {
				System.out.println("this starts");
				Table7.printTable(13);
				System.out.println("this ends");
			}
		};
		
		Thread t4 = new Thread(){
			public void run() {
				System.out.println("this starts");
				Table7.printTable(14);
				System.out.println("this ends");
			}
		};
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
