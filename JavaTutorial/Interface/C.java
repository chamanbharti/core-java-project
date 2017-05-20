interface Printable
{
  void print();
}

interface Showable extends Printable
{
  void show();
}

class C implements Showable
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
    C obj=new C();
    obj.print();
    obj.show();
  }
}