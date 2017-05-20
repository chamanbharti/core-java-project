package hashcode_equal;

public class EqualCompareDemo {
	
	public static void main(String args[]){  
		
		   String r1="chaman";  
		   
		   String r2="chaman";  
		   
		   String r3=new String("chaman");  
		   
		   String r4="bharti";  
		   
		   //String compare by equals() method
		   System.out.println("#####equals()#####");
		   System.out.println( r1.equals(r2) );//true  
		   System.out.println( r1.equals(r3) );//true  
		   System.out.println( r1.equals(r4) );//false  
		   
		   // String compare by == operator
		   System.out.println("##### == #####");
		   System.out.println( r1 == r2 );//true (because both refer to same instance)  
		   System.out.println( r1 == r3 );//false(because s3 refers to instance created in nonpool)  
		   System.out.println( r1 == r4 );//false (because r1 and r4 both are different instance
		   
		   	//1.	If r1 == r2 is true then r1.equals(r2) is always true.
		    System.out.println("##### r1 == r2 and r1.equals(r2) #####");
		    System.out.println( r1 == r2 );//true
		    System.out.println( r1.equals(r2) );//true  
		    
		    //	If r1 == r2 is true then both hashcode are always same.
		    System.out.println("##### r1 and r2 of hashcode #####");
		    System.out.println( r1.hashCode() );//-1361637570
		    System.out.println( r2.hashCode() );//-1361637570
		    
		    //2.	If r1 == r4 is false then r1.equals(r4) is always true/false.
		    System.out.println("##### r1 == r4 and r1.equals(r3) #####");
		    System.out.println( r1 == r4 );//false
		    System.out.println( r1.equals(r4) );//true or false it depends on your instance are from string constant pool or heap area   
		    
		    //	If r1 == r4 is false then both hashcode are always different.
		    System.out.println("##### r1 and r4 of hashcode #####");
		    System.out.println( r1.hashCode() );//-1361637570
		    System.out.println( r4.hashCode() );//-1390261332
		    
		    //3.	If r1.equals(r2) is true then r1 == r2 it may always return true/false.
		    System.out.println("##### r1.equals(r3) and r1 == r2  #####");
		    System.out.println( r1.equals(r3) );//true  
		    System.out.println( r1 == r3 );//false
		    
		    //	If r1.equals(r3)  is true then both hashcode may return same or not.
		    System.out.println("##### r1 and r3 of hashcode #####");
		    System.out.println( r1.hashCode() );//-1361637570
		    System.out.println( r3.hashCode() );//-1361637570
		    
		    //4.	If r1.equals(r4) is false then r1 == r4 is always false.
		    System.out.println("##### r1.equals(r4) and r1 == r4  #####");
		    System.out.println( r1.equals(r4) );//true  
		    System.out.println( r1 == r4 );//false
		    
		    //  If r1.equals(r4)  is false then both hashcode always different.
		    System.out.println("##### r1 and r4 of hashcode #####");
		    System.out.println( r1.hashCode() );//-1361637570
		    System.out.println( r4.hashCode() );//-1361637570
		 }  

}
