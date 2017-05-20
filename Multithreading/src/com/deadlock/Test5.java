package com.deadlock;

public class Test5 {
	public static void main(String[] args) {
		//final Table5 obj = new Table5();
		
		Thread5 t1 = new Thread5();
		Thread6 t2 = new Thread6();
		Thread7 t3 = new Thread7();
		Thread8 t4 = new Thread8();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
