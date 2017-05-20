package com.top10.exception;

public class IllegalArgument3 {
	
		    public static void main(String[] args) {
		    	System.out.println(Thread.currentThread().getPriority());//5
				Thread t = new Thread();
				Thread.currentThread().setPriority(15);//RE:IllegalArgumentException
				Thread.currentThread().setPriority(7);
				System.out.println(t.getPriority());//7
		    }


}
