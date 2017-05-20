package covariant;

public class B extends A {
	B get(){
		return this;
	}
	void message(){
		System.out.println("Welcome to covariant return type");
	}
	
	public static void main(String[] args) {
		new B().get().message();
	}

}
