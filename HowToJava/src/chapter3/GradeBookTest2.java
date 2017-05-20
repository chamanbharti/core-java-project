package chapter3;

import java.util.Scanner;

public class GradeBookTest2 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		GradeBook2 myGradeBook=new GradeBook2();
		System.out.printf("Initial course name:\n%s\n\n",myGradeBook.getCourseName());
		System.out.println("Enter the course name: ");
		String theName=input.nextLine();
		myGradeBook.setCourseName(theName);
		System.out.println();
		myGradeBook.displayMessage();
	}

}
