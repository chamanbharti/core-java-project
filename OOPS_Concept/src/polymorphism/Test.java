package polymorphism;

class Animal {
	int health = 100;
}

class Mammal extends Animal { }

class Cat extends Mammal { }

class Dog extends Mammal { }

public class Test {	 
	 public static void main(String[] args) {
		/* Cat c = new Cat();
		 System.out.println(c.health);
		 Dog d = new Dog();
		 System.out.println(d.health);*/
		 
		 //Let's look at object's code before and after upcasting:
		 Cat c = new Cat();
		 System.out.println(c);//Cat@2a139a55
		 Mammal m = c;//upcasting
		 System.out.println(m);//Cat@2a139a55
		 
		 //Although there's no need to for programmer to upcast manually, it's allowed to do.
		 Mammal m2 = (Mammal)new Cat();
		 //is equal to
		 Mammal m3 = new Cat();
		 System.out.println(m2);
		 System.out.println(m3);
		 //But downcasting must always be done manually:
		 Cat c1 = new Cat();
		 Animal a = c1;//automatic upcasting to Animal
		 Cat c2 = (Cat)a;//manual downcasting back to a Cat
		 System.out.println(a);
		 System.out.println(c2);
		 
		 Cat c3 = new Cat();		 
		    Animal a2 = c3;		 //upcasting to Animal
		    if(a instanceof Cat){ // testing if the Animal is a Cat
		        System.out.println("It's a Cat! Now i can safely downcast it to a Cat, without a fear of failure.");        
		        Cat c4 = (Cat)a2;
		        System.out.println(c3);
		        System.out.println(c4);
		        System.out.println(a2);
		    }
		    
		    Mammal m4 = new Mammal();
		    Cat c5 = (Cat)m4;
		    System.out.println(m4);//java.lang.ClassCastException: polymorphism.Mammal cannot be cast to polymorphism.Cat
		    System.out.println(c5);
	 }  
}
 
