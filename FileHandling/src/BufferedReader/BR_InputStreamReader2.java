package BufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BR_InputStreamReader2 {
	public static void main(String[] args) throws IOException {
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		
		String name="";
		System.out.println("Enter data: ");
		//System.out.println("Enter 'stop' to quit.");
		/*while(name.equals("stop")){
			System.out.println("Enter data: ");
			name=br.readLine();
			System.out.println("data is: "+name);
		}*/
		do{
			name=br.readLine();
			System.out.println("data is: "+name);
		}while(name.equals("stop"));
		
		br.close();
		r.close();
	}

}
