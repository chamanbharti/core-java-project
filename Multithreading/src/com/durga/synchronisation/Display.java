package com.durga.synchronisation;

public class Display {
	//public void wish(String name){//non-synchronization
	//public synchronized void wish(String name){//synchronization i.e. object level lock
	public static synchronized void wish(String name){//static synchronization i.e. class level lock
		for (int j = 0; j < 10; j++) {
			
			System.out.print("Good Morning:");
			
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			
			System.out.println(name);
		}
	}

}
