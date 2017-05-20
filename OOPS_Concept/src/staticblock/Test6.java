package staticblock;

public class Test6 extends Test5{
	
	static int x = 100;
	
	static{
		m2();
		System.out.println("Child first static block");

		}
	
	public static void main(String[] args) {
		m2();
		System.out.println("Child main");
	}
	
	private static void m2() {
		System.out.println(y);
		
	}
	
	static{
		System.out.println("Child second static block");
	}
	
	static int y = 200;
}
