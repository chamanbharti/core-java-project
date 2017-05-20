package accessmodifier;
class B
{
	protected int data=40;
	protected void msg()
	{
		System.out.println("Hello Java");
	}
}
public class Simple1 
{
	public static void main(String[] args) 
	{
		B obj=new B();
		System.out.println(obj.data);//Compile Time error
		obj.msg();//Compile Time error
		
	}

}
