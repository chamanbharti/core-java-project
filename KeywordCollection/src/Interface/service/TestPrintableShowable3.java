package Interface.service;

import Interface.model.Java;
import Interface.model.Printable;
import Interface.model.Showable;

class TestPrintableShowable3 implements Showable{  
	public void print(){
		System.out.println("Hello");
	}  
	public void show(){
		System.out.println("Welcome");
		} 
  
public static void main(String args[]){  
	TestPrintableShowable3 obj = new TestPrintableShowable3();  
	obj.print();
	obj.show();
  }  
}  