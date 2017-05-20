package com.deadlock;

public class Table3 {
	
	public void printTable(int n){
		//synchronised block
		synchronized (this) {
			
			for(int i=1;i<=5;i++){
				System.out.println(n*i);
				try{
					Thread.sleep(400);
				}catch(Throwable e){
					e.printStackTrace();
				}
			}
		}
			
	}

}
