package innerClass;
interface Eatable{
	void eat();
}
public class OuterClass3 {
	public static void main(String[] args) {
		Eatable e=new Eatable() {
			
			@Override
			public void eat() {
				System.out.println("Nice Fruits");
			}
		};
		
		e.eat();
	}
}