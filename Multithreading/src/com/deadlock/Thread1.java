package com.deadlock;

public class Thread1 extends Thread {
	
	{
		System.out.println("Thread1 is called");
	}
	Table t;
	
	Thread1(Table t){
		this.t = t;
	}
	
	public void run(){
		t.printTable(5);
	}

}
