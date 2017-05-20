package com.javatpoint;

public class Test18 {
	public static void main(String[] args) {
		//Rule:1
		//If the superclass method does not declare an exception
		//Parent p = new Parent();
		//p.msg();
		
		//Parent pp = new Child();
		//pp.msg();
		
		//Rule:2
		//If the superclass method declares an exception
		
		/*Parent p = new Child();
		p.msg();*/
		
		Parent p = new Child();
		try {
			p.msg();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
