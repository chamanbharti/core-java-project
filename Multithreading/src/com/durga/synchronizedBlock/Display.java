package com.durga.synchronizedBlock;

public class Display {
	
	public void wish(String name){//static synchronization i.e. class level lock
		
		;;;;;;;;;//1 lack lines of code
		//synchronized(this){//current object
		synchronized(Display.class){//class level lock object
			for (int i = 0; i < 10; i++) {
				
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
		;;;;;;//1 lack line of code
	}

}
