package com.polymorphism.compiletime;

public class MainMethodOverload {
//Can we overload main() method?

//Yes, by method overloading. You can have any number of main methods in a class by method overloading.
	public static void main(int a){
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		System.out.println("main() method invoked");
		main(10);
	}

}
