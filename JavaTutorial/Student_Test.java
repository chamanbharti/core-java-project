class Student
{
  String name;
  int roll_no;
  String course;
  
  Student(String n,int r,String c)
  {
    name=n;
    roll_no=r;
    course=c;
  }

  Student(String n,int r)
  {
    name=n;
    roll_no=r;
    course="MCA";
  }
  
  void Student_Info()
  {
   System.out.println("***********Student Information ********");
   System.out.println("Name: "+name);
   System.out.println("Course "+course);
   System.out.println("Roll Number: "+roll_no);
  }
}

class Student_Test
{
  public static void main(String para[])
 { 
   Student s1 =new Student("Rahi Akela",122687088,"BCA");
   Student s2 =new Student("Chaman Bharti",122687095);
   s1.Student_Info();
   s2.Student_Info();
 }
}