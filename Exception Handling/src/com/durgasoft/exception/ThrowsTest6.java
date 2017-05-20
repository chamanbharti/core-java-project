public class ThrowsTest6{


	public static void main(String[] args)throws InterruptedException {
	
	 doStuff();

	}
	public static void doStuff()throws InterruptedException{
	
	 doMoreStuff();

	}
	public static void doMoreStuff() throws InterruptedException{
	
	  Thread.sleep(10000);
	
	}

}
/*CE:>ThrowsTest5.java:16: unreported exception InterruptedException; must be caught or declared to be thrown
         Thread.sleep(10000);
                     ^
1 error*/