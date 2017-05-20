//Can we initialize blank final variable
//yes, but only in constructor.

class blank
{
  final int speedlimit;//blank final variable
  
  blank() 
  {
    speedlimit=70;
    System.out.println(speedlimit);
  }
	public static void main(String[] args)
	{
	  new blank();
	 
	  
	}

}
