package com.durga.synchronisation;

public class MyThread2 extends Thread{
	
	Display2 d;
	public MyThread2(Display2 d) {
		super();
		this.d = d;
	}
	@Override
	public void run() {
		d.displayC();
	}

}
