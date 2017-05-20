package inner_class.anonymousclass;

public class Test {
	public static void main(String[] args) {
		
		Popcorn p = new Popcorn(){
			public void taste() {
				System.out.println("Spicy");
			}
		};
		p.taste();//Spicy
		
		Popcorn p1 = new Popcorn(){
			public void taste() {
				System.out.println("Sweet");
			}
		};
		p1.taste();//Sweet
		Popcorn p2 = new Popcorn();
		p2.taste();//Salty
		
		//Know the name of Class
		System.out.println(p.getClass().getName());//Test$1
		System.out.println(p1.getClass().getName());//Test$1
		System.out.println(p2.getClass().getName());//Popcorn
	}
}
