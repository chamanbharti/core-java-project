package com.polymorphism;

class Vehicle{  
	  	
		void run(){System.out.println("Vehicle is running");}  
	} 

	class Bike extends Vehicle{  
	    
		void run(){
				System.out.println("Bike is running");
			}  
	}  
public class Test{
	
	public static void main(String[] args) {
		//Vehicle v1 = new Vehicle();
		//v1.run();
		
		Vehicle v2 = new Bike();
		v2.run();
		
		//Bike v3 = new Bike();
		
	}
}
	
