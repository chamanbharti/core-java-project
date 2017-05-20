package Has_Relationship;

public class AssociationTest {
	 public static void main(String[] args) {
		AssociationCar ac=new AssociationCar("ford", 180.15, 9988);
		AssociationDriver ad=new AssociationDriver("Chaman", 30);
		System.out.println(ad.driverName+" is a driver of car Id: "+ac.carId);
	}
}
