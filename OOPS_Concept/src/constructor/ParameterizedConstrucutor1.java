package constructor;

public class ParameterizedConstrucutor1 {
	
	int id;
	String name;
	
	public ParameterizedConstrucutor1(int i,String n) {
		this.id=i;
		this.name=n;
	}
	
	void display(){
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) {
		ParameterizedConstrucutor1 d1=new ParameterizedConstrucutor1(111,"Karan");
		ParameterizedConstrucutor1 d2= new ParameterizedConstrucutor1(222,"Aryan");
		
		d1.display();
		d2.display();
	}

}
