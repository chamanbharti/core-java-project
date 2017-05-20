package com.top10.exception.runtime;

import java.util.Enumeration;
import java.util.Vector;

public class NoSuchElementException2 {
	public static void main(String[] args) {
		Vector v = new Vector();
		//System.out.println(v.firstElement());
		Enumeration e = v.elements();
		System.out.println(e.nextElement());
	}

}
//Exception in thread "main" java.util.NoSuchElementException
/*
Exception in thread "main" java.util.NoSuchElementException: Vector Enumeration
        at java.util.Vector$1.nextElement(Unknown Source)
        at NoSuchElementException2.main(NoSuchElementException2.java:10)
*/