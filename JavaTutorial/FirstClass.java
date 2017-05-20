class Student
{
  String name;
  String course;
  int age;
  
  void display_info()//function for displaying basic information
  {
    System.out.println("Student Information");
    System.out.println("Name: "+name);
    System.out.println("Course: "+course);
    System.out.println("Age "+age);
  }
}//end of student class

class Display_Test
{
  public static void main(String para[])
  {
   Student student1;
   student1=new Student();
   student1.name="Mr Chaman";//assigning value to name variable of student1 object
   student1.course="BCA";//assigning value to course variable of student1 object
   student1.age=24;//assigning value to age variable of student1 object
   
   student1.display_info();// invoking display_info() method on student1 object
  }
}