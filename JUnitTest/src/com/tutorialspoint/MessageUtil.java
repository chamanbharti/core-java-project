package com.tutorialspoint;
//This class prints the given message on console.

public class MessageUtil {

  private String message;
  //Constructor
  //@param message to be printed
	public MessageUtil(String message) {
		this.message = message;
	}

	// prints the message
	   public String printMessage(){
	      System.out.println(message);
	      return message;
	   }   

	public Object salutationMessage() {
		// TODO Auto-generated method stub
		return null;
	}

}
