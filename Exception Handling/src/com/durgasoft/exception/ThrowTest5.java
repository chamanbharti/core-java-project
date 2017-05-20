public class ThrowTest5{


	public static void main(String[] args){
		throw new ArithmeticException("/by zero");
		System.out.println("Hello");
	}

}
/*CE:ThrowTest5.java:6: unreachable statement
                System.out.println("Hello");
                ^
1 error*/