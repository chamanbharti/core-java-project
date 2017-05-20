package multithread;
import java.util.Random;


public class PrintTask implements Runnable{
	private final int sleepTime;//random sleep time for thread
	private final String taskName;//name of task
	private final static Random generator=new Random();
	
	//constructor
	public PrintTask(String name){
		taskName=name;//set task name
		// pick random sleep time between 0 and 5 seconds
		sleepTime = generator.nextInt( 5000 ); // milliseconds
	}// end PrintTask constructor
	
   public void run(){
	   try{
		   System.out.printf("%s going to sleep for %d milliseconds.\n",taskName,sleepTime);
		   Thread.sleep(sleepTime);//put thread to sleep
	   }
	   catch(InterruptedException exception){
		   System.out.printf("%s %s\n",taskName,"terminate prematurely due to interruption");
	   }
	   System.out.printf("%s done sleeping\n",taskName);
   }
}
