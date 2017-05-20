package com.methodreference;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String> ();
		
		  names.add("Mahesh");
	      names.add("Suresh");
	      names.add("Ramesh");
	      names.add("Naresh");
	      names.add("Kalpesh");
	      
	      // java 8 feature
	     // names.forEach(System.out :: println);
	      for(String s:names){
	    	  System.out.println(s);
	      }
	}
}
