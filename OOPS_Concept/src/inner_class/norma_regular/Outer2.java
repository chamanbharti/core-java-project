package inner_class.norma_regular;
class Outer2{
	static int x=5;
	class Inner2{
		int y=10;
	
	}

	
	public static void main(String[] args){
		System.out.println("Outer class method");
		Outer2 o = new Outer2();
		Inner2 i = o.new Inner2();
		System.out.println(i.y);
		System.out.println(x);
	}
	
}