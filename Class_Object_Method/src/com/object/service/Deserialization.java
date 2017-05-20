package com.object.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.object.model.Employee2;

/*
 * Using Object Deserialization
Object deserialization can also be used to create an Object. It is just the opposite of serializing an Object.

Using ClassLoader
We can also use Class Loader to create Object of a Class. This way is some what same as Class.forName option.
 */
public class Deserialization {
	public static void main(String[] args) {
		
		try{
			/*FileInputStream fileIn=new FileInputStream("Employee.txt");
			ObjectInputStream in=new ObjectInputStream(fileIn);*/
			// write something in the file
			/*in.writeObject(object3);
			in.flush();*/
			 
			// create an ObjectInputStream for the file we created before
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Employee.txt"));
			Deserialization object5 = (Deserialization) ois.readObject();

		}catch(IOException i){
			i.printStackTrace();
			 return;
		}
		catch(ClassNotFoundException c)
	    {
	    System.out.println("Employee class not found");
	    c.printStackTrace();
	    return;
	    }
		
	}

}
