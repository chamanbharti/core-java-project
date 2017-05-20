package com.deadlock;

public class Table2 {
	synchronized void printTable(int n){
		for(int i=1;i<=5;i++){
			System.out.println(n*i);
		}
		
		try{
			Thread.sleep(400);
		}catch(Throwable e){
			e.printStackTrace();
		}
	}
	//initialization block
		{
			System.out.println("Table2 class is called");
		}

}
