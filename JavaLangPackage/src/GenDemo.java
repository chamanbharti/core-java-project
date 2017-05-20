
class Gen<T> 
{
	T ob; // declare an object of type T
	
	
	Gen(T o)// Pass the constructor a reference to an object of type T.
	{
		ob=o;
	}
	
	T getob()// Return ob.
	{
		return ob;
	}
	//show type of T
	void showType()
	{
		System.out.println("Type of T is "+ob.getClass().getName());
	}
}


public class GenDemo 
{
	public static void main(String[] args) 
	{
		Gen<Integer> iob;
		iob=new Gen<Integer>(88);
		//show type of data used by iob
		iob.showType();
		int v=iob.getob();
		System.out.println("Value: "+v);
		System.out.println();
		// Create a Gen object for Strings.
		Gen<String> strob=new Gen<String>("Generic Test");
		//show type of data used by strob
		strob.showType();
		String str=strob.getob();
		System.out.println("Value: "+str);
	}
}
