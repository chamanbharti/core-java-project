package ReflectionAPI;
class Simple2 {}

class Test2{  
	void printName(Object obj){
		Class c=obj.getClass();
		System.out.println(c.getName());
	}
	
 public static void main(String args[]) throws ClassNotFoundException{  
  Simple2 s2=new Simple2();
  Test2 t=new Test2();
  t.printName(s2);
  //t.printName(t);
 }  
}  