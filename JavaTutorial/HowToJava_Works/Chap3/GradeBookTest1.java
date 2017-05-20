import java.util.Scanner;//program uses Scanner
public class GradeBookTest1
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		GradeBook1 myGradeBook=new GradeBook1();
		System.out.printf("Please enter the course name:");
		String nameOfCourse=input.nextLine();//read a line of text
		System.out.println();//outputs a blank line
		myGradeBook.displayMessage(nameOfCourse);
	}

}