package polymorphism;

public class MethodOverloading {
	
	static int add(int a,int b)throws NullPointerException{
		return a+b;
	}
	static int add(int a,int b,int c)throws Exception{
		return a+b+c;
	}
	public static void main(String[] args) throws Exception{
		//System.out.println(add(11,11));
		System.out.println(MethodOverloading.add(11,11));
		System.out.println(MethodOverloading.add(11,11,11));
		
	}

}
