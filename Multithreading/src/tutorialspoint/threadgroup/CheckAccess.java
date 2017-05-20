package tutorialspoint.threadgroup;

public class CheckAccess implements Runnable{
	
	 public static void main(String args[]) throws Exception{

		 	CheckAccess tg = new CheckAccess();
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
	            
	         //Checking the access for these ThreadGroups
	         try{
	        	 pGroup.checkAccess();
	        	 System.out.println(pGroup.getName()+" has access");
	        	 cGroup.checkAccess();
	        	 System.out.println(cGroup.getName()+" has access");
	         }catch(SecurityException e){
	        	 System.out.println("No Access: "+e.toString());
	         }

	         // block until the other threads finish
	         t1.join();
	         t2.join();
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

