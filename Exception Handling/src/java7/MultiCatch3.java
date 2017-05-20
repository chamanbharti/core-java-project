package java7;

public class MultiCatch3 {
	public static void main(String[] args) {
		
		try{
			int[]array = new int[10];
			array[10] = 30/0;
		}catch(Exception | ArithmeticException | ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
	}

}
//The exception ArithmeticException is already caught by the alternative Exception