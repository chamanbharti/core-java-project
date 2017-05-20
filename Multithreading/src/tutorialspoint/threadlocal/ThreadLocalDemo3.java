package tutorialspoint.threadlocal;
class CustomerThread extends Thread{
	
	private static Integer custId=0;
	
	private static ThreadLocal tl = new ThreadLocal(){
		public Integer initialValue(){
			return ++custId;
		}
	};
	
	CustomerThread(String name){
		super();
	}
	public void run(){
		System.out.println(Thread.currentThread().getName()+" Executing with Customer Id:"+tl.get());
	}
}
public class ThreadLocalDemo3 {
	public static void main(String[] args) {
		
		CustomerThread c1 = new CustomerThread("Customer Thread-1");
		CustomerThread c2 = new CustomerThread("Customer Thread-2");
		CustomerThread c3 = new CustomerThread("Customer Thread-3");
		CustomerThread c4 = new CustomerThread("Customer Thread-4");
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		
		
		
	}
	

}
