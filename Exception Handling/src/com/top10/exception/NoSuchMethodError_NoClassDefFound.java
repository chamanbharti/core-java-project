package com.top10.exception;

class A{
	public static void main(String[] args) {
		System.out.println("class A");
	}
}
class B{
	public static void main(String[] args) {
		System.out.println("class B");
	}
}
class C{
	public static void main(String[] args) {
		System.out.println("class C");
	}
}
class D{
	
}
public class NoSuchMethodError_NoClassDefFound {
	public static void main(String[] args) {
		System.out.println("main class");
	}
	

}
/*
F:\Java_Works\Java-Projects\Exception Handling\src\com\top10\exception>java com.top10.exception.D
Error: Main method not found in class com.top10.exception.D, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
NoSuchMethodError:main
*/
/*
 * F:\Java_Works\Java-Projects\Exception Handling\src\com\top10\exception>java com.top10.exception.E
Error: Could not find or load main class com.top10.exception.E
NoClassDefFoundErro:E
F:\Java_Works\Java-Projects\Exception Handling\src\com\top10\exception>
 * *
 */