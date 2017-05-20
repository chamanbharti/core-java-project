package com.wrapperclass;

public class CallByValu01 {
	
	
	public static int second(int k) {
		k++;
		System.out.println("K="+k);
		return k;
	}

	public static void main(String[] args) {
		int i=10;
		int x=second(i);
		System.out.println("i="+i);
		
	}

}
