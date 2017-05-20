package com.join;
// Go here for more details http://netjs.blogspot.in/2016/07/string-join-method-stringjoiner-class-in-java-8.html
public class StringJoin {
	public static void main(String[] args) {
		
		String str1 = "An";
		String str2 = "example";
		String str3 = "string";
		
		//joining with space
		String finalStr = String.join(",", str1,str2,str3);
		System.out.println("String - "+finalStr);
		
		//joining with hyphen
		finalStr = String.join("-", str1,str2,str3);
		System.out.println("String - "+finalStr);
	}
}
