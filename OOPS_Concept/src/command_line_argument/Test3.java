package command_line_argument;


public class Test3 {

	public static void main(String[] args){
		
		 for(int i=0;i<=3;i++){
		 System.out.println(args[i]);	
			
		}
	}
}
//java Test3 A B C output:A B C AIOOBE
//java Test3 A B C output:A B AIOOBE
//java Test3 A output:AIOOBE
//java Test3 output: AIOOBE