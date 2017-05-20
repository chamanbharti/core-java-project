package serialization;

import java.io.Serializable;

public class Transient implements Serializable{  
	 int id;  
	 String name;  
	 transient int age;//Now it will not be serialized  
	 public Transient(int id, String name,int age) {  
	  this.id = id;  
	  this.name = name;  
	  this.age=age;  
	 }  
}  