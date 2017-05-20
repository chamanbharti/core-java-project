package com.thiss;
class This_Test 
{
  int rate;
  int amount;
  int interest; 
  This_Test(int r,int a)
  {
	  rate=r;
	  amount=a;  
  }
  
  void Test()
  {
	  int rate=10;
	      rate=this.rate+rate;
	  interest=rate*amount/100;
	  System.out.println("Test interest on "+amount+" is: "+interest);
  }
  void Total_Test()
  {
	  int rate=5;
	      rate=this.rate+rate;
	  interest=rate*amount/100;
	  System.out.println("Total interest on "+amount+" is: "+interest);
  }
}
class Test_This
{
  public static void main(String[] args)
  {
	  This_Test ob=new This_Test(5,5000);
	  ob.Test();
	  ob.Total_Test();
  }
}