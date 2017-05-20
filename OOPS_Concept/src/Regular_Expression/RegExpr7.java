package Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Use a character class.
public class RegExpr7 {
	public static void main(String[] args) {
		Pattern pat;
		Matcher mat;
		/*// Match lowercase words.
		pat=Pattern.compile("[a-z]+");
		mat=pat.matcher("this is a test.");*/
		// Match bothcase words.
		pat=Pattern.compile("[A-Z]+");
		mat=pat.matcher("THIS IS A TEST.");
		/*// Match bothcase words.
		pat=Pattern.compile("[A-z]+");
		mat=pat.matcher("this iS a teSt.");*/
		
		while(mat.find()){
			System.out.println("Match :"+mat.group());
		}
		
	}

}
