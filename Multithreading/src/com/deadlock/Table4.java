package com.deadlock;

public class Table4 {
	public void printTable(int n){
		
		synchronized (this) {
			for(int i=1;i<=5;i++){
				System.out.println(n*i);
			}
			try{
				Thread.sleep(400);
			}catch(Throwable e){
				e.printStackTrace();
			}
			
		}
	}

}
