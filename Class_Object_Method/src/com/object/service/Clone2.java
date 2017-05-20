package com.object.service;

import com.object.model.JBTClassClone;

public class Clone2 {
	public static void main(String[] args) {
		JBTClassClone obj1 = new JBTClassClone();
		System.out.println(obj1);
		
		try {
		JBTClassClone obj2 = (JBTClassClone) obj1.clone();
		System.out.println(obj2);
		
		} catch (CloneNotSupportedException e) {
		e.printStackTrace();
		}
		
	}

	}
