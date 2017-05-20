package isA_Relationship;

public class SavingsAccount extends Account{
	public double calculateInterest(double amount){
		return amount * 0.03;
	}
	public void deposit(double amount){
		super.deposit(amount);//get code reuse
	}
	public void withdraw(double amount){
		super.withdraw(amount);//get code reuse
	}

}
