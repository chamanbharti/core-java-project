package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class PersistExample{  
	 public static void main(String args[])throws Exception{  
		 
	  Transient s1 =new Transient(211,"ravi",22);//creating object  
	  //writing object into file  
	  FileOutputStream f=new FileOutputStream("f.txt");  
	  ObjectOutputStream out=new ObjectOutputStream(f);  
	  out.writeObject(s1);  
	  out.flush();  
	  
	  out.close();  
	  f.close();  
	  System.out.println("success");  
	 }  
	}  