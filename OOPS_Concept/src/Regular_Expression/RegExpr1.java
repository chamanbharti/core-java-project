package Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//A simple pattern matching demo.
public class RegExpr1 {
	public static void main(String[] args) {
		Pattern pat;
		Matcher mat;
		boolean found;
		
		pat=Pattern.compile("Java");
		mat=pat.matcher("Java");
		found=mat.matches();//check for match
		
		System.out.println("Testing Java against Java");
		if(found)
			System.out.println("Matches");
		else
			System.out.println("NO Match");
		System.out.println();
		
		System.out.println("Testing Java against Java 8.");
		mat=pat.matcher("Java 8");//create a new matcher
		
		found=mat.matches();//check for match
		if(found)
			System.out.println("Matches");
		else
			System.out.println("NO Match");
		System.out.println();
		
	}

}
