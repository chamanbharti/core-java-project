public class Character
{
	public static void main(String[] args)
	{
		String cob1="Chaman";
		String cob2="chaman";
		String cob3="Bharti";
		int difference=cob1.compareTo(cob2);

		if(difference==0)
		System.out.println(cob1+" is equal to "+cob2);

		else
		System.out.println(cob1+" is not equal to "+cob2);
		
		System.out.println("cob1 is "+( (cob2.equals(cob3) )? " equal" : " not equal" )+"to cob3");
	}

}