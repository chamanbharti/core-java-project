package inner_class.norma_regular;

public class Outer7{
	int x = 10;
	static int y = 20;

	class Inner7{//inner class
		
	 public void m1(){
		System.out.println("Inner class method");
		System.out.println("Outer instance x:"+x);
		System.out.println("Outer static member:"+y);
	   }
	}
	
public static void main(String[] args){
		Outer7 o = new Outer7();
		Outer7.Inner7 i = o.new Inner7();
		i.m1();
	}
	
	
}