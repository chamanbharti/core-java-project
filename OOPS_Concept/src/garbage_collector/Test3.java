package garbage_collector;

class Student{}
public class Test3 {
	
	public static void main(String[] args) {
		
		Student s = m1(); 
		System.out.println("all reference variable gone by gc()");
	}

	private static Student m1() {
		
		Student s1=new Student();
		Student s2=new Student();
		return s1;
	}
	

}
