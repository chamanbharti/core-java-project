package hashcode_equal;

public class StringStringBufferStringBuilder {
	
	public static void main(String args[]){  
		
		   // String
		   String r1 = new String("Chaman");  
		   String r2 = new String("Chaman");  
		   
		   // check equality through equals() and == 
		   System.out.println( r1.equals(r2) );//true (because both refer to same instance)  
		   System.out.println( r1 == r2 );//false
		   
		  //StringBuffer 
		   StringBuffer r3 = new StringBuffer("Chaman");  
		   StringBuffer r4 = new StringBuffer("Chaman");  
		   
		   System.out.println( r3.equals(r4) );//false(because r3 and r4 is not string)  
		   System.out.println( r3 == r4 );//false
		   
		   //StringBuilder
		   StringBuilder r5 = new StringBuilder("Chaman");
		   StringBuilder r6 = new StringBuilder("Chaman"); 
		   
		   System.out.println( r5.equals(r6) );//false(because r5 and r6 is not string)  
		   System.out.println( r5 == r6 );//false
		   
		   // think over it 
		   //System.out.println( r1 == r3 );//CE:incompatible types:java.lang.String and java.lang.StringBuffer
		   System.out.println( r1.equals(r3));//false
		   
		  // System.out.println( r1 == r5 );//CE:incompatible types:java.lang.String and java.lang.StringBuffer
		   System.out.println( r1.equals(r5));//false
		   
		 }  

}
