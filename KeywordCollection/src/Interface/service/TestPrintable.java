package Interface.service;

import Interface.model.Printable;

class TestPrintable implements Printable{  
	public void print(){
		System.out.println("Hello");
	}  
  
public static void main(String args[]){  
	TestPrintable obj = new TestPrintable();  
	obj.print();  
  }  
}  