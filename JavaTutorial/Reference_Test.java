class Person
{
  String name;
  String address;
  int age;
  
  void display()
  {
    System.out.println("Student Information: "+name+"("+age+")"+"\n"+address);
    
  }
}//end of student class

class Reference_Test
{
  public static void main(String para[])
  {
   Person p=new Person();
   Person q=new Person();

   p.name="Mr. Chaman Bharti";
   p.age=24;
   p.address="C/O MD Lal, MB-163, Gali NO:4,Sahakarpur, ND-92";
   
   
   p.display();
   
  q=p;//q refer to p
  q.name="Mr. Sahil Bharti";
  q.age=22;
  q.address="C/O MD Lal, MB-163, Gali NO:4,Sahakarpur, ND-92";
  q.display();

  }
}