package composition;

public class TestCar {
	public static void main(String[] args) {
		Maruti myMaruti=new Maruti();
		myMaruti.setColor("RED");
		myMaruti.setMaxSpeed(180);
		myMaruti.carInfo();
		
		myMaruti.MarutiStartDemo();
	}

}
