public class ThrowTest3{

	static ArithmeticException e;

	public static void main(String[] args){
		 throw e;
	}
//Exception in thread "main" java.lang.NullPointerException
 //       at ThrowTest3.main(ThrowTest3.java:6)
}