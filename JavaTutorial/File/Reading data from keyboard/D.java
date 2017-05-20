import java.util.Scanner;
class D
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter ur rollno");
		int rollno=sc.nextInt();

		System.out.println("Enter your name");
		//String name=sc.next();//read only one word
		String name=sc.nextLine();//read a whole line
		
		System.out.print("Enter your fee");
		float fee=sc.nextFloat();//double fee=sc.nextDouble();

		System.out.println("Rollno: "+rollno+"Name: "+name+"Fee: "+fee);
	}
}