package hashcode_equal;

public class EqualsDemo {
	
	public static void main(String args[]){  
		
		String r1="chaman";  
		String r2="chaman";  
		String r3="CHAMAN";  
		String r4="bharti";  
		
		System.out.println(	r1.equals(r2)	);//true because content and case is same  
		System.out.println(	r1.equals(r3)	);//false because case is not same  
		System.out.println(	r1.equals(r4)	);//false because content is not same  
		
		}

}
