package inner_class.methodlocal;

public class Test3 {
	int x =10;
	static int y =20;
	
	public static void m1(){
		
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
		Test3 t = new Test3();
		t.m1();
	}

}
