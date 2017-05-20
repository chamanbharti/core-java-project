//import java.io.*;
public class ThrowsTest17{


	public static void main(String[] args){
		try{
			System.out.println("Hello");
		   }
		catch(InterruptedException e){}
	}
	

}
/*
	CE: ThrowsTest17.java:9: exception InterruptedException is never thrown in body of corresponding try statement
                catch(InterruptedException e){}
                ^
1 error
*/