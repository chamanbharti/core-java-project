package com.enum_package;
/*
 * The java.lang.Enum class is the common base class of all Java language enumeration types.
Class declaration
Following is the declaration for java.lang.Enum class:
public abstract class Enum<E extends Enum<E>>extends Object implements Comparable<E>, Serializable
Class constructors
S.N.	Constructor & Description
1	protected Enum(String name, int ordinal)
This is the single constructor.

 */
//enum showing topics covered under Tutorials
enum Tutorials{
	topic1,topic2,topic3;
}
enum newEnum{
	M{},
	N{};
}
public class EnumDemo1 {
	
	public static void main(String[] args) {
		
		// clone()
		System.out.println("********clone()******");
		System.out.println("Enum can never be cloned...");
		
		EnumDemo1 t = new EnumDemo1(){
			
			protected final Object clone() throws CloneNotSupportedException{
				throw new CloneNotSupportedException();
			}
		};
		
		System.out.println("CellPhone List:");
		for(Mobile m : Mobile.values()){
			System.out.println(m+" costs "+m.showPrice()+" dollars");
		}
		// compareTo()
		System.out.println("********compareTo()******");
		Tutorials t1,t2,t3;
		t1 = Tutorials.topic1;
		t2 = Tutorials.topic2;
		t3 = Tutorials.topic3;
		
		if(t1.compareTo(t2) > 0){
			System.out.println(t2+" completed before "+t1);
		}
		if(t1.compareTo(t2) < 0){
			System.out.println(t1+" completed before "+t2);
		}
		if(t1.compareTo(t3) == 0){
			System.out.println(t2+" completed with "+t3);
		}
		
		// equals()
		System.out.println("********equals()******");
		if(t1.equals(t2)) {
	        System.out.println(t1 + " is equal to " + t2); 
	     }
	    
	     else if(t2.equals(t3)) {
	        System.out.println(t2 + " is equal to " + t3); 
	     }
	    
	     else if(t1.equals(t3)) { 
	        System.out.println(t1 + " is equal to " + t3); 
	     }
	    
	     else {
	        System.out.println("all 3 topics are different"); 
	     }
		// finalize()
		System.out.println("********finalize()******");
		 System.out.println("enum class cannot have finalize methods...");       
	     EnumDemo1 tt = new EnumDemo1() {
	        protected final void finalize() { }    
	     }; 

	     System.out.println("CellPhone List:");
	     for(Mobile m : Mobile.values()) {
	        System.out.println(m + " costs " + m.showPrice() + " dollars");
	     } 
	     
	     // getDeclaringClass()
	     System.out.println("********getDeclaringClass()******");
	     /* returns the Class object corresponding to this enum
	     constant's enum type */
	     System.out.println(newEnum.M.getDeclaringClass());  
	     
	     // hashCode()
	     System.out.println("********hashCode()******");
	     System.out.print("Programming in "+Mobile.Samsung.toString());
	     System.out.println(", Hashcode = "+Mobile.Samsung.hashCode());
	     System.out.print("Programming in "+Mobile.Nokia.toString());
	     System.out.println(", Hashcode = "+Mobile.Nokia.hashCode());
	     
	     // name()
	     System.out.println("********name()******");
	     Mobile ret = Mobile.Motorola;
	     System.out.println("Motorola Name = "+ret.name());
	     
	     // ordinal()
	     System.out.println("********ordinal()******");
	     Mobile rett = Mobile.Samsung;
	     System.out.println("The ordinal is = "+rett.ordinal());
	     System.out.println("Mobile Name = "+rett.name());
	     
	     // toString()
	     System.out.println("********toString()******");
	     System.out.println("Programming in "+Mobile.Motorola.toString());
	     
	     // valuesOf()
	     System.out.println("********valuesOf()******");
	     Mobile rettt;
	     rettt = Mobile.valueOf("Samsung");
	     System.out.println("Selected :"+rettt);
	}

}
