package inner_class.norma_regular;

public class Outer9 {
	
	int outer_x =10;
	
	public void m1(){
		System.out.println("from outer method...");
		Inner i = new Inner();
		i.m2();
	}
	class Inner{
		
		int inner_x = 100;
		
		public void m2(){
			int x = 1000;
			System.out.println("from inner method...");
			System.out.println("Inner method's Local variable:"+x);//1000
			System.out.println("Inner class variable:"+inner_x);//100
			System.out.println("Outer class variable:"+outer_x);//10
		}
		
	}
	public static void main(String[] args) {
		Outer9 o = new Outer9();
		o.m1();
	}

}
