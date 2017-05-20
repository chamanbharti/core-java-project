class Simple{}
class Test3
{
	void printName(Object obj)
	{
		Class c=obj.getClass();
		System.out.println(c.getName());
	}
	public static void main(String[] args)
	{
		Simple s=new Simple();
		Test3 t=new Test3();
		t.printName(s);	
	}
}