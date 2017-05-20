package command_line_argument;


public class Test1 {

		public static void main(String[] args){
			
		 int n=Integer.parseInt(args[0]);
		 System.out.println("The square of "+n+"is "+(n*n));	
			
		}
}
//javac Test1.java
//java Test1 5
//output: 25
