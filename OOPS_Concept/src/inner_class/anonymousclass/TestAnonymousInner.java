package inner_class.anonymousclass;

abstract class Person{
	abstract void eat();
}
public class TestAnonymousInner {
	public static void main(String[] args) {
		Person p = new Person() {
			
			@Override
			void eat() {
				System.out.println("Nice fruit");
				
			}
		};
		p.eat();
	}

}
