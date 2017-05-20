package inner_class.methodlocal;

public class Test6 {
	int i = 10;
	static int j = 20;
	public static void m1(){
		int k = 30;//local variable
		final int m = 40;//local variable
		
		class Inner{
			int n = 50;
			public void m2(){
				System.out.println(i);
				System.out.println(j);
				System.out.println(k);
				System.out.println(m);
				System.out.println(n);
			}
		}
		
		Inner i = new Inner();
		 i.m2();
	}
	
	public static void main(String[] args) {
		Test6 t = new Test6();
		t.m1();
	}

}
