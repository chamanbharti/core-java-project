package statickeyword;

public class StaticInnerClass1 {
	static int data=30;
	
	static class Inner{
		void msg(){
			System.out.println("Data is "+data);
		}
	}
	
	public static void main(String[] args) {
		StaticInnerClass1.Inner obj=new StaticInnerClass1.Inner();
		obj.msg();
	}

}
