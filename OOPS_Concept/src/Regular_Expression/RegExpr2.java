package Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Use find() to find a subsequence.
public class RegExpr2 {
	public static void main(String[] args) {
		Pattern pat;
		Matcher mat;
		
		pat=Pattern.compile("Java");
		mat=pat.matcher("Java 8");
		System.out.println("Looking for Java in Java 8.");
		
		if(mat.find())
			
			System.out.println("subsequence found");
		else
			System.out.println("NO Match");
		
		
	}

}
