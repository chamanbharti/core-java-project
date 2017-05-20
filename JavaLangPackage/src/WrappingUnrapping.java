
public class WrappingUnrapping 
{
	public static void main(String[] args) 
	{
		byte grade=2;
		int marks=50;
		float price=8.6f;
		double rate=50.5;
		//data types of object wrapping
		Byte b1=new Byte(grade);
		Integer i1=new Integer(marks);
		Float f1=new Float(price);
		Double d1=new Double(rate);
		//let us prints values from object
		System.out.println("Values of Wrapper objects (printing as objects)");
		System.out.println("Byte object g1: "+b1);
		System.out.println("Integer object m1: "+i1);
		System.out.println("Float object f1: "+f1);
		System.out.println("Double object d1: "+d1);
		//object to data types (retrieving data type from objects
		//wrapping
		byte bv=b1.byteValue();
		int iv=i1.intValue();
		float fv=f1.floatValue();
		double dv=d1.doubleValue();
		//let us prints values from data types
		System.out.println("Unwrapped Values objects (printing as data types)");
		System.out.println("Byte value, bv: "+bv);
		System.out.println("Integer value, iv: "+iv);
		System.out.println("Float value, fv: "+fv);
		System.out.println("Double value, dv: "+dv);
		
		
	}
}
