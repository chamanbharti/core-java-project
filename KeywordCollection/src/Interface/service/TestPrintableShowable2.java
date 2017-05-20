package Interface.service;

import Interface.model.Java;
import Interface.model.Printable;
import Interface.model.Showable;

class TestPrintableShowable2 implements Printable,Showable{  
	public void print(){
		System.out.println("Hello");
	}  
	
  
public static void main(String args[]){  
	TestPrintableShowable2 obj = new TestPrintableShowable2();  
	obj.print();
  }  
}  