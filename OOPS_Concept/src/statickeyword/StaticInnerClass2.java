package statickeyword;

public class StaticInnerClass2 {
	//static int data=30;
	//private static int data=30;
	protected static int data=30;
	
	static class Inner{
		static void msg(){
			System.out.println("Data is "+data);
		}
	}
	
	public static void main(String[] args) {
		StaticInnerClass2.Inner.msg();//no need to create the instance of static nested class  
		//obj.msg();
	}

}
