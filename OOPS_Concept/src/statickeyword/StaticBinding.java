package statickeyword;

public class StaticBinding 
{
	protected void eat()
	{
		System.out.println("Dog is eating");
	}
	public static void main(String[] args)
	{
		StaticBinding d=new StaticBinding();
		d.eat();
	}
}
