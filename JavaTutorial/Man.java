import java.util.Scanner;

public class Man
{
  public static void main(String[] args)
{
  Scanner input=new Scanner(System.in);
  int num;
  String word;
  
  System.out.println("Enter digit from ur keyboard");
  num=input.nextInt();

  System.out.println("Enter word from ur keyboard");
  word=input.next();
  
        System.out.println("Here is the echo of what you have entered:");
 
        System.out.println("The number you have entered is: "+num); //echoing input to num1
 
        System.out.println("The word you have entered is: "+word); //echoing input to word1

}

}