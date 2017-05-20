package accessmodifier;
class C
{
	int data=40;
	 void msg()
	{
		System.out.println("Hello Java");
	}
}
public class Simple2 
{
	public static void main(String[] args) 
	{
		C obj=new C();
		System.out.println(obj.data);//Compile Time error
		obj.msg();//Compile Time error
		
	}

}
