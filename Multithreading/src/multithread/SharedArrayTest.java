package multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SharedArrayTest {
	public static void main(String[] args) {
		SimpleArray sharedSimpleArray = new SimpleArray(6);
		ArrayWriter writer1= new ArrayWriter(1, sharedSimpleArray);
		ArrayWriter writer2=new ArrayWriter(2, sharedSimpleArray);
		//execute task with an ExecuteService
		ExecutorService executor=Executors.newCachedThreadPool();
		executor.execute(writer1);
		executor.execute(writer2);
		
		executor.shutdown();
		
		try{
			boolean taskEnded=executor.awaitTermination(1, TimeUnit.MINUTES);
			
			if(taskEnded)
				System.out.println(sharedSimpleArray);
			else
				System.out.println("Time out while waiting for tasks to finish");
			
		}
		catch(InterruptedException e){
			System.out.println("Interrupted while waiting for tasks to finish.");
		}
		
	}

}
