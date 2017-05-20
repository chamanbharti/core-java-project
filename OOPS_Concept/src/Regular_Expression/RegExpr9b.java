package Regular_Expression;

import java.util.StringTokenizer;
//Use split().
public class RegExpr9b {
		public static void main(String[] args) {  
		       StringTokenizer st = new StringTokenizer("my,name,is,khan");  
		        
		      // printing next token  
		      System.out.println("Next token is : " + st.nextToken(","));  
		   } 

}
