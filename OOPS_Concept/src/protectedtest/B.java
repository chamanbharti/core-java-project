package protectedtest;

import protectedAcess.A;

class B extends A{
	void msg(){System.out.println("Hello java");}
	public static void main(String[] args) {
		A obj=new A();
		//obj.msg();
		//System.out.println(pm.data);
	}

}
