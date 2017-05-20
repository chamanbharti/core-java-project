package static_dynamicBinding;
/* Binding:Connecting a method call to the method body is known as Binding
 * Binding are two types:1.static binding(early binding). 2. dynamic binding(late binding);
 * Static Binding: when the type of object is determined at compile time(by compiler), it is known as Static Binding.
 * If there is any private,final or static method in a class, there is static binding.
 * DYNAMIC BINDING:WHEN THE TYPE OF OBJECT IS DETERMINED AT RUNTIME, IT IS KNOWN AS DYNAMIC BINDING OR LATE BINDING.
 *  */
public class Dynamic extends Static{
	void run(){
		System.out.println("Dynamic binding started");
	}
	
	public static void main(String[] args) {
		Static s=new Dynamic();
		s.run();
	}
}
