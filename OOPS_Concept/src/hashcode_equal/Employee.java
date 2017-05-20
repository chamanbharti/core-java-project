package hashcode_equal;

public class Employee {
	
	private Integer id;
	private String firstName;
	private String lastName;
	private String department;
	
	public Employee(int i) {
		this.id = i;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	public int hashCode(){
		
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + getId();
		return result;
	}
}
