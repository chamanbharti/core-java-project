package Regular_Expression;

import java.util.StringTokenizer;
//Use split().
public class RegExpr9c {
	public static void main(String args[]){  
	//StringTokenizer st = new StringTokenizer("my name is khan");  
	StringTokenizer st = new StringTokenizer("my name is khan"," ");  
	
			while (st.hasMoreTokens()) {  
			         System.out.println(st.nextToken());  
			  }  
	}  

}
