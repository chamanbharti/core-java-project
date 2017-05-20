package com.top10.exception.runtime;
public class NegativeArraySizeException{ 
 
 public static void main(String args[]){  

	 
     
	int[] i = new int[-3];
  	 System.out.println(i.getClass().getName());//RE:NegativeArraySizeException
   }  

} 
