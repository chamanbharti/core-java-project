package com.stringtest;

public class InstanceTest2{  
   public static void main(String args[]){ 
	   long startTime = System.currentTimeMillis();  
       System.out.println("Hashcode test of String:");  
       String str="java"; 
       //String str=new String("java"); //it is same like above code 
       System.out.println(str.hashCode());  
       str=str+"tpoint";  
       System.out.println(str.hashCode());  
       System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms");
  
       System.out.println("Hashcode test of StringBuffer:");  
       StringBuilder sb=new StringBuilder("java");  
       System.out.println(sb.hashCode());  
       sb.append("tpoint");  
       System.out.println(sb.hashCode());  
       System.out.println("Time taken by Concating with StringBuilder: "+(System.currentTimeMillis()-startTime)+"ms");
   }  
}  
