
public class Test1 {
	public static void main(String[] args) {
		Student s1=new Student();
		Class c1=s1.getClass();
		
		Student s2=new Student();
		Class c2=s2.getClass();
		
		System.out.println(c1.hashCode());//705927765
		System.out.println(c2.hashCode());//705927765
		System.out.println(c1==c2);//true
		System.out.println(c1.equals(c2));//true
	}

}
