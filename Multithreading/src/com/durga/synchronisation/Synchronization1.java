package com.durga.synchronisation;

public class Synchronization1 {
	public static void main(String[] args) {
		Display d = new Display();
		MyThread t = new MyThread(d, "Dhoni");
		
		t.start();
	}

}
