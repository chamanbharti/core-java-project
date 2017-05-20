package com.yield;
class MyRunnable2 implements Runnable{
	
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("child thread-1");
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){}
			Thread.yield();
		}
	}
	
}
	
public class ThreadYield1{
	public static void main(String args[])throws Exception {

		MyRunnable2 r=new MyRunnable2();//thread instantiation
		Thread t=new Thread(r);
		t.start();
		//t.join();
		 try{  
 			 t.join();  
 		    }catch(Exception e){
			System.out.println(e);
			}  
		
		for(int i=0;i<10;i++){
			System.out.println("main thread-1");
		}
	}
}