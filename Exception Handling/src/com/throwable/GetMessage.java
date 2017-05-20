package com.throwable;
//public String getMessage()
public class GetMessage {
	public static void main(String[] args) throws Throwable{
		try{
			newException();
		}catch(Throwable e){
			System.err.println(e);
			//returns the details message string of this throwable instance
			System.out.println(e.getMessage());
		}
		
	}

	private static void newException() throws Exception {
		System.out.println("This is newException() function");
		throw new Exception("new Exception...");
	}

}
