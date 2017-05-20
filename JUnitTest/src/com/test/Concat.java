package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Concat {

	@Test
	public void Concatetest() {
		MyJUnitClass junit=new MyJUnitClass();
		String result=junit.Concate("Hello", "World");
		assertEquals("HelloWorld", result);
	}

}
