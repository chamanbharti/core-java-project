package downcasting_upcasting;

class Animal4{
	
}

public class Dog4 extends Animal4 { // Dog inherits Animal
	
	public static void method(Animal4 a){
			
			if(a instanceof Dog4){
				Dog4 d = (Dog4) a;//downcasting
				System.out.println("ok downcasting performed");  
			}
	}
	
	public static void main(String[] args) {
		
		//Animal3 a = new Dog3();
		Animal4 a = new Animal4();//ClassCastException
		Dog4.method(a);
	}

}
