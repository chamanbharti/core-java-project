package Interface.defaultMethod;

public class Car implements Vehicle,FourWheeler {

	public void print(){
	     Vehicle.super.print();
		//Vehicle.print();
	    FourWheeler.super.print();
		//FourWheeler.print();
	      Vehicle.blowHorn();
	      System.out.println("I am a car!");
	   }
		
}
