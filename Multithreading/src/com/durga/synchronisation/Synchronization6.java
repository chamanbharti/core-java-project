package com.durga.synchronisation;

public class Synchronization6 {
	public static void main(String[] args) {
		Display2 d1 = new Display2();
		Display2 d2 = new Display2();
		MyThread1 t1 = new MyThread1(d1);
		MyThread2 t2 = new MyThread2(d1);
		
		t1.start();
		t2.start();
	}

}
