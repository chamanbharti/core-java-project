package com.deadlock;

public class Thread3 extends Thread{
	Table3 t;
	Thread3(Table3 t){
		this.t = t;
	}
	public void run(){
		t.printTable(5);
	}
	

}
