package command_line_argument;


public class Test2 {

	public static void main(String[] args){
		
		 for(int i=0;i<=args.length;i++){
		 System.out.println(args[i]);	
		 int count=0;
		 count++;
		 System.out.println(count);
			
		}
	}
}
//java Test3 A B C output:A B C AIOOBE
//java Test3 A B C output:A B AIOOBE
//java Test3 A output:AIOOBE
//java Test3 output: AIOOBE


