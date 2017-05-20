package Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Use wildcard and quantifier.
public class RegExpr5 {
	public static void main(String[] args) {
		Pattern pat;
		Matcher mat;
		// Use greedy matching behavior.
		pat=Pattern.compile("e.+d");
		mat=pat.matcher("extend cup end table");
		
		while(mat.find()){
			System.out.println("Match :"+mat.group());
		}
		
	}

}
