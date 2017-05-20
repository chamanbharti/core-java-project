class NonGen
{
	Object ob;//ob is now of type object
	
	NonGen(Object o) 
	{
		ob=o;
	}
	
	Object getob()
	{
		return ob;
	}
	
	void showType()
	{
		System.out.println("Type of ob is "+ob.getClass().getName());
	}
}
public class NonGenDemo 
{
	public static void main(String[] args) 
	{
		NonGen iob;
		iob=new NonGen(88);
		iob.showType();
		int v=(Integer)iob.getob();
		System.out.println("Value: "+v);
		System.out.println();
		NonGen strob=new NonGen("Non-Generic Test");
		strob.showType();
		String str=(String)strob.getob();
		System.out.println("Value: "+str);
		// This compiles, but is conceptually wrong!
		//iOb = strOb;
		//v = (Integer) iOb.getob(); // run-time error!
	}
}
