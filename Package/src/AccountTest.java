//program
//package AccountPaack;
class Account
{
	String Name;
	int AccountNo;
	String Address;
	Account( String n, int a, String c)
	{
		Name = n;
		AccountNo = a;
		Address = c;
	}
	void Accout_Information()
	{
		System.out.println("Name of the Account holder :"+ Name);
		System.out.println("Account Number:"+AccountNo);
		System.out.println("Address of Account holder :"+Address);
	}
}
class AccountTest
{
	public static void main( String args[])
	{
		Account AcH1 = new Account("Rajeev",110200123, "28-K Saket, New Delhi");
		Account AcH2 = new Account("Naveen",110200113, "D–251,Sector-55, Noida");
		AcH1.Accout_Information();
		AcH2.Accout_Information();
	}
}