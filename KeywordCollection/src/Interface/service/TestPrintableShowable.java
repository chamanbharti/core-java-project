package Interface.service;

import Interface.model.Java;
import Interface.model.Printable;
import Interface.model.Showable;

class TestPrintableShowable implements Printable,Showable,Java{  
	public void print(){
		System.out.println("Hello");
	}  
	public void show(){
		System.out.println("Welcome");
	}
	public void happy(){
		System.out.println("In Java");
	}
  
public static void main(String args[]){  
	TestPrintableShowable obj = new TestPrintableShowable();  
	obj.print();
	obj.show();
	obj.happy();
  }  
}  