package odd_even;

import java.util.*;
public class EvenOdd
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter the number");
		n=s.nextInt();
		/* without using % or / operator 
		while(n >= 2)
		{
			n = n-2;
		}
		if(n==1)
			System.out.println("Given Number is odd");
		else
			System.out.println("Given Number is Even");*/
		//without using %  operator 
		if(n/2*2 == n)
			System.out.println("Given Number is Even");
		else
			System.out.println("Given Number is odd");
	}
}