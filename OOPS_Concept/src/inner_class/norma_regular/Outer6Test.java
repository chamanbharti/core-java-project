package inner_class.norma_regular;

class Outer6{

	class Inner6{//inner class
		
	 public void m1(){
		System.out.println("Inner class method");
	   }
	}
   }
public class Outer6Test{
public static void main(String[] args){
		Outer6 o = new Outer6();
		Outer6.Inner6 i = o.new Inner6();
		i.m1();
	}
}
