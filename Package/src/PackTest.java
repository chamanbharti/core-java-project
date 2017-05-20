//program
//package MyPack;
class Student
{
	String Name;
	int Age;
	String Course;
	Student( String n, int a, String c)
	{
		Name = n;
		Age = a;
		Course = c;
	}
	
	void Student_Information()
	{
		System.out.println("Name of the Student :"+ Name);
		System.out.println("Age of the Student :"+Age);
		System.out.println("Enrolled in Course :"+Course);
	}
}
public class PackTest
{
	public static void main( String args[])
	{
		Student Std1 = new Student("Rajeev",19, "MCA");
		Std1.Student_Information();
	}
}

