public class ThrowsTest5{


	public static void main(String[] args) {
	
	 doStuff();

	}
	public static void doStuff(){
	
	 doMoreStuff();

	}
	public static void doMoreStuff(){
	 //try{
	  Thread.sleep(10000);
	//  }
	//catch(InterruptedException e){}
	}

}
/*CE:>ThrowsTest5.java:16: unreported exception InterruptedException; must be caught or declared to be thrown
         Thread.sleep(10000);
                     ^
1 error*/