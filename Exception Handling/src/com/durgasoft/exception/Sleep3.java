
class MyThread extends Thread{
	
	public void run(){
		
		for(int i=0;i<=10000;i++)
		{
		  System.out.println("I am lazy thread-"+i);	
		}
		
		System.out.println("I am entering into sleep state");	
		
		try{
			Thread.sleep(10000);
		   } 
	       catch(InterruptedException e){
	    	   System.out.println("I got interrupted");
		  }
	
		
	}
	
}
	
public class Sleep3{
	public static void main(String args[]) {
		
		
		MyThread t=new MyThread();
		t.start();
		//t.interrupt();
		System.out.println("End of main");
			
		
	}
}