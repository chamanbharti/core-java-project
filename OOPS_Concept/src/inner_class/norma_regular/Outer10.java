package inner_class.norma_regular;

public class Outer10 {
		public void m1(){
			System.out.println("Outer most class method");
		}
	class Inner{
		public void m2(){
			System.out.println("Inner most class method");
		}
		class NestedInner{
			public void m3(){
				System.out.println("Nested Inner most class method");
			}
		}
		
	}
	public static void main(String[] args) {
		Outer10 o =new Outer10();
		o.m1();
		Outer10.Inner i = o.new Inner();
		i.m2();
		Outer10.Inner.NestedInner ni = i.new NestedInner();
		ni.m3();
	}

}
