package downcasting_upcasting;

class Animal{
	
}

public class Dog extends Animal { // Dog inherits Animal
	
	public static void main(String[] args) {
		
		Dog d = new Dog();
		Dog d1 = null;
		
		System.out.println(d instanceof Animal);// true
		System.out.println(d instanceof Dog);// true
		
		System.out.println(d1 instanceof Animal);// false
	}

}
