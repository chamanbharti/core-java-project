package downcasting_upcasting;

public class Test0 {
	public static void main(String[] args) {
		
		Thread t = new Thread();
		System.out.println(t instanceof Thread);//true
		System.out.println(t instanceof Object);//true
		System.out.println(t instanceof Runnable);//true 
		//System.out.println(t instanceof String);//CE
																/*                Object   Runnable(I)
																					|     /
																					Thread
																				*/
	}

}
