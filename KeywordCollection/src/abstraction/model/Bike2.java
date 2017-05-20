package abstraction.model;

public abstract class Bike2{  
	Bike2(){
			System.out.println("bike is created");
		} 
	
	   public abstract void run();  
	   
	   public void changeGear(){
		   	System.out.println("gear changed");
		   }  
	} 
