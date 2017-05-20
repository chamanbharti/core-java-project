package abstraction.service;

import abstraction.model.A;
import abstraction.model.B;


public class TestAB {
	public static void main(String[] args) {
		A b1=new B();//I
		b1.callme();
		b1.normal();
		System.out.println(b1.data);
		B b2=new B();// II
		b2.callme();
		b2.normal();
		System.out.println(b2.data);
	
	}

}
