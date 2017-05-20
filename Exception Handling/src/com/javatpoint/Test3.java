package com.javatpoint;

public class Test3 {
	public static void main(String[] args) {
		try{
			int a[] = new int[5];
			a[5] = 30/0;
		}catch(Exception e){
			System.out.println("common task completed");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("task 2 completed");
		}catch(ArithmeticException e){
			System.out.println("task 1 completed");
		}
	}

}
