package Thread;
class Thread_Test
{
  public static void main(String[]args)
  {

    try
    {
      Thread threadRef=Thread.currentThread();
      System.out.println("Current Thread:"+threadRef);
      System.out.println("Before changing the name of main thread:"+threadRef);
      //change the internal name of the thread

	threadRef.setName("MyFirstThread");
	System.out.println("After changing the name of main thread:"+threadRef);
 
    }

	catch(Exception e)
	{

             System.out.println("Main thread interrupted");
        }
  }


}