package Regular_Expression;

import java.util.StringTokenizer;
import java.util.regex.Pattern;
//Use split().
public class RegExpr9a {
	//static String in = "title=Java: The Complete Reference;" +"author=Schildt;" +"publisher=McGraw-Hill;" +"copyright=2014";
	public static void main(String[] args) {
		/*StringTokenizer st = new StringTokenizer(in, "=;");
		
		while(st.hasMoreTokens()) {
			String key = st.nextToken();
			String val = st.nextToken();
			System.out.println(key + "\t" + val);
			}*/
		Pattern pat;
		//pat=Pattern.compile("[ ,.!]");
		pat=Pattern.compile("[=;]");

		//String strs[]=pat.split("one two,alpha9 12!done.");
		String in[] = pat.split("title=Java: The Complete Reference;" +"author=Schildt;" +"publisher=McGraw-Hill;" +"copyright=2014");
		for (int i = 0; i < in.length; i++) {
			System.out.println("Next token: "+in[i]);
			
		}
		
		
		
	}

}
