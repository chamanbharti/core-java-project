package inner_class.anonymousclass;

class MyThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
}
public class ThreadDemo{
	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		t.start();//start child thread
		
		//execute main thread iteration
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
		
	}
	
}