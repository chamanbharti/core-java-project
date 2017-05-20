package static_dynamicBinding;

public class Boy extends Human{
	public void walk(){
		System.out.println("Boy walks");
	}
	
	public static void main(String[] args) {
		//Reference is of parent class
		Human myobj=new Boy();
		myobj.walk();
		myobj.walk();
		Boy myobj2=new Boy();
		myobj2.walk();
		myobj2.walk();
		Human myobj3=new Human();
		myobj3.walk();
		myobj3.walk();
		//Human myobj2=new Human();
		//myobj2.walk();
	}

}
