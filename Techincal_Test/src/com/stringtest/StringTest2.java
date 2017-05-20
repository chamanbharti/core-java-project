package com.stringtest;

public class StringTest2 {
	public static void main(String[] args) {
		/*String a="durga";//a==b:true
		String b="durga";//a.equal(b):true
		 */	
		/*String a=new String("durga");//a==b:false
		String b=new String("durga");//a.equal(b):true
		 */	
		/*String a="durga";//a==b:false
		String b=new String("durga");//a.equal(b):true
		 */		 
		String a=new String("durga");//a==b:false
		String b="durga";//a.equal(b):true
		 		
			
		/*StringBuffer a=new StringBuffer("durga");//a==b:false
		StringBuffer b=new StringBuffer("durga");//a.equal(b):false
		 */		
		/*StringBuilder a=new StringBuilder("durga");//a==b:false
		StringBuilder b=new StringBuilder("durga");//a.equal(b):false
		 */		
		/*StringBuffer a=new StringBuffer("durga");//a==b:false//Incompatible operand types StringBuffer and StringBuilder
		StringBuilder b=new StringBuilder("durga");//a.equal(b):false
		 */	
		/*StringBuilder a=new StringBuilder("durga");//a==b:false//Incompatible operand types StringBuilder and StringBuffer
		StringBuffer b=new StringBuffer("durga");//a.equal(b):false
		 */		 
		//System.out.print("== operator ");
		//System.out.println("== operator"+a.hashCode()==b.hashCode());//give CE
		//System.out.println(a.hashCode()==b.hashCode());
		//System.out.println("equal method "+a.equals(b));
		System.out.print(a==b);
		System.out.println(a.equals(b));
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
	
	}

}
