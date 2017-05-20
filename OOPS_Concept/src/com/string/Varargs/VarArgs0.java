package com.string.Varargs;

public class VarArgs0 {
	static void display(String...values){
		System.out.println("display method invoked ");
	}
	public static void main(String[] args) {
		display();//zero argument
		display("my","name","is","Varargs");//four arguments)
	}

}
