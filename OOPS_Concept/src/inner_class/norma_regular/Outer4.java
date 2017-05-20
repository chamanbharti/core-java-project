package inner_class.norma_regular;
class Outer4{

	class Inner4{
		
	 public void m1(){
		System.out.println("Inner class method");
	   }
	}

public static void main(String[] args){
		//step 1
		/*Outer4 o = new Outer4();
		Outer4.Inner4 i = o.new Inner4();
		i.m1();*/
	
		//step 2
		/*Outer4.Inner4 i = new Outer4.Inner4();
		i.m1();*/
	
		//step 3
		new Outer4().new Inner4().m1();
	}
	
	
}