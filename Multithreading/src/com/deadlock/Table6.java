package com.deadlock;

public class Table6 {
	synchronized static void printTable(int n){
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
