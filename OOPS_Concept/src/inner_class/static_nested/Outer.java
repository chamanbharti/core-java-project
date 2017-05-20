package inner_class.static_nested;

public class Outer {
	
	static class Inner{
		public void m1(){
			System.out.println("Static Nested Class Method");
		}
	}
	
	public static void main(String[] args) {
		// 1 step
		//Inner i = new Inner();
		//i.m1();
		// 2 step
		//Outer.Inner i = new Outer.Inner();
		//i.m1();
		// 3 step
		new Outer.Inner().m1();
		
	}

}
