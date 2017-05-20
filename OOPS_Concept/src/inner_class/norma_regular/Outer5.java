package inner_class.norma_regular;
class Outer5{

	class Inner5{//inner class
		
	 public void m1(){
		System.out.println("Inner class method");
	   }
	}
	public void m2(){
		Inner5 i = new Inner5();
		i.m1();
	}

public static void main(String[] args){
		Outer5 o = new Outer5();
		o.m2();
	}
	
	
}