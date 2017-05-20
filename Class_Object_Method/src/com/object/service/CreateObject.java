package com.object.service;

import com.object.model.JBTClass;

public class CreateObject {
	public static void main(String[] args) {
		try{
			Class cls=Class.forName("com.method.model.JBTClass");
			JBTClass obj=(JBTClass)cls.newInstance();
			JBTClass obj2=(JBTClass)cls.newInstance();
			System.out.println(obj);
			System.out.println(obj2);
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(InstantiationException e){
			e.printStackTrace();
		}catch(IllegalAccessException e){
			e.printStackTrace();
		}
	}
	

}
