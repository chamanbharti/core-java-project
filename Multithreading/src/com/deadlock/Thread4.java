package com.deadlock;

public class Thread4 extends Thread{
	Table3 t;
	Thread4(Table3 t){
		this.t = t;
	}
	
	public void run(){
		t.printTable(100);
	}

}
