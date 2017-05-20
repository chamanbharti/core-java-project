package com.object.model;

public class JBTClass {
	static int j = 10;
	 
	public JBTClass() {
	i = j++;
	}
	 
	int i;
	 
	@Override
	public String toString() {
		return "Value of i :" + i;
	}

}

