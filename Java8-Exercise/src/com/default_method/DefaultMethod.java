package com.default_method;

interface Vehicle {
	
	void hello();
	      
	   default void print(){
	      System.out.println("I am a vehicle!");
	   }
		
	   static void blowHorn(){
	      System.out.println("Blowing horn!!!");
	   }
	}
interface FourWheeler{
	
	default void print(){
		System.out.println("I am a four wheeler!");
	}
}

class Car implements Vehicle, FourWheeler{
	
	public void print(){
		//Vehicle.super.print();
		//FourWheeler.super.print();
		//Vehicle.blowHorn();
		System.out.println("I am a car!");
	}

	@Override
	public void hello() {
		System.out.println("Hello");
		
	}
}
public class DefaultMethod {
	public static void main(String[] args) {
		Vehicle vehicle = new Car();
		vehicle.print();
		vehicle.hello();
		
	}
	

}
