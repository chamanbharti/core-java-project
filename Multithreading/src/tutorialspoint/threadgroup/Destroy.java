package tutorialspoint.threadgroup;

public class Destroy implements Runnable{
	
	 public static void main(String args[]) throws Exception{

		 	Destroy tg = new Destroy();
		 	tg.func();

		   }

	 public void func() {
	      try {     
	         // create a parent ThreadGroup
	         ThreadGroup pGroup = new ThreadGroup("Parent ThreadGroup");
	    
	         // create a child ThreadGroup for parent ThreadGroup
	         ThreadGroup cGroup = new ThreadGroup(pGroup, "Child ThreadGroup");

	         // create a thread
	         Thread t1 = new Thread(pGroup, this);
	         System.out.println("Starting " + t1.getName() + "...");
	         t1.start();
	            
	         // create another thread
	         Thread t2 = new Thread(cGroup, this);
	         System.out.println("Starting " + t2.getName() + "...");
	         t2.start();
	            
	         // block until the other threads finish
	         t1.join();
	         t2.join();
	         
	         //child group destroyed
	         cGroup.destroy();
	         System.out.println(cGroup.getName()+" destroyed");
	         
	       //parent group destroyed
	         pGroup.destroy();
	         System.out.println(pGroup.getName()+" destroyed");
	      }
	      catch (InterruptedException ex) {
	         System.out.println(ex.toString());
	      }
	   }

	   // implements run()
	   public void run() {

	      for(int i=0;i<1000;i++) {
	         i++;
	      }
	      System.out.println(Thread.currentThread().getName() + " finished executing.");
	   }

}

