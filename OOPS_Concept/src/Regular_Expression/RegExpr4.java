package Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Use a quantifier.
public class RegExpr4 {
	public static void main(String[] args) {
		Pattern pat;
		Matcher mat;
		
		pat=Pattern.compile("W+");
		mat=pat.matcher("W WW WWW");
		
		while(mat.find()){
			System.out.println("test found at index "+mat.group());
		}
		
	}

}
