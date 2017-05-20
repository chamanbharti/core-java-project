package inner_class.anonymousclass;

class MyRunnable implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
}
public class ThreadDemo3{
	public static void main(String[] args) {
		System.out.println("Annonymous inner class using Thread");
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);//target runnable
		t.start();//start child thread
		
		//execute main thread iteration
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
		
	}
	
}