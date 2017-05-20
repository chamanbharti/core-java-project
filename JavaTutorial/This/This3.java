
public class This3
{
  int id;
  String name;

  This3(int i,String n)
  {
	  id=i;
	  name=n;
  }
  void Display()
  {
	  System.out.println(id+" "+name);
  }
  public static void main(String[] args)
  {
	  This3 s1=new This3(11,"Chaman");
	  This3 s2=new This3(12,"Bharti");
	  s1.Display();
	  s2.Display();
  }
}