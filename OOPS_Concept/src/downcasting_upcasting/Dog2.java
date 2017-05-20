package downcasting_upcasting;

class Animal2{
	
}

public class Dog2 extends Animal2 { // Dog inherits Animal
	
	public static void method(Animal2 a){
		if(a instanceof Dog2){
			
			Dog2 d = (Dog2) a;//downcasting
			System.out.println("ok downcasting performed");  
		}
	}
	
	public static void main(String[] args) {
		
		Animal2 a = new Dog2();
		Dog2.method(a);
	}

}
