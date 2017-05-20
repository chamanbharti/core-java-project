package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.SuiteTest.MessageUtil;

public class TestJUnit3 {
	
	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void addSalutationMessage(){
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Robert";
		assertEquals(message, messageUtil.salutationMessage());
	}
}
