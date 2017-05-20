package com.deadlock;

public class Test3 {

	public static void main(String[] args) {
		final Table3 obj = new Table3();//only one object
		
		Thread3 t1 = new Thread3(obj);
		Thread4 t2 = new Thread4(obj);
		
		//thread call
		t1.start();
		t2.start();

	}

}
