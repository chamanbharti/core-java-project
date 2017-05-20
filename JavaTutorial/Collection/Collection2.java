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


		for(Object obj:al)
		System.out.println(obj);
	}

}