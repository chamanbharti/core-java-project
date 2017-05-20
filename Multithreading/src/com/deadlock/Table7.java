package com.deadlock;

public class Table7 {

	static void printTable(int n){
		synchronized (Table7.class) {//synchronized block on class Table7
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
