package static_nonstatic;

public class StaticClass {
	static class X{
		static String str="Inside Class X";
	}
	
	public static void main(String[] args) {
		X.str="Inside Class StaticClass";
		System.out.println("String stored in str is "+X.str);
	}
}
