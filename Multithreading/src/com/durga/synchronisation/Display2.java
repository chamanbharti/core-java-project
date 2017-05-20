package com.durga.synchronisation;

public class Display2 {
	public synchronized void displayN(){////synchronization i.e. object level lock
		for (int i = 1; i <=10; i++) {
			
			System.out.print(i+" ");
			
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			
		}
	}
	public synchronized void displayC(){
		for (int i = 65; i <= 75; i++) {
			
			System.out.print((char)i+" ");
			
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

}
