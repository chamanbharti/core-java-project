import java.util.Scanner;

public class BankTransaction
{


public static void main(String[] args) 
{

    Scanner scan = new Scanner(System.in);
    int num;
    double balance = 0;
    double checkingBalance= 0, savingsBalance =0;

    do 
	{

        double amount;

        System.out.println("------------------------");
        System.out.println("Select a Transaction by typing number");
        System.out.println("1. Deposit");
        System.out.println("2. Withdrawal");
        System.out.println("3. Balance");
        System.out.println("4. Exit");
        System.out.println("------------------------");
        num = scan.nextInt();


        if (num == 1) 
	{ //if DEPOSIT is selected

            //ask to deposit from checking or savings
            System.out.println("------------------------");
            System.out.println("Would you like to deposit in checking or savings?");
                System.out.println("1. Checking");
                System.out.println("2. Savings");
            System.out.println("------------------------");
                num = scan.nextInt();

                if (num == 1) 
		{ //if CHECKING is selected
                    //enter amount to be deposited
                    System.out.println("------------------------");
                    System.out.println("Enter amount to deposit in checking account: ");
                    System.out.println("------------------------");
                    amount = scan.nextDouble();

                    //ask if they want to continue with transaction
                    System.out.println("------------------------");
                    System.out.println("Would you like to continue this transaction?");
                        System.out.println("1. Yes");
                        System.out.println("2. No");
                    System.out.println("------------------------");
                        num = scan.nextInt();

                    // Add the amount to the checking balance
                    checkingBalance += amount;
                    System.out.println("------------------------");
                    System.out.println("Your checking account's balance is " + checkingBalance);
                    System.out.println("------------------------");

                } 
		else if (num == 2) 
		{ //if SAVINGS is selected
                    //enter amount to be deposited
                    System.out.println("------------------------");
                    System.out.println("Enter amount to deposit in savings account: ");
                    System.out.println("------------------------");
                    amount = scan.nextDouble();

                    //ask if they want to continue with transaction
                    System.out.println("------------------------");
                    System.out.println("Would you like to continue this transaction?");
                        System.out.println("1. Yes");
                        System.out.println("2. No");
                    System.out.println("------------------------");
                        num = scan.nextInt();

                        if (num == 1) 
			{
                            // Add the amount entered to the savings balance
                            savingsBalance += amount;
                            System.out.println("------------------------");
                            System.out.println("Your savings account's balance is " + savingsBalance);
                            System.out.println("------------------------");
                        } 
			else if (num == 2) 
			{
                            //EMPTY NEEDS CODE
                        }
                }


        } 
	else if (num == 2) 
	{ //if withdrawal is selected

            //ask to withdrawal from checking or savings
            System.out.println("------------------------");
            System.out.println("Would you like to withdrawal from checking or savings?");
            System.out.println("1. Checking");
            System.out.println("2. Savings");
            System.out.println("------------------------");
                num = scan.nextInt();

                if (num == 1) 
		{ //if checking is selected
                    //enter amount to be withdrawn
                    System.out.println("------------------------");
                    System.out.println("Enter amount to withdrawal: ");
                    System.out.println("------------------------");
                    amount = scan.nextDouble();

                    //ask if they want to continue with transaction
                    System.out.println("------------------------");
                    System.out.println("Would you like to continue this transaction?");
                        System.out.println("1. Yes");
                        System.out.println("2. No");
                    System.out.println("------------------------");
                        num = scan.nextInt();

                        if (num == 1) 
			{ //if you say yes to continuing
                            // Remove the amount from the balance
                            checkingBalance -= amount;
                            System.out.println("------------------------");
                            System.out.println("Your checking account's balance is " + checkingBalance);
                            System.out.println("------------------------");
                        } 
			else if (num == 2) 
			{ //if you say no to continuing
                            //Do not remove amount from savings balance
                            //EMPTY NEEDS CODE
                        }                               

                } 
		else if (num == 2) 
		{ //if savings is selected
                    //enter amount to be withdrawn
                    System.out.println("------------------------");
                    System.out.println("Enter amount to withdrawal: ");
                    System.out.println("------------------------");
                    amount = scan.nextDouble();

                    //ask if they want to continue with transaction
                    System.out.println("------------------------");
                    System.out.println("Would you like to continue this transaction?");
                        System.out.println("1. Yes");
                        System.out.println("2. No");
                    System.out.println("------------------------");
                        num = scan.nextInt();

                        if (num == 1) 
			{ //if you say yes to continuing
                            // Remove the amount from the savings balance
                            savingsBalance -= amount;
                            System.out.println("------------------------");
                            System.out.println("Your savings account's balance is " + savingsBalance);
                            System.out.println("------------------------");
                        } 
			else if (num == 2) 
			{ //if you say no to continuing
                            //Do not remove amount from savings balance
                            //EMPTY NEEDS CODE
                        }
                }


        } 
	else if (num == 3) 
	{ //if balance is selected

            //ask to see balance of checking or savings
            System.out.println("------------------------");
            System.out.println("Your Checking balance is " + checkingBalance);
            System.out.println("Your Savings balance is " + savingsBalance);
            System.out.println("------------------------");
                num = scan.nextInt();

                //needs to return to transaction options
        }



    } while (num != 4);

    System.out.println("------------------------");
    System.out.println("Good Bye!");
    System.out.println("------------------------");

}
}