package staticblock;

public class Test3 {
	
	static{
		System.out.println(i);//direct read

		}
	static int i = 10;
}
/*
Test3.java:5: illegal forward reference
System.out.println(i);//direct read
*/