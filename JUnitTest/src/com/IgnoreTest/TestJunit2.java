package com.IgnoreTest;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
@Ignore
public class TestJunit2 {
	   String message = "Robert";	
	   MessageUtil messageUtil = new MessageUtil(message);
	   
	   
	   @Test
	   public void testPrintMessage() {	
	      System.out.println("Inside testPrintMessage()");  
	      message = "Robert";
	      assertEquals(message, messageUtil.printMessage());     
	   }
	   @Test
	   public void testSalutationMessage() {
	      System.out.println("Inside testSalutationMessage()");
	      message = "Hi!" + "Robert";
	      assertEquals(message,messageUtil.salutationMessage());
	   }

}