package command_line_argument;


public class Test5 {

		public static void main(String[] args){
		
		String[] argh={"x","y","z"};
		args=argh;
	
		 for(String s:args){
		 System.out.println(s);	
			
		}
	}
}
//java Test4 A B C output:x, y, z
//java Test4 A B C output:x, y, z
//java Test4 A output:x, y, z
//java Test4 output: x, y, z