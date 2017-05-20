package Interface.service;

import Interface.model.C;

class TestClasswithInterface implements C.Message{  
	 public void msg(){
		 System.out.println("Hello nested interface");
		 }  
	  
	 public static void main(String args[]){  
	  C.Message message=new TestClasswithInterface();//upcasting here  
	  message.msg();  
	 } 
	 
	}  
