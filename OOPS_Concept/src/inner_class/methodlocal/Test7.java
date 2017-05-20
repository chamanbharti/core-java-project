package inner_class.methodlocal;

public class Test7 {
	int i = 10;
	static int j = 20;
	public void m1(){
		int k = 30;//local variable
		final int m = 40;//local variable
		
		class Inner{
			int n = 50;
			public static void m2(){
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
		Test7 t = new Test7();
		t.m1();
	}

}
/*
Test7.java:13: non-static variable i cannot be referenced from a static context
System.out.println(i);
                   ^
Test7.java:15: local variable k is accessed from within inner class; needs to be declared final
System.out.println(k);
                   ^
Test7.java:17: non-static variable n cannot be referenced from a static context
System.out.println(n);
                   ^
Test7.java:12: inner classes cannot have static declarations
public static void m2(){
           ^
4 errors*/