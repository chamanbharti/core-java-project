package inner_class.methodlocal;

public class Test8 {
	
	private int x = 30;//instance variable 
	
	void display(){
		 int value=50;//local variable must be final till jdk 1.7 only  
		//illegal modifier for parameter y;only final is permitted
		//private int y = 40;//local variable 
		//protected int y = 40;//local variable 
		//public int y = 40;//local variable 
		//Rule: Local variable can't be private, public or protected.
		//illegal modifier for local class Local;only abstract or final is permitted
		//public/private/protected class Local{
		class Local{
			private int y = 40;//local variable 
			void msg(){
				int z = 50;
				System.out.println(x);//30
				System.out.println(y);//40
				System.out.println(z);
				System.out.println(value);
			}
		}
		Local l = new Local();
		l.msg();
	}
	
	public static void main(String[] args) {
		Test8 t = new Test8();
		t.display();
	}
}
