package serialization;

public class Student2 extends Person{
	
	String course;
	int fee;
	
	public Student2(int id,String name,String course,int fee){
		super(id,name);
		this.course=course;
		this.fee=fee;
	}

}
