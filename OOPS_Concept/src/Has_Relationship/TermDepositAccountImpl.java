package Has_Relationship;

public class TermDepositAccountImpl implements Account{
	//composed helper class(i.e. composition)
	AccountHelper helper=new AccountHelperImpl();
	public double calculateInterest(double amount){
		return amount * 0.05;
	}
	public void deposit(double amount){
		helper.deposit(amount);//get code reuse via composition
	}
	public void withdraw(double amount){
		helper.withdraw(amount);//get code reuse via composition
	}

}
