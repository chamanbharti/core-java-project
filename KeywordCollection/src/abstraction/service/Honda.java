package abstraction.service;

import abstraction.model.Bike;


class Honda extends Bike{  
	public void run(){
		System.out.println("running safely..");
}  
  
	public static void main(String args[]){  
	 //Bike obj = new Bike(); //con't instantiate the object of Bike
	 Bike obj=new Honda();
	 obj.run();  
	}  
}  
