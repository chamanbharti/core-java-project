package constructor;

public class ConstructorOverloading1 {

	int id;
	String name;
	int age;
	int mobileNo;
	
	public ConstructorOverloading1(int id,String name) {
		this.id=id;
		this.name=name;
		 
	}
	public ConstructorOverloading1(int i,String n,int a) {
		//id=i;
		//name=n;
		this(i,n);//now no need to initialize i and n
		age=a;
		 
	}
	public ConstructorOverloading1(int i,String n,int a,int m) {
		//id=i;
		//name=n;
		//age=a;
		this(i,n,a);//now no need to initialize i,n and a
		mobileNo=m;
	}
	void display(){
		System.out.println(id+" "+name+" "+age+" "+mobileNo);
	}
	
	public static void main(String[] args) {
		ConstructorOverloading1 c1=new ConstructorOverloading1(11, "Karan");
		ConstructorOverloading1 c2= new ConstructorOverloading1(222, "Aryan", 25);
		ConstructorOverloading1 c3= new ConstructorOverloading1(222, "Aryan", 25,987123905);
		c1.display();
		c2.display();
		c3.display();
	}

}