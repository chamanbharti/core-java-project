package hashcode_equal;

public class Test3 {
	int i;
	Test3(int i){
		this.i=i;
	}
	
	public String toString(){
		return i+"";
	}
	
	public int hashCode(){
		//return i;
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + i;
		return result;
	}
	
	public static void main(String[] args) {
		Test3 t1 = new Test3(10);
		Test3 t2 = new Test3(100);
		
		System.out.println(t1);//hashcode_equal.Test2@a
		System.out.println(t2);//hashcode_equal.Test2@64
		//internal details:
		/*
		Test3==> toString()
				    ||
	    Test3==>  hashCode()
	    */
	}

}
