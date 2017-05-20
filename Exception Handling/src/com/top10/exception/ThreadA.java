package com.top10.exception;

public class ThreadA extends Thread{
	int total=0;
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			total = total + i;
		}
	}

}
