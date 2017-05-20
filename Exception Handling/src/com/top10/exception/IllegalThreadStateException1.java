package com.top10.exception;
class MyThread extends Thread{
	public void run(){
		for(int i=0;i<=10;i++){
			
			System.out.println(i);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class IllegalThreadStateException1 {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		t.start();//java.lang.IllegalThreadStateException
	}

}
