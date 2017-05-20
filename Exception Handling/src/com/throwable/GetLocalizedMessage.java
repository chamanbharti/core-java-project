package com.throwable;
//public String getLocalizedMessage()
public class GetLocalizedMessage {
	
	public static void main(String[] args)throws Throwable {
		
		try{
			newException();
		}catch(Throwable e){
			System.err.println(e);
			// localized description of this throwable
			System.out.println(e.getLocalizedMessage());
		}
	}

	private static void newException() throws Exception {
		System.out.println("This is new newException() function ");
		throw new Exception("new Exception");
		
	}

}
