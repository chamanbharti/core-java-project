package acessmodifier;

public class ProtectedModifier {
	
	protected int data=50;
	protected void msg(){
		System.out.println("Hello protected modifier");
	}
	protected ProtectedModifier() {
		System.out.println("Hello protected modifier constructor");
	}

}
