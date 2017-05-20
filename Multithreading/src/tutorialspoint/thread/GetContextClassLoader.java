package tutorialspoint.thread;

public class GetContextClassLoader implements Runnable{
	
	Thread t;
	public GetContextClassLoader() {

		t = new Thread(this);
		//this will call run() method
		t.start();
	}
	
	public void run(){
		//returns the context Class Loader for this Thread
		ClassLoader c = t.getContextClassLoader();
		
		//sets the context classloader for this thread
		t.setContextClassLoader(c);
		System.out.println("Class = "+c.getClass());
		System.out.println("Parent = "+c.getParent());
	}
	
	public static void main(String[] args) {
		
		new GetContextClassLoader();
	}

}
