package Has_Relationship;

public class Employee {
	int id;
	String name;
	Address address;//aggregation
	public Employee(int i, String n, Address add) {
		id = i;
		name = n;
		address=add;
	}
	void display(){
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
	

}
