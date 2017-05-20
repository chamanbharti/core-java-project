package aggregation;

public class TestStudent {
	int id;  
	String name;  
	Address2 address;  
	
	public TestStudent(int id, String name,Address2 address) {  
	    this.id = id;  
	    this.name = name;  
	    this.address=address;  
	}  
	
	void display(){  
		System.out.println(id+" "+name);  
		System.out.println(address.city+" "+address.state+" "+address.country);  
		}  
	
	public static void main(String[] args) {
		Address2 ad=new Address2("Agra", "UP", "India");
		Address2 ad2=new Address2("Agra", "UP", "India");
		
		TestStudent obj=new TestStudent(111,"Chaman",ad);
		TestStudent obj2=new TestStudent(112,"Bharti",ad2);
		
		obj.display();  
		obj2.display();  
	}
	

}
