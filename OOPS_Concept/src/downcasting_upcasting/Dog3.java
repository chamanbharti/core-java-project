package downcasting_upcasting;

class Animal3{
	
}

public class Dog3 extends Animal3 { // Dog inherits Animal
	
	public static void method(Animal3 a){
			
			Dog3 d = (Dog3) a;//downcasting
			System.out.println("ok downcasting performed");  
	}
	
	public static void main(String[] args) {
		
		Animal3 a = new Dog3();
		//Animal3 a = new Animal3();//ClassCastException
		Dog3.method(a);
	}

}
