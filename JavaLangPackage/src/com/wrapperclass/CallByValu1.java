package com.wrapperclass;

public class CallByValu1 {
	int data=50;
	
	void change(int data){
		data=data + 100;//changes will be in the local variable only
		//System.out.println(data);//600
	}
	
	public static void main(String[] args) {
		CallByValu1 cbv=new CallByValu1();
		
		System.out.println("before change "+cbv.data);
		cbv.change(500);
		System.out.println("after change "+cbv.data);
	}

}
