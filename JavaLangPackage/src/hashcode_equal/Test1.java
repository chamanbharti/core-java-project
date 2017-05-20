package hashcode_equal;

public class Test1 {
	int i;
	Test1(int i){
		this.i=i;
	}
	
	public static void main(String[] args) {
		Test1 t1 = new Test1(10);
		Test1 t2 = new Test1(100);
		
		System.out.println(t1);
		System.out.println(t2);//hashcode_equal.Test1@6d06d69c
		//internal details:
		/*
		Object==> toString()
				    ||
	    Object==>  hashCode()
	    */
	}

}
