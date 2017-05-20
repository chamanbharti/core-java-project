class TwoGen<T,V>{
	T ob1;
	V ob2;
	
	TwoGen(T o1,V o2){
		ob1=o1;
		ob2=o2;
	}
	
	T getob1(){
		return ob1;
	}
	V getob2(){
		return ob2;
	}
	void showType(){
		System.out.println("Type of T is: "+ob1.getClass().getName());
		System.out.println("Type of V is: "+ob2.getClass().getName());
	}
}
public class TwoGenDemo {
	public static void main(String[] args) {
		//TwoGen<Integer, String>tgob=new TwoGen<Integer, String>(88, "Generics");
		TwoGen<String, String>tgob=new TwoGen<String, String>("Chaman", "Generics");
		tgob.showType();
		//int v=tgob.getob1();
		String t=tgob.getob1();
		System.out.println("Value of T: "+t);
		//String str=tgob.getob2();
		String v=tgob.getob2();
		System.out.println("Value of V: "+v);
	}

}
