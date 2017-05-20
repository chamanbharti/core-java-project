import java.util.*;
class Collection
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");

		Iterator itr=al.iterator();

		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}