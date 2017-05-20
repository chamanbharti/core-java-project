package com.deadlock;

public class Thread2 extends Thread{
	
	Table t;
	{
		System.out.println("Thread2 is called");
	}
	Thread2(Table t){
		this.t= t;
	}
	
	public void run(){
		t.printTable(100);
	}


}
