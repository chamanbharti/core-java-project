package inner_class.methodlocal;

public class Test4 {
	
	public void m1(){
		//int x = 10;//local variable
		final int x = 10;//local variable
		class Inner{
			int y = 20;
			public void m2(){
				System.out.println(x);//Test4.java:10: local variable x is accessed from within inner class; 
									//needs to be declared final
                					//System.out.println(x);
				System.out.println(y);
			}
		}
		
		Inner i = new Inner();
		 i.m2();
	}
	
	public static void main(String[] args) {
		Test4 t = new Test4();
		t.m1();
	}

}
