package statickeyword;
class Student
{
	  int rollno;
	  String name;
	  String college="IGNOU";	
	  
	  Student(int r,String n)
	  {
		  rollno=r;
		  name=n;
	  }
	  
	  void display()
	  {
		  
		  System.out.println(rollno+" "+name+" "+college);
	  }
}
public class Student_Test 
{
  
  public static void main(String[] args)
  {
	  Student s1=new Student(122687095,"Chaman Bharti");
	  Student s2=new Student(122687095,"Rahi Akela");
	  s1.display();
	  s2.display();
  }
  
}
