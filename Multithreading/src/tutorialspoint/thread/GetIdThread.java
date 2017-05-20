package tutorialspoint.thread;

public class GetIdThread implements Runnable{

	Thread t;
	GetIdThread(){
		
		//thread created
		t=new Thread(this, "Admin Thread");
		
		//set thread priority
		t.setPriority(1);
		
		//prints thread created
		System.out.println("Thread = "+t);
		
		//this will call run() method
		t.start();
	}
	public void run(){
		
		//returns the identifier of this thread
		System.out.println("Name = "+t.getName());
		System.out.println("ID = "+t.getId());
		System.out.println("Thread = "+t.hashCode());
	}
	
	public static void main(String[] args) {
		new GetIdThread();
	}
}
