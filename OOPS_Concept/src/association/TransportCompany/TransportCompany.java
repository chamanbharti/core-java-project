package association.TransportCompany;

import Has_Relationship.AssociationCar;
import Has_Relationship.AssociationDriver;
import association.car.Car;
import association.driver.Driver;

public class TransportCompany {
	 public static void main(String[] args) {
			Car ac=new Car("ford", 180.15, 9988);
			Driver ad=new Driver("Chaman", 30);
			System.out.println(ad.driverName+" is a driver of car Id: "+"and Driver's name is :"+ac.carId+" "+ad.driverName+" and Car Name is: "+ac.carName+" and car speed is:"+ac.carSpeed);
		}

}
