package serialization;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

class DePersist2{  
	 public static void main(String args[])throws Exception{ 
		 
	  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
	  Transient s=(Transient)in.readObject();  
	  System.out.println(s.id+" "+s.name+" "+s.age);  
	  in.close();  
	  
	 } 
	 
}  