package com.sleep;

class MyThread2 extends Thread{
	
	public void run(){
		try{
		    for(int i=0;i<10;i++){
			System.out.println("I am lazy Thread");
			Thread.sleep(2000);
			
		      }
		}catch(InterruptedException e){
		  System.out.println("I got interrupted");
		}
	
		
	}
	
}
	
public class Sleep2{
	public static void main(String args[])throws Exception {
		
		
		MyThread2 t=new MyThread2();
		t.start();
		//t.interrupt();
		System.out.println("End of main");
			
		
	}
}