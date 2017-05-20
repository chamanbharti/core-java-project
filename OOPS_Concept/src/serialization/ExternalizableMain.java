package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizableMain {
	public static void main(String[] args) {
		Emp e=new Emp();
		e.setEmployeeId(101);
		e.setEmployeeName("chaman");
		e.setDepartment("BCA");
		//serialize
		try{
			FileOutputStream fileOut=new FileOutputStream("employee.ser");
			ObjectOutputStream outStream=new ObjectOutputStream(fileOut);
			outStream.writeObject(e);
			outStream.close();
			fileOut.close();
		}
		catch(IOException i){
			i.printStackTrace();
		}
		//Deserialize 
		e=null;
		try{
			FileInputStream fileIn=new FileInputStream("employee.ser");
			ObjectInputStream inStream=new ObjectInputStream(fileIn);
			e=(Emp) inStream.readObject();
			inStream.close();
			fileIn.close();
		}
		catch(IOException i){
			i.printStackTrace();
			return;
		}
		catch(ClassNotFoundException c)  
		  {  
		   System.out.println("Employee class not found");  
		   c.printStackTrace();  
		   return;  
		  }  
		  System.out.println("Deserialized Employee...");  
		  System.out.println("Emp id: " + e.getEmployeeId());  
		  System.out.println("Name: " + e.getEmployeeName());  

	}

}
