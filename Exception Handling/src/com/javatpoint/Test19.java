package com.javatpoint;

public class Test19 {
	
	static void validate(int age) throws InvalidAgeException{  
	    /* if(age<18)
			try {
				throw new InvalidAgeException("not valid");
			} catch (InvalidAgeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		else  
	      System.out.println("welcome to vote");  */
		if(age<18)  
		      throw new InvalidAgeException("not valid");  
		     else  
		      System.out.println("welcome to vote");  
	   }  
	     
	   public static void main(String args[]) throws InvalidAgeException{  
	      /*try{  
	      validate(13);  
	      }catch(Exception m){System.out.println("Exception occured: "+m);}  */
		
		  validate(13);  
	      System.out.println("rest of the code...");  
	  }  
}
