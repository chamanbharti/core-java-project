class Bike
{
  final void run()
  {
    System.out.println("Running");
  }

}

class Honda extends Bike
{
  void run()
   {
     System.out.println("Running safely with 100kmph");
   }

	public static void main(String[] args)
	{
	  Honda obj=new Honda();
	  obj.run();
	  Bike ob=new Bike();
	  ob.run();
	}

}
