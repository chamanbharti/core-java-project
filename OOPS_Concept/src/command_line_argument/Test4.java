package command_line_argument;

public class Test4 {

		public static void main(String[] args){
			
		 for(int i=0;i<3;i++){
		 System.out.println(args[i]);	
			
		}
	}
}

//java Test4 A B C output:A B C
//java Test4 A B C output:A B AIOOBE
//java Test4 A output:AIOOBE
//java Test4 output: AIOOBE