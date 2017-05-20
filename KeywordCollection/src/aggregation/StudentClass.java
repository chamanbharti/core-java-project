package aggregation;

public class StudentClass {
	int rollNum;
	String studentName;
	Address stuentAddr;
	public StudentClass(int rollNum, String studentName, Address stuentAddr) {
		//super();
		this.rollNum = rollNum;
		this.studentName = studentName;
		this.stuentAddr = stuentAddr;
	}
	
	public static void main(String[] args) {
		Address ad=new Address(55, "Agra", "UP", "India");
		StudentClass obj=new StudentClass(123, "Chaman", ad);
		System.out.println(obj.rollNum);
		System.out.println(obj.studentName);
		System.out.println(obj.stuentAddr.streetNum);
		System.out.println(obj.stuentAddr.city);
		System.out.println(obj.stuentAddr.state);
		System.out.println(obj.stuentAddr.country);
	}
	

}
