package Interface8;

interface Clickable{
	default void click(){
		System.out.println("click");
	}
	default void print(){
		System.out.println("Clickable");
	}
}
