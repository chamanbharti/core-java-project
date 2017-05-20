package com.top10.exception;

public class AssertionError1 {
	public static void main(String[] args) {
		int x = 10;
		assert(x > 10): m1();
		System.out.println(x);
	}
	public static int m1(){
		return 777;
	}

}
/*javac AssertionError1.java
java AssertionError1
output:10
java -ea AssertionError1
RE:AssertionError:777
*/