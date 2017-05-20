package com.top10.exception.runtime;

import java.util.Vector;

public class NoSuchElementException {
	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println(v.firstElement());
	}

}
//Exception in thread "main" java.util.NoSuchElementException