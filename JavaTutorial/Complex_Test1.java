class Complex1
{
   	double real;
   	double imag;
	
 	 Complex1(double p,double q)
	  {
	    System.out.println("Constructor in process...");
	    real=p;
	    real=p;
	    imag=q;
	   }
	void showComplex()
	{
 	  System.out.println("The Complex Number is :"+real +"+i"+imag);
	}

}

 class Complex_Test1
 {
	public static void main(String para[])
	{
	  Complex1 R1;
	  R1=new Complex1(5,2);
	  R1.showComplex();
	}
}