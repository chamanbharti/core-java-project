package static_dynamicBinding;
/* Binding:Connecting a method call to the method body is known as Binding
 * Binding are two types:1.static binding(early binding). 2. dynamic binding(late binding);
 * Static Binding: when the type of object is determined at compile time(by compiler), it is known as Static Binding.
 * If there is any private,final or static method in a class, there is static binding.
 *  */
public class Static {
	static void run(){
		System.out.println("Static binding started");
	}
	
	public static void main(String[] args) {
		//Static s=new Static();
		run();
	}
}
