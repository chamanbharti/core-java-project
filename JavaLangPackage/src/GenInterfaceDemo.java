//a generic interface example
//a min/max interface
interface minMax<T extends Comparable<T>>{
	T min();
	T max();
}
//now implement MinMax
class MyClass<T extends Comparable<T>> implements minMax<T>{
	T[] vals;
	MyClass(T[] o){
		vals=o;
	}
	//return minimum value in vals
		public T min(){
			T v=vals[0];
			for(int i=1;i<vals.length;i++)
				if(vals[i].compareTo(v) <0) v=vals[i];
			return v;
		}
	//return maximum value in vals
	public T max(){
		T v=vals[0];
		for(int i=1;i<vals.length;i++)
			if(vals[i].compareTo(v) >0) v=vals[i];
		return v;
	}
}
public class GenInterfaceDemo {
	public static void main(String[] args) {
		Integer inums[]={3,6,2,8,6};
		Character chs[]={'b','r','p','w'};
		
		MyClass<Integer>iob=new MyClass<Integer>(inums);
		MyClass<Character>cob=new MyClass<Character>(chs);
		System.out.println("Max value in inums: "+iob.max());
		System.out.println("Min value in inums: "+iob.min());
		
		System.out.println("Max value in chs: "+cob.max());
		System.out.println("Min value in chs: "+cob.min());
		
	}
}
