package Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Use replaceAll().
public class RegExpr8 {
	public static void main(String[] args) {
		String str = "Jon Jonathan Frank Ken Todd";
		
		Pattern pat;
		Matcher mat;
		pat=Pattern.compile("Jon.*?");
		mat=pat.matcher(str);
		
		System.out.println("Original sequence: " + str);
		
		str=mat.replaceAll("Eric ");
		
		System.out.println("Modified sequence: " + str);
		
		
	}

}
