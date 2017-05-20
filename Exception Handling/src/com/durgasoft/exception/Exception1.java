	
public class Exception1{
	public static void main(String args[]){

		
		doStuff();
		System.out.println(10/0);
	}
	public static void doStuff(){
		doMoreStuff();
		System.out.println("HI");
	}
	public static void doMoreStuff(){
		System.out.println("Hello");
		//System.out.println(10/0);
	}
}