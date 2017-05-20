package statickeyword;
class Animal
{  
	 void eat()
	 {
		 System.out.println("animal is eating1...");
	 }  
}  
  
class Dog extends Animal
{  
	 void eat()
	 {
		 System.out.println("dog is eating2...");
	 }  
  
	 public static void main(String args[])
	 {  
	  Animal a1=new Dog();  
	  //Dog a2=new Dog(); 
	  Animal a2=new Animal();  
	  a2.eat();  
	  a1.eat();
	 }  
}  