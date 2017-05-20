package com.race_condition;
//http://netjs.blogspot.in/2017/03/volatile-in-java_20.html
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//shared class
	class Data{
		
		public volatile int counter=0;
		
		public int getCounter(){
			return counter;
		}
		
		public void incrementCounter(){
			
			try{
				Thread.sleep(10);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
			counter++;
		}
	}
	
	//thread
	class VTask implements Runnable{
		private Data data;
		public VTask(Data data){
			this.data = data;
		}
		public void run(){
		System.out.println("Value for Thread "+Thread.currentThread().getName()+" Before increment "+data.getCounter());
		System.out.println("Value for Thread "+Thread.currentThread().getName()+" After decrement "+data.getCounter());
		}
	}
public class VolatileDemo {

	public static void main(String[] args) {
		Data data = new Data();
		//start 6 threads
		ExecutorService ex = Executors.newFixedThreadPool(6);
		ex.execute(new VTask(data));
		ex.execute(new VTask(data));
		ex.execute(new VTask(data));
		ex.execute(new VTask(data));
		ex.execute(new VTask(data));
		ex.execute(new VTask(data));
		//shutting down the executor service
		  ex.shutdown();
		
	}
}
