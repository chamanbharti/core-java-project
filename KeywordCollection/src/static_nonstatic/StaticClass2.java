package static_nonstatic;

public class StaticClass2 {
	int num;
	//static class
	static class X{
		static String str="Inside Class X";
		num=99;
	}
	
	public static void main(String[] args) {
		StaticClass2.X obj=new StaticClass2.X();
		System.out.println("Value of num="+obj.str);
	}
}
