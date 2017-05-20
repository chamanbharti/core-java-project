package inner_class.static_nested;

import inner_class.static_nested.Outer2.Nested;

public class Test {
	public static void main(String[] args) {
		// 1 step
		Nested i = new Nested();
		i.m1();
		// 2 step
		//Outer2.Nested i = new Outer2.Nested();
		//i.m1();
		// 3 step
		//new Outer2.Nested().m1();
		// 4 step
		//Outer2.Nested i = new Outer2.Nested();
		//i.m1();
		
	}

}
