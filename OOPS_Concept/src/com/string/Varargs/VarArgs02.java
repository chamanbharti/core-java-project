package com.string.Varargs;

public class VarArgs02 {
	static void display(int num,String...values){
		System.out.println("Number is "+num);
		
		for(String s:values){
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		display(500,"hello");//one argument   
		display(1000,"my","name","is","varargs");//four arguments  
	}

}
