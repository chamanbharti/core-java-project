package com.enum_package;

import java.lang.reflect.Method;

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
public class EnumDemo0 {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		//find how many methods are in Dictionary class
				int count = 0;
				Class c = Class.forName("java.lang.Enum");
				Method[] m1 = c.getDeclaredMethods();
				System.out.println("Method's name:");
				for(Method m2:m1){
					count++;
					System.out.println(m2.getName()+"()");
				}
				System.out.println("The number of method: "+count);
				
		// clone()
		System.out.println("Enum can never be cloned...");
		
		EnumDemo0 t = new EnumDemo0(){
			
			protected final Object clone() throws CloneNotSupportedException{
				throw new CloneNotSupportedException();
			}
		};
		
		System.out.println("CellPhone List:");
		for(Mobile m : Mobile.values()){
			System.out.println(m+" costs "+m.showPrice()+" dollars");
		}
	}

}
