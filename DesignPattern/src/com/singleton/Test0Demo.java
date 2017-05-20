package com.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test0Demo {
	
	public static void main(String[] args){
		
		/*Test0 t1=new Test0();
		Test0 t2=new Test0();
		System.out.println(+t1.hashCode());
		System.out.println(t2.hashCode());*/
		
		Test0 t1=Test0.getInstance();
		Test0 t2=Test0.getInstance();
		System.out.println(+t1.hashCode());
		System.out.println(t2.hashCode());
		
		/*Test0 t1 = Test0.getInstance();
		Test0 t2 = Test0.getInstance();
		Test0 t3 = Test0.getInstance();*/
		
		/*FileOutputStream fos = new FileOutputStream("D:\\text.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(t1);
			oos.writeObject(t2);
			oos.writeObject(t3);
		oos.close();
		
		//deserialize from file to object
		FileInputStream fis = new FileInputStream("D:\\text.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Test0 tt1 = (Test0)ois.readObject();
		Test0 tt2 = (Test0)ois.readObject();
		Test0 tt3 = (Test0)ois.readObject();
		ois.close();*/
		
		
		//System.out.println("Before Serialization\n"+t1.hashCode()+"\n"+t2.hashCode()+"\n"+t3.hashCode());
		//System.out.println("After Serialization\n"+tt1.hashCode()+"\n"+tt2.hashCode()+"\n"+tt3.hashCode());
	}

}
