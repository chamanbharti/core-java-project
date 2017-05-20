
public class This2
{
  int id;
  String name;

  This2(int id,String name)
  {
	  this.id=id;
	  this.name=name;
  }
  void Display()
  {
	  System.out.println(id+" "+name);
  }
  public static void main(String[] args)
  {
	  This2 s1=new This2(11,"Chaman");
	  This2 s2=new This2(12,"Bharti");
	  s1.Display();
	  s2.Display();
  }
}