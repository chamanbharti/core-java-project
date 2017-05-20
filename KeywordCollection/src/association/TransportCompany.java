package association;

public class TransportCompany {
	public static void main(String[] args) {
		CarClass obj=new CarClass("Ford", 180.15, 9988);
		Driver obj2=new Driver("Andy", 45);
		System.out.println(obj2.driverName+" is a driver of car Id:"+obj.carId);
	}
}
