package staticblock;

public class Test02 {
	static int i=10;
	static{
		m1();
		System.out.println("first static block");
	}
	public static void main(String[] args) {
		m1();
		System.out.println("Main method");
	}
	public static void m1() {
		System.out.println(j);
	}
	static{
		System.out.println("second static block");
	}
	static int j=20;

}
