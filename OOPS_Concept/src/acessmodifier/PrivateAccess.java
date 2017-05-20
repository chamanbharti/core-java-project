package acessmodifier;

public class PrivateAccess {
	/*PrivateAccess(){System.out.println("private constructor");}//private constructor
	public void msg(){
		System.out.println("Hello constructor");
	}*/
	private int data=40;
	private PrivateAccess(){System.out.println("private constructor");}//private constructor
	private void msg(){
			System.out.println("Hello constructor");
		}
	
	
}
