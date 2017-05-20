package com.tostring;

public class Test3 {
		
		int rollno;
		String name;
		String city;
		
		Test3(int rollno,String name,String city){
			this.rollno = rollno;
			this.name = name;
			this.city = city;
	   }
	   
		public String toString(){
			return getClass().getName()+"@"+Integer.toHexString(hashCode());
		}
		public static void main(String[] args) {
		   Test3 s1=new Test3(101,"Raj","lucknow");  
		   Test3 s2=new Test3(102,"Vijay","ghaziabad");  
		     
		   System.out.println(s1);//compiler writes here s1.toString()  internally happens like sop(s1.toString())
		   System.out.println(s2);//compiler writes here s2.toString()  String s1 = obj.toString();
		   System.out.println(s1.toString());
		   Object obj = s1;
		   String s3 = obj.toString();
		  // obj = s3;
		   System.out.println(s3);//com.tostring_1.Test3@15db9742 classname@hashcode_in_hexadecimal_form
		}

}
