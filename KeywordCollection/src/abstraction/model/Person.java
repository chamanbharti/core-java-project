package abstraction.model;
//abstract class
public abstract class Person {
	private String name;
	private String gender;
	
	public Person(String nm, String gen){
		name=nm;
		gender=gen;
	}
	//abstract method
	public abstract void work();
	
	public String toString(){
		return "Name="+name+"::Gender="+gender;
	}
}
