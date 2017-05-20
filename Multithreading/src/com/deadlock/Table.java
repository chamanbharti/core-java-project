package com.deadlock;

public class Table {
	
	public void printTable(int n){//without synchronised method
	//public synchronized void printTable(int n){//without synchronised method
		
		for(int i=1;i<=5;i++){
			System.out.println(n*i);
			
			try{
				Thread.sleep(400);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	//initialization block
	{
		System.out.println("Table class is called");
	}

}
