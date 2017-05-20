package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.SuiteTest.MessageUtil;

public class TestJUnit2 {
	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void addPrintMessage(){
		System.out.println("Inside testPrintMessage()");
		assertEquals(message, messageUtil.printMessage());
	}
}
