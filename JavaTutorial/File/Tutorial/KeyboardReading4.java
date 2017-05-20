import java.util.Scanner; 
public class KeyboardReading4 
 { 
   public static void main(String[] args) 
    { 
      Scanner scanf = new Scanner(System.in); 
      System.out.println("Please enter some value you like: ");   
          if(scanf.hasNextInt()) 
           { 
             int x = scanf.nextInt(); 
             System.out.println("You entered: " + x); 
           } 

          else if(scanf.hasNextDouble()) 
           { 
             double y = scanf.nextDouble(); 
             System.out.println("You entered: " + y); 
           }
 
         else if(scanf.hasNextBoolean()) 
          { 
            boolean b = scanf.nextBoolean(); 
            System.out.println("You entered: " + b); 
          } 

         else if(scanf.hasNext()) 
          { 
            System.out.println("What you entered I assume as a word.\nYou entered: " + scanf.next()); 
          } 

        scanf.close(); 
     } 
}