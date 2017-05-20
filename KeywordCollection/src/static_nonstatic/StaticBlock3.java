package static_nonstatic;
class StaticBlock3 
{
	static int num;
	static String mystr;
	//first static block
	static
	  {
			System.out.println("Static Block 1");
			num=97;
			mystr="Block1";
	  }
	//second static block
	static{
			System.out.println("Static Block 2");
			num=98;
			mystr="Block2";
	}
	
  public static void main(String[]args)
  {
	  System.out.println("Value of num= "+num);
	  System.out.println("Value of mystr= "+mystr);
  }
}


