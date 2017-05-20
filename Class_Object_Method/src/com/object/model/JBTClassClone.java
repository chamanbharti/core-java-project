package com.object.model;

public class JBTClassClone implements Cloneable {
	
	@Override
	public Object clone() throws CloneNotSupportedException {
	return super.clone();
	}
		
	static int j = 10;
	 
	public JBTClassClone() {
	i = j++;
	}
	 
	int i;
	 
	@Override
	public String toString() {
		return "Value of i :" + i;
	}

}

