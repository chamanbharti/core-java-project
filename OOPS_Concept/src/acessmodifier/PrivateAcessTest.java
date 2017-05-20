package acessmodifier;

public class PrivateAcessTest {
	public static void main(String[] args) {
		PrivateAccess pa=new PrivateAccess();
		System.out.println(pa.data);
		pa.msg();
	}

}
