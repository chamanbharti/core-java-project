public class ThrowTest4{


	public static void main(String[] args){
		System.out.println(10/0);
		System.out.println("Hello");
	}

}/*RE:Exception in thread "main" java.lang.ArithmeticException: / by zero
        at ThrowTest4.main(ThrowTest4.java:5)*/