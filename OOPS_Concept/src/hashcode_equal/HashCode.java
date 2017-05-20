package hashcode_equal;

public class HashCode {

	public static void main(String args[]){  
		
		   String r1="Chaman";  
		   String r2="Chaman";  
		   String r3=new String("Chaman");  
		   
		   // hashcode of r1, r2 and r3
		   System.out.println( r1==r2 );//true (because both refer to same instance)  
		   System.out.println( "r1="+r1.hashCode() + " r2:"+r2.hashCode() );
		   
		   System.out.println(r1==r3);//false(because r3 refers to instance created in nonpool)  
		   System.out.println( "r1="+r1.hashCode() + " r3:"+r3.hashCode() );
		   
	}  

}
