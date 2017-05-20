package Keyword.Assertion;

import java.util.Scanner;

public class AssertionExample1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Your Age: ");
		
		int value=scanner.nextInt();
		assert value>=18:"Not Valid";
		System.out.println("Value is "+value);
	}

}
