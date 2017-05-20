package innerClass;

	abstract class Person{
		abstract void eat();
	}
public class OuterClass2 {
		public static void main(String[] args) {
			Person p=new Person() {
				
				void eat() {
					System.out.println("Nice Fruit");
				}
			};
			
			p.eat();
		}

}
