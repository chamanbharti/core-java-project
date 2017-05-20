package Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Use find() to find a subsequence.
public class RegExpr3 {
	public static void main(String[] args) {
		Pattern pat;
		Matcher mat;
		
		pat=Pattern.compile("test");
		mat=pat.matcher("test 1 2 3 test");
		
		while(mat.find()){
			System.out.println("test found at index "+mat.start());
		}
		
	}

}
