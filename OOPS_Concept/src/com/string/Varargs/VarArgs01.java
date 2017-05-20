package com.string.Varargs;

public class VarArgs01 {
	static void display(String...values){
		System.out.println("display method invoked ");
		
		for(String s:values){
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		display();//zero argument
		display("Hello");//one argument
		display("my","name","is","Varargs");//four arguments)
	}

}
