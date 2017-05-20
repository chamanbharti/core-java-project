package com.durga.synchronizedBlock;

public class X {
	
	public synchronized void m1(){
		//here  thread has lock of 'x' object
		Y y = new Y();
		System.out.println("Hello X");
		
		synchronized(y){
			//here thread has lock of 'x' and 'y'
			Z z = new Z();
			System.out.println("Hello Y");
			
			synchronized (z) {
				//here thread has lock of x,y and z
				System.out.println("Hello Z");
			}
		}
	}

}
