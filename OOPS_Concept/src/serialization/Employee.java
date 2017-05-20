package serialization;

import java.io.Serializable;

//@SuppressWarnings("serial")
public class Employee implements Serializable,variableConstant {
//public class Employee implements Serializable {

	/**
	 * 
	 */
private static final long serialVersionUID = 1L;
	/*http://javabeginnerstutorial.com/core-java-tutorial/transient-vs-static-variable-java/
	 * http://www.java2blog.com/2014/02/externalizable-in-java.html
	 * Here i am providing the value of company name,companyCEO and address
	 * while defining these variables.
	 */
	/*
	 * Here i am providing the value of company name,companyCEO and address
	 * while defining these variables.
	 * I am making address as final here
	 */
	 	int employeeId;  
	 	/*transient final String employeeName="Chaman Bharti";  
	    static final String department="BCA";
	    static transient String address="J & K Pocket";*/
	 	String employeeName;  
	    String department;
	    String address;
	    String dob;
		public int getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
}
interface variableConstant  {
	public static final String education = "MCA";
 
}
