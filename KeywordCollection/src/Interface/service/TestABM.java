package Interface.service;

import Interface.model.A;
import Interface.model.M;

public class TestABM {
	public static void main(String[] args) {
		/*A a=new M();
		a.a();
		a.b();
		a.c();
		a.d();*/
		M m=new M();
		m.a();
		m.b();
		m.c();
		m.d();
		//A a=new B();//can't create obj of abstract class
	}

}
