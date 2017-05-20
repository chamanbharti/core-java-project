package tutorialspoint.threadlocal;

class ParentThread extends Thread{

	//static ThreadLocal tl = new ThreadLocal();
	//static InheritableThreadLocal tl = new InheritableThreadLocal();
	static InheritableThreadLocal tl = new InheritableThreadLocal(){
		public Object childValue(Object p){
			return "CC";
		}
	};
	
	public void run(){
		
		tl.set("PP");
		System.out.println("Parent Value "+tl.get());
		
		ChildThread ct = new ChildThread();
		ct.start();
	}
}
class ChildThread extends Thread{
	public void run(){
		System.out.println("Child Value "+ParentThread.tl.get());
		
	}
}
public class ThreadLocalDemo4 {
	public static void main(String[] args) {
		
		ParentThread pt=new ParentThread();
		pt.start();
		
		
		
		
	}
	

}
