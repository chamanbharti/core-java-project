package com.wrapperclass;

public class CallByValu2 {
	int data=50;
	void change(CallByValu2 cbv){
		cbv.data=cbv.data + 100;//changes will be in the intance variable only
		System.out.println(data);//150
	}
	
	public static void main(String[] args) {
		CallByValu2 cbv=new CallByValu2();
		
		System.out.println("before change "+cbv.data);
		cbv.change(cbv);//passing object
		System.out.println("after change "+cbv.data);
	}

}