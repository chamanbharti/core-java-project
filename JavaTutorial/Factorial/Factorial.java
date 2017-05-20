import java.util.Scanner;//to be able to use scanner predefined function for input

 public class Factorial
{
  public static void main(String[] args)
  {
    Scanner input=new Scanner(System.in);// input is an object and you can choose your own too.
    System.out.println("Enter no whose factorial is to be found");
    int n=input.nextInt();
    int result=factorial(n);
    System.out.println("The Factorial of "+n+" is "+result);
  }

  public static int factorial(int n)
  {
    int result=1;

    for(int i=1;i<=n;i++)
    {
      result=result*i;
    }
    return result;
  }
}