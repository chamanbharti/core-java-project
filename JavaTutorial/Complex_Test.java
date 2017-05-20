class Complex
{
   	double real;
   	double imag;
	void assignReal(double r)
	{
 	  real=r;
	}
	void assignImag(double i)
	{
 	  imag=i;
	}
	void showComplex()
	{
 	  System.out.println("The Complex Number is :"+real +"+i"+imag);
	}

}

 class Complex_Test
 {
	public static void main(String para[])
	{
	  Complex R1;
	  R1=new Complex();
	  R1.assignReal(5);
	  R1.assignImag(2);
	  R1.showComplex();
	}
}