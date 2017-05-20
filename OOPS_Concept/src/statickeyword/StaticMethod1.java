package statickeyword;
class StudentOne
{
  int rollno;
  String name;
  static String college="ITS";

 static void change()
  {
    college="BBDIT";
  }

  StudentOne(int r,String n)
  {
    rollno=r;
    name=n;
  }

  void display()
  {
   System.out.println(rollno+" "+name+" "+college);
  }
}

  class StaticMethod1
  {
    public static void main(String[] args)
    {
    	//StudentOne.change();
    	StudentOne s1=new StudentOne(122687095,"Chaman");
    	StudentOne s2=new StudentOne(122687088,"Rahi");
    	StudentOne s3=new StudentOne(122687088,"Sahil");
     s1.display();
     StudentOne.change();
     //change();
     s2.display();
     s3.display();
    }

  }