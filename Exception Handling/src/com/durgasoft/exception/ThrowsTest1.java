import java.io.*;
public class ThrowsTest1{


	public static void main(String[] args){
	
	PrintWriter pw = new PrintWriter("abc.txt");
	pw.println("Hello");

	}

}
/*CE:ThrowsTest1.java:7: unreported exception FileNotFoundException; must be caught or declared to be thrown
        PrintWriter pw = new PrintWriter("abc.txt");
                         ^
1 error
*/