package abstraction.service;

import abstraction.model.Bank;
import abstraction.model.PNB;
import abstraction.model.SBI;

public class TestBank {
	public static void main(String args[]){    
		Bank b=new SBI();//if object is PNB, method of PNB will be invoked    
		int interest=b.getRateOfInterest();    
		System.out.println("Rate of Interest is: "+interest+" %");  
		Bank p=new PNB();//if object is PNB, method of PNB will be invoked    
		int interest2=p.getRateOfInterest();    
		System.out.println("Rate of Interest is: "+interest2+" %"); 
		}

}
