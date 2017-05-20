
public class IntegerCheck {
	//public static void main(String[] args)   {// main method signature-1
	//public static void main(String []args)  {// main method signature-2
	//public static void main(String args[]){// main method signature-3
	//public static void main(String...args){// main method signature-4
	//static public void main(String[] args){// main method signature-5
	//public static final void main(String[] args){// main method signature-6
	//final public static void main(String[] args){// main method signature-7
	final strictfp public static void main(String[] args){// main method signature-8
		int i=Integer.MAX_VALUE;
		System.out.println(i);
		
		i=i+1;
		System.out.println(i);
		System.out.println(Integer.MIN_VALUE);
		int dayInYear=365;
		System.out.println(dayInYear);
		long dayInYear2=365;
		System.out.println(dayInYear2);
		byte dayInYear3=(byte) 365;
		System.out.println(dayInYear3);
		
		// Implicit casting (int is converted to long, casting is not needed)
		int j=3650;
		long k=j;
		System.out.println(k);
		
		//Explicit casting (long is converted to int, casting is needed).
		long l =3650;
		int m=(int) l;
		System.out.println(m);
	}

}
