package inner_class.anonymousclass;

/*class MyRunnable implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
}*/
public class ThreadDemo4{
	public static void main(String[] args) {
		
		/*MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);//target runnable
		t.start();//start child thread
		 */	
		System.out.println("Annonymous inner class using Runnable");
		//Using Annonymous inner class
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Child Thread");
				}
			}
		};
		Thread t = new Thread(r);
		t.start();
		
		//execute main thread iteration
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
		
	}
	
}