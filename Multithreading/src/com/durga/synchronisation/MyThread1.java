package com.durga.synchronisation;

public class MyThread1 extends Thread{
	
	Display2 d;
	public MyThread1(Display2 d) {
		super();
		this.d = d;
	}
	@Override
	public void run() {
		d.displayN();
	}

}
