package com.array;

import java.util.Arrays;

public class EqualityOfTwoArrays3 {
	public static void main(String[] args) {
		
		String[] s1 = {"java", "swings", "j2ee", "struts", "jsp", "hibernate"};
		 
        String[] s2 = {"java", "struts", "j2ee", "hibernate", "swings", "jsp"};
        
        Arrays.sort(s1);
        Arrays.sort(s2);
      /*  String temp;
        for(int i=0;i<s1.length-1;i++){
        	for(int j=0;j<s1.length-i-1;j++){
        		if(s1[j]>s1[j+1]){
        			temp = 
        		}
        	}
        }*/
 
        System.out.println(Arrays.equals(s1, s2));        //Output : true
 
	}

}
