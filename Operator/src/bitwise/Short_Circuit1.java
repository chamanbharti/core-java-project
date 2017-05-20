package bitwise;

public class Short_Circuit1 {

	/*
	 & | normal operator				&& || short-circuit operator
	 
  	if(a & b)							if(a && b)
 	if(a | b)							if(a || b)
1. both argument is evaluated			1. second argument is optional
2. performance is low					2. performance is high
3. applicable for both					3. applicable for only boolean not integral type 
	boolean and integral type	
	
Note:
x && y = y will be evaluated iff x is true i.e if x is false then y wont be evaluated
x || y = y will be evaluated iff x is false i.e if x is true then y wont be evaluated
	*/	
	public static void main(String[] args) {
		
		int x = 10, y = 15;
		if(++x < 10 || ++y > 15 ){
			
			x++;
		}else{
			
			  y++;
		}
		
		System.out.println("x= "+x+" y= "+y);
		
	}
}
/*
 		 x		 	 y
 	&	11			17
 	&&	11			16
 	|	12			16
 	||	
 */
