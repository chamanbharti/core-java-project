package BufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//A tiny editor.
//create a BufferedReader using System.in
public class TinyEdit {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str[]=new String[100];
		
		System.out.println("Enter lines of text.");
		System.out.println("Enter 'stop' to quit.");
		//read strings
		for(int i=0;i<100;i++){
			str[i]=br.readLine();
			if(str[i].equals("stop"))
				break;
		}
		System.out.println("\nHere is your file:");
		//display lines
		for(int i=0;i<100;i++){
			if(str[i].equals("stop"))
				break;
			System.out.println(str[i]);
		}
		
	}

}
