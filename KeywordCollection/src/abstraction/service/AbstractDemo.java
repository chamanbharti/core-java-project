package abstraction.service;

import abstraction.model.Test;

public abstract class AbstractDemo {
	public static void main(String[] args) {
		Test t1=new Test();
		int data=5;//data member
		System.out.println(data);//data member call
		System.out.println("From abstract class main():"+t1.x);
		t1.display();
	}

}
