package accessmodifier;
class E
{
	private E()
	{}//private constructor
	
	void msg()
	{
		System.out.println("Hello Java");
	}
}
public class Simple4 
{
	public static void main(String[] args) 
	{
		E obj=new E();//compile time error
		
	}

}
