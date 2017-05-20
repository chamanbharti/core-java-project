package hashcode_equal;

public class DoubleEqualsOperator {
	
	public static void main(String args[]){  
		
		   String r1="Chaman";  
		   String r2="Chaman";  
		   String r3=new String("Chaman");  
		   
		   //The = = operator compares references not values.
		   System.out.println(r1==r2);//true (because both refer to same instance)  
		   System.out.println(r1==r3);//false(because s3 refers to instance created in nonpool)  
		   
		 }  

}
