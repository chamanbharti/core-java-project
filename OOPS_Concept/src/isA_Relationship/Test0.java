package isA_Relationship;

class P{
	public void m1(){
		System.out.println("Parent...m1()");
	}
}

class C extends P{
	
	public void m2(){
		System.out.println("Child....m2()");
	}
}
public class Test0 {
	
	public static void main(String[] args) {
		
		P p = new P();// P reference and P object
		p.m1();// valid
		//p.m2;//invalid
		
		C c = new C();// C reference and C object
		c.m1();//valid
		c.m2();//valid
		
		P pp = new C();// P reference but C object
		pp.m1();//valid
		//pp.m2();//invalid
		
		//C cc = new P();//invalid
	}
}
