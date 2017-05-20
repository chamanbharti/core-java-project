package inner_class.anonymousclass;
/*
class MyThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
}*/
public class ThreadDemo2{
	public static void main(String[] args) {
		
		/*MyThread t = new MyThread();
		t.start();//start child thread
		*/	
		//Anonymous thread class
		Thread t = new Thread(){
			
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Child Thread");
				}
			}
		};
		t.start();
		//execute main thread iteration
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
		
	}
	
}