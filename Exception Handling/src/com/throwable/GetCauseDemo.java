package com.throwable;
//public Throwable getCause()
public class GetCauseDemo {
	
	public static void main(String[] args) throws Throwable {
		
		System.out.println("\t ****Throwable Exception Class Demo****");
		
		//public Throwable getCause()
		/*This method returns the cause of this throwable or null if the cause is nonexistent or 
		 unknown*/
		System.out.println(" \t ****public Throwable getCause()****");
		
		try{
			newException();
		}catch(Throwable e){
			System.err.println(e);
			//returns null as the cause is nonexistent or unkown.
			System.out.println("Cause = " + e.getCause());
		}
		
	}

	private static void newException() throws Exception {
		System.out.println("This is newException()");
		throw new Exception("Exception:");
		
	}

	

}
