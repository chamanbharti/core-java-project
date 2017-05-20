package accessmodifier.mypack;

import accessmodifier.pack.Simple5;

 class Simple6
{
	public static void main(String[] args) 
	{
		Simple5 obj=new Simple5();//compile time error
		//Simple6 obj=new Simple6();//compile time error
		obj.msg();//compile time error
		
	}

}
