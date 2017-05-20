package inner_class.anonymousclass;

public class ThreadDemo5{
	public static void main(String[] args) {
		
		System.out.println("Annonymous inner class using Argument");
		//Annonymous inner class using Argument
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Child Thread");
				}
				
			}
		});
		t.start();
		//execute main thread iteration
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
		
	}
	
}