package com.TimeTest;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class TestJunit1 {
	   String message = "Robert";	
	   MessageUtil messageUtil = new MessageUtil(message);
	   
	   @Test(timeout=1000)
	   public void testPrintMessage() {	
	      System.out.println("Inside testPrintMessage()");  
	      messageUtil.printMessage();     
	   }
	   @Test
	   public void testSalutationMessage() {
	      System.out.println("Inside testSalutationMessage()");
	      message = "Hi!" + "Robert";
	      assertEquals(message,messageUtil.salutationMessage());
	   }

}
