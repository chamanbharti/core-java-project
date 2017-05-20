package serialization.externalization;

import java.io.Externalizable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Externalization1 implements Externalizable{
	
	String s;
	int i;
	int j;
	public Externalization1(){
		System.out.println("public no-arg constructor");
		
	}
	public Externalization1(String s, int i, int j) {
		this.s = s;
		this.i = i;
		this.j = j;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {

		out.writeObject(s);
		out.writeObject(i);
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		s = (String) in.readObject();
		i = in.readInt();
		
	}

public static void main(String[] args) throws Exception {
		
		Externalization1 e = new Externalization1("Chaman",10,20);
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		oos.close();
		System.out.println("success");
			
	}
	
	

}
