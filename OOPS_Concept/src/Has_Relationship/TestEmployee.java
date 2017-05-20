package Has_Relationship;

public class TestEmployee {
	public static void main(String[] args) {
		Address address1=new Address("Khagaria","Bihar", "India");
		Address address2=new Address("Noida","U.P", "India");
		Employee e1=new Employee(111, "chaman Bharti", address1);
		Employee e2=new Employee(112, "Rahi Akela", address2);
		
		e1.display();
		e2.display();
	}

}
