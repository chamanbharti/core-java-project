package hashcode_equal;

public class EqualsIgnoreCaseDemo {

public static void main(String args[]){  
		
		String r1="chaman";  
		String r2="chaman";  
		String r3="CHAMAN";  
		String r4="bharti";  
		
		System.out.println(	r1.equalsIgnoreCase(r2)	);////true because content and case both are same   
		System.out.println(	r1.equalsIgnoreCase(r3)	);////true because case is ignored  
		System.out.println(	r1.equalsIgnoreCase(r4)	);//false because content is not same  
		
		}
}
