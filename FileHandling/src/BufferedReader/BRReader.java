package BufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Use a BufferedReader to read characters from the console.
public class BRReader {
	public static void main(String[] args) throws IOException {
		char c;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter characters, 'q' to quit.");
		//read characters
		do{
			c=(char) br.read();
			System.out.println(c);
		}while(c!='q');
	}

}
