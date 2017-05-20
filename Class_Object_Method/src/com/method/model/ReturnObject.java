package com.method.model;

public class ReturnObject {
	
	int x;
	public ReturnObject(int x){
		this.x=x;
	}
	ReturnObject updateObject(){
		ReturnObject temp=new ReturnObject(x+10);
		return temp;
	}
	
	public static void main(String[] args) {
		ReturnObject t = new ReturnObject(15);
		System.out.println("before object update x= "+t.x);
		t=t.updateObject();
		System.out.println("after object update x= "+t.x);
	}

}
