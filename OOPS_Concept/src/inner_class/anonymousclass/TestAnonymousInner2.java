package inner_class.anonymousclass;

interface Eatable{
	abstract void eat();
}
public class TestAnonymousInner2 {
	public static void main(String[] args) {
		Eatable e = new Eatable() {
			
			@Override
			public void eat() {
				System.out.println("Nice fruits");
				
			}
		};
		e.eat();
	}

}
