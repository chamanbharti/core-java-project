package tutorialspoint.threadlocal;

public class ThreadLocalDemo1 {
	public static void main(String[] args) {
		
		ThreadLocal tl = new ThreadLocal();
		System.out.println(tl.get());//null
		
		tl.set("Chaman");
		System.out.println(tl.get());//Chaman
		
		tl.remove();
		System.out.println(tl.get());//null
		
	}
	

}
