package abstraction.service;

import abstraction.model.Test2;

public class AbstractDemo2 extends Test2{
	public static void main(String[] args) {
		//Test2 t1=new Test2();//can't create obj
		display();
		Test2.display();
		System.out.println(Test2.data);
	}

}
