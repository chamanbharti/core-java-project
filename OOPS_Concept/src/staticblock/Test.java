package staticblock;

public class Test {
	static int i = 10;
	static{
		m1();
		System.out.println(i);//direct read

		}
	private static void m1() {
		System.out.println(i);//indirect read
		
	}
}
