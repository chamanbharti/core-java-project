import java.io.*;
public class ThrowsTest16{


	public static void main(String[] args){
		try{
			System.out.println("Hello");
		   }
		catch(IOException e){}
	}
	

}
/*
	CE: ThrowsTest16.java:9: exception IOException is never thrown in body of corresponding try statement
                catch(IOException e){}
                ^
1 error
*/