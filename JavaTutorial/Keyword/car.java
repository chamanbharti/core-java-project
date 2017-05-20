class car
{
  final void run()
  {
    System.out.println("Running safely with 100kmph");
  }
}

class cycle extends car
{

	public static void main(String[] args)
	{
	  new cycle().run();
	 
	  
	}

}
