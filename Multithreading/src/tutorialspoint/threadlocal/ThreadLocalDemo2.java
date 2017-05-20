package tutorialspoint.threadlocal;

public class ThreadLocalDemo2 {
	public static void main(String[] args) {
		
		ThreadLocal tl = new ThreadLocal(){
			public Object initialValue(){
				return "abc";
			}
		};
		System.out.println(tl.get());//abc
		
		tl.set("Chaman");
		System.out.println(tl.get());//Chaman
		
		tl.remove();
		System.out.println(tl.get());//abc
		
	}
	

}
