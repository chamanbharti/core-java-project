package inner_class.methodlocal;

public class Test2 {
	int x =10;
	static int y =20;
	
	public void m1(){
		
		class Inner{
			
			public void m2(){
				System.out.println(x);
				System.out.println(y);
			}
		}
		
		Inner i = new Inner();
		 i.m2();
	}
	
	public static void main(String[] args) {
		Test2 t = new Test2();
		t.m1();
	}

}
