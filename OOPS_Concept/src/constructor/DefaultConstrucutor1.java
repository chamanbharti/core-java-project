package constructor;

public class DefaultConstrucutor1 {
	
	int id;
	String name;
	
	void display(){
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		DefaultConstrucutor1 d1=new DefaultConstrucutor1();
		d1.display();
		d1.display();
	}

}
