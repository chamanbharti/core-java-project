package staticblock;

public class Test5 {
	
	static int i = 10;
	static{
		m1();
		System.out.println("Base static block");

		}
	public static void main(String[] args) {
		m1();
		System.out.println("Base main");
	}
	private static void m1() {
		System.out.println(j);
		
	}
	static int j = 20;
}
