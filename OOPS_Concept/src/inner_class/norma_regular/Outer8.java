package inner_class.norma_regular;

public class Outer8 {
	int x =10;
	private class Inner{
		int x = 100;
		public void m1(){
			int x = 1000;
			System.out.println("Inner method's Local variable:"+x);//1000
			//System.out.println("Inner class variable:"+this.x);//1000
			System.out.println("Inner class variable:"+Inner.this.x);//1000
			System.out.println("Outer class variable:"+Outer8.this.x);//1000
		}
		
	}
	public static void main(String[] args) {
		new Outer8().new Inner().m1();
	}

}
