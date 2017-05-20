interface Printable
{
  void print();
}

interface Showable
{
  void show();
}

class B implements Printable,Showable
{
  public void print()
  {
    System.out.println("Hello");
  }
  
  public void show()
  {
    System.out.println("Welcome");
  }
 
 public static void main(String[] args)
  {
    B obj=new B();
    obj.print();
    obj.show();
  }
}