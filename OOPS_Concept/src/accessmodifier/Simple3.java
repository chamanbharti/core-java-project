package accessmodifier;
class D
{
	public int data=40;
	public void msg()
	{
		System.out.println("Hello Java");
	}
}
public class Simple3 
{
	public static void main(String[] args) 
	{
		D obj=new D();
		System.out.println(obj.data);//Compile Time error
		obj.msg();//Compile Time error
		
	}

}
